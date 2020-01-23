echo roll back your database to version 1.0
mvn liquibase:rollback -Dliquibase.rollbackTag=1.0