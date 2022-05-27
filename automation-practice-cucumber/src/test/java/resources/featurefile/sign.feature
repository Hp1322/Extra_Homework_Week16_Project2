
Feature: Sign in page Test
  As a User I want to sign into automation website


  Scenario: User Should Navigate To Sign In Page SuccessFully
    Given I am on homepage
    When I click on sign in link
    Then I should see the authentication page


  Scenario Outline: Verify The Error Message With InValid Credentials
    Given I am on homepage
    When I click on sign in link
    And I enter "<user_name>" in user name field
    And I enter "<password>" in password field
    And I click on sign in button
    Then I should see the "<message>" on page

    Examples:
      | user_name      | password | message                    |
      |                | 123456   | An email address required. |
      | abcd@gmail.com |          | Password is required.      |
      | adfdfgfg       | 123456   | Invalid email address.     |
      | abcd@gmail.com | 123456   | Authentication failed.     |

  Scenario: Verify That User Should Log In SuccessFully With Valid Credentials
    Given I am on homepage
    When I click on sign in link
    And I enter email "ram1123@gmail.com" to email field
    And I enter password "123456" to password field
    And I click on sign in button
    Then I should see sign out page


  Scenario: Verify That User Should LogOut SuccessFully
    Given I am on homepage
    When I click on sign in link
    And I enter email "ram1123@gmail.com" to email field
    And I enter password "123456" to password field
    And I click on sign in button
    And I click on sign out link
    Then I should see sign in page