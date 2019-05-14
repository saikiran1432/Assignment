Feature: to click on the mentioned links

@execute
  Scenario: to click on the links
    Given user is on the homepage
    When user clicks on the books links
    Then demo webshop books page should be opened
    When user clicks on the computer links
    Then demo webshop computer page should be opened
    When user clicks on the electronics links
    Then demo webshop electronics page should be opened
    When user clicks on the apparel and shoes links
    Then demo webshop apparel and shoes page should be opened
    When user clicks on the digital downloads links
    Then demo webshop digital downloads page should be opened
    When user clicks on the jewellery links
    Then demo webshop jewellery page should be opened
    When user clicks on the gift cards links
    Then demo webshop gift cards page should be openeds