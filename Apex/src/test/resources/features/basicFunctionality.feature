Feature: Search on Amazon
@login
  Scenario Outline: searching for movies on amazon

    Given user goes to amazon page
    Then user try to search for different <movies>
    Examples:
    |movies|
    |"Titanic"|
    |"Shrek"  |
    |"Cinderella"|




