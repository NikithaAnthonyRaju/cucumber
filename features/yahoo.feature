Feature: Yahoo File

  Scenario Outline: Search for Apples in Yahoo.
    Given Open Chrome AND navigate to Yahoo
    When Enter "<Apples>" Keyword
    Then Click on Yahoo Search button

    Examples: 
      | Apples        |
      | Ooty Apple    |
      | Kashmir Apple |
