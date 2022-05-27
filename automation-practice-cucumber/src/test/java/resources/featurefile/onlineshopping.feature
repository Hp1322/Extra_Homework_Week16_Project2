
Feature: Create account Test
  As a User I want to create account in automation website
  @test01
  Scenario: Create New User SignUp
    Given I am on home page
    Then Navigate to SignUp page
    And create an account with random username

    @test02
  Scenario: Sign In with newly created user credentials
    Given I am on the Sign In Page
    When Login using newly create credentials
    Then I shall verify the address information in my address section

      @test03
      Scenario: TC-003 Add product to Online Cart and checkout
        Given I am on the Sign In Page
        When Login using newly create credentials
        And I add below product to cart
#          | category | subCategory    | name                        | model  | quantity |
          | Dresses  | CASUAL DRESSES | Printed Dress               | demo_3 | 2        |
          | Women    | TOPS           | Faded Short Sleeve T-shirts | demo_1 | 3        |
        Then I shall validate shopping cart as below
#          | name                        | model        | quantity |
          | Printed Dress               | SKU : demo_3 | 2        |
          | Faded Short Sleeve T-shirts | SKU : demo_1 | 3        |
        Then I shall be able to Buy the product
        And I shall be able to Buy using cheque payment

  @test04
  Scenario: Sign In with newly created user credentials
    Given I am on the Sign In Page
    When Login using newly create credentials
    And I am on the contact page
    Then I send refund request to customer care for previous order

