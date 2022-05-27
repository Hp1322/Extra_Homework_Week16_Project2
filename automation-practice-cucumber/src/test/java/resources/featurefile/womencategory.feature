
Feature: Women category page Test
  As a User I want to check women category on automation website

  Scenario: Verify User Should Navigate To Women Category PageSuccessfully
    Given I am on homepage
    When I click on women link
    Then I should see the women page


  Scenario Outline: Verify User Should Add Product To The Cart Successfully
    Given I am on homepage
    When I click on women link
    And  I select "<product>" product
    And I clear quantity from product box
    And I add "<quantity>" quantity
    And I select "<size>" size from size dropdown
    And I select "<colour>" colour
    And I click on add to cart button
    And I should see successfully message
    Then I click on cross sign

    Examples:
      | product                                | quantity | size | colour |
      | Blouse                                 | 2        | M    | White  |
      | Printed Dress                          | 3        | L    | Orange |
      | Printed Chiffon Dress                  | 4        | S    | Green  |
      | Printed Summer Dress with Price $28.98 | 2        | M    | Blue   |