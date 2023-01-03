Feature: book the flight

  Scenario Outline: book the flight with different scenario
    #When launch the browser with
    #Then enter the url
    Then enter starting point "<start>"
    #Then click on the element
    Then enter the dest "<dest>"
    #Then enter the seat "<seat>"

    Examples: 
      | start |dest|
      | pune  |mumbai|
      #| nagpur | delhi  |    9 |
