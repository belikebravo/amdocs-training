Feature: Develope a hello SOAP WEB Service.

  Scenario: As a end-user I Should be able to innvoke hello SOAP API
  Given the hello soap apiis up and running
  When I invoke the soap api at url "http://localhost:8080/hello?wsd"
  Then I expect the response "Hello SOAP WebService!"
  