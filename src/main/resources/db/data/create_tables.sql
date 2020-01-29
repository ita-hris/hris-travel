CREATE TABLE IF NOT EXISTS employee_role
(
    id serial NOT NULL,
    name text NOT NULL,
    PRIMARY KEY (id)
);
COMMENT ON TABLE employee_role IS 'employee role in department';

CREATE TABLE IF NOT EXISTS organization
(
    id serial NOT NULL,
    name text NOT NULL UNIQUE,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS department
(
    id serial NOT NULL,
    name text NOT NULL,
    organization_id integer NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (organization_id)
    REFERENCES organization (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
);

CREATE TABLE IF NOT EXISTS employee
(
    id bigserial NOT NULL,
    name text NOT NULL,
    surname text NOT NULL,
    department_id integer NOT NULL,
    employee_role_id integer NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (department_id)
    REFERENCES department (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION,
    FOREIGN KEY (employee_role_id)
    REFERENCES employee_role (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
);

CREATE TABLE IF NOT EXISTS country
(
    id serial NOT NULL,
    name text NOT NULL UNIQUE,
    code character(3) NOT NULL UNIQUE,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS travel
(
    id bigserial NOT NULL,
    employee_id bigint,
    country_id integer NOT NULL,
    comment text,
    date_from timestamp with time zone,
    date_to timestamp with time zone,
    PRIMARY KEY (id),
    FOREIGN KEY (employee_id)
    REFERENCES employee (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION,
    FOREIGN KEY (country_id)
    REFERENCES country (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
);
COMMENT ON TABLE travel IS 'Table include information about employee and country in future trip and period of date';

CREATE TABLE IF NOT EXISTS type_expense
(
    id serial NOT NULL,
    name text NOT NULL UNIQUE,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS approve_status_expense
(
    id serial NOT NULL,
    name text NOT NULL UNIQUE,
    PRIMARY KEY (id)
);


CREATE TABLE IF NOT EXISTS bill
(
    id bigint NOT NULL,
    image_url text NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS currency
(
    id serial NOT NULL,
    name text NOT NULL UNIQUE,
    code character(3) NOT NULL UNIQUE,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS travel_expense
(
    id bigint NOT NULL,
    amount money NOT NULL,
    date timestamp with time zone NOT NULL,
    comment text,
    travel_id bigint NOT NULL,
    type_expense_id integer NOT NULL,
    currency_id integer NOT NULL,
    bill_id bigint,
    PRIMARY KEY (id),
    FOREIGN KEY (travel_id)
    REFERENCES travel (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION,
    FOREIGN KEY (type_expense_id)
    REFERENCES type_expense (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION,
    FOREIGN KEY (currency_id)
    REFERENCES currency (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION,
    FOREIGN KEY (bill_id)
    REFERENCES bill (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE CASCADE
);
COMMENT ON TABLE travel_expense IS 'Table include information about travel expense: type of expense, amount of expense, date and type of currency';

CREATE TABLE IF NOT EXISTS currency_rate
(
    id bigint NOT NULL,
    rate money NOT NULL,
    currency_from_id integer NOT NULL,
    currency_to_id integer NOT NULL,
    date timestamp with time zone NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (currency_from_id)
    REFERENCES currency (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION,
    FOREIGN KEY (currency_to_id)
    REFERENCES currency (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
);
COMMENT ON TABLE currency_rate IS 'Table store currency rate for convertation in local currency';

CREATE TABLE IF NOT EXISTS visa_type
(
    id serial NOT NULL,
    name text NOT NULL UNIQUE,
    PRIMARY KEY (id)
);
COMMENT ON TABLE visa_type IS 'Visa type defines visa use for';

CREATE TABLE IF NOT EXISTS visa_template
(
    id serial NOT NULL,
    name text NOT NULL,
    PRIMARY KEY (id)
);
COMMENT ON TABLE visa_template IS 'Template visa which filling for sending in visa embassy';

CREATE TABLE IF NOT EXISTS visa_request
(
    id bigint NOT NULL,
    filling_date timestamp with time zone,
    date_from timestamp with time zone,
    date_to timestamp with time zone,
    employee_id bigint,
    visa_type_id integer NOT NULL,
    visa_template_id integer NOT NULL,
    comment text,
    PRIMARY KEY (id),
    FOREIGN KEY (employee_id)
    REFERENCES employee (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION,
    FOREIGN KEY (visa_type_id)
    REFERENCES visa_type (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION,
    FOREIGN KEY (visa_template_id)
    REFERENCES visa_template (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
);
COMMENT ON TABLE visa_request IS 'Table store information about application visa and valid term for use of a future visa';

CREATE TABLE IF NOT EXISTS approve_travel_expense
(
    id bigserial NOT NULL,
    creation_date timestamp with time zone NOT NULL,
    decision_date timestamp with time zone NOT NULL,
    approver_id bigint NOT NULL,
    approve_status_expense_id integer NOT NULL,
    travel_expense_id bigint NOT NULL,
    comment text,
    PRIMARY KEY (id),
    FOREIGN KEY (approver_id)
    REFERENCES employee (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION,
    FOREIGN KEY (approve_status_expense_id)
    REFERENCES approve_status_expense (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION,
    FOREIGN KEY (travel_expense_id)
    REFERENCES travel_expense (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
);
COMMENT ON TABLE approve_travel_expense IS 'Information about travel expense and decision about this expense';

CREATE SEQUENCE IF NOT EXISTS bill_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;
ALTER TABLE bill
    ALTER COLUMN id SET DEFAULT nextval('bill_id_seq'::regclass);

CREATE SEQUENCE travel_expense_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;
ALTER TABLE travel_expense
    ALTER COLUMN id SET DEFAULT nextval('travel_expense_id_seq'::regclass);

CREATE SEQUENCE visa_request_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;
ALTER TABLE visa_request
    ALTER COLUMN id SET DEFAULT nextval('visa_request_id_seq'::regclass);

CREATE SEQUENCE currency_rate_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;
ALTER TABLE currency_rate
    ALTER COLUMN id SET DEFAULT nextval('currency_rate_id_seq'::regclass);