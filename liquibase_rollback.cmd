echo roll back your database to tag version 1.0
mvn liquibase:rollback -Dliquibase.rollbackTag=1.0

echo roll back your database to rollbackCount=1
mvn liquibase:rollback -Dliquibase.rollbackCount=1

echo roll back your database to rollbackDate
mvn liquibase:rollback "-Dliquibase.rollbackDate=Jan 28, 2020"