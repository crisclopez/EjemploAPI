Feature: i as user need to consume api


  @scenario1
  Scenario: consume api
    When the user consume the information
    Then the user will see the reponse 200


  @validateInformation
  Scenario Outline: consult api an user
    When the user consults the information
    Then the user should validate information
      | id   | name   | email   |
      | <id> | <name> | <email> |


    Examples:
      | id | name         | email             |
      | 2  | Ervin Howell | Shanna@melissa.tv |
      | 2  | Ervin Howell | Shanna@melissa.tv |
      | 2  | Ervin Howell | Shanna@melissa.tv |
