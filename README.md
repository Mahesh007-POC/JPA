This is  Maven Module based project.Project consists of JPA REST API which publish data to h2 hibernate database.

do Maven Build before running project.

REST API consists of endpoints.
1. "/courses" GET call.
  . To get all courses available from h2 hibernate DB.
 
 2. "/course" POST call.
  .To create/update a course into h2 hibernate DB.
  
  
  
 h2 hibernate DB is inmemory based DB and stored all data in local machiene.Data and tables are refreshed once application
 is restarted/stop.
 Immemory db consists of many typees and can be changed in property file "src/main/resources/application.properties".
 Currently data is persisted event though application is restarted/stop.This behaviour can be altered with in properties file.
