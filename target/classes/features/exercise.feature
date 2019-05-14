Feature: to run the given testcase


  @execute
  Scenario: ordering blue jeans from the webshop
    Given user is on the loginpage
    When the user enters the valid username and password and clicks login button
    Then login page should be displayed
    When the user is on loginpage and clicks apperal and shoe link
    Then Apparel and shoes page should be displayed
    When user selects the blue jeans
    Then blue jeans page details are displayed
    When user clicks on add to cart
    Then a popup should be displayed that jeans is added to cart
    When user clicks on shipping cart
    Then shipping cart page should be opened
    When User gives estimate shipping details and clicks on iagree checkbox and clicks on checkout button
    Then checkout page should be displayed
    When user clicks on continue in the billingaddress section
    Then it should go to next shipping address section
    When user clicks continue in the shipping address section
    Then it should go to shippingaddress section
    When in the shippingaddress user should select ground radio button
    And user clicks on continue
    Then it should go to payment method section
    When user selects creditcard and clicks continue
    Then user should go to payment information section
    When user enters the card details and clicks on continue
    Then user should go to confirm order section
    When user clicks on continue in the confirm order section
    Then order is sucessful message should be displayed
    When user clicks on the continue below the sucessful meaasge
    Then user should be directed to homepage
    When user clicks on the logoutlink
    Then demowebshop homepage should be displayed
