 Feature: Need to develope a HelloWorld Java application

  Scenario: The application should be able to greet a user .
  
     Given there is a hello object
     When I invoke the sayHello method
     Then I expect "Hello" as the response