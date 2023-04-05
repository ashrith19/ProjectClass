Feature: Validation of Adactinhotel in Web application

Background:
Given User launch Adactinhotelapp in web apllication
    Then User verify Login page is displayed
    
  Scenario: TC01_Validation of Login page with valid username and valid password
    When User enter valid username and valid password
    And User click Login Button
    Then User verify home page is displayed
  Scenario: TC11_Validation of Search Hotel Page in adactin Hotel Application
  	 When User enter valid username and valid password
    And User click Login Button
    Then User verify home page is displayed
    When User enter valid Location,Hotel,roomType,CheckIN,checkOUT,Number of adult,Number of childern
    And User click Search Button
    Then User verify SearchHotel page will be displayed
  Scenario: TC12_Validation of Select Hotel page in adactin Hotel Application
 		 When User enter valid username and valid password
    And User click Login Button
    Then User verify home page is displayed
    When User enter valid Location,Hotel,roomType,CheckIN,checkOUT,Number of adult,Number of childern
    And User click Search Button
    Then User verify SearchHotel page will be displayed
    When User Select Radiobutton
    And User Select Continue Button
    Then User Verify BookingHotel page will be displayed
 Scenario: TC13_Validation of Booking page in Adactin Hotel Application
 		When User enter valid username and valid password
    And User click Login Button
    Then User verify home page is displayed
    When User enter valid Location,Hotel,roomType,CheckIN,checkOUT,Number of adult,Number of childern
    And User click Search Button
    Then User verify SearchHotel page will be displayed
    When User Select Radiobutton
    And User Select Continue Button
    Then User Verify BookingHotel page will be displayed
    When User Enter Correct FirstName,LastName,Address
    When User Enter Valid Credit card Number,card type,Expiry Date, Month and Year, Valid CVV
    And User click Book Button
    Then User Verify Order ID is displayed

  Scenario: TC02_Validation of Login page with Invalid username and valid password
    Given User launch Adactinhotelapp in web apllication
    When User enter Invalid username and valid password
    And User click Login Button
    Then User Verify Error Message is dipalyed

  Scenario: TC03_Validation of Login page with valid username and Invalid password
    Given User launch Adactinhotelapp in web apllication
    When User enter valid username and Invalid password
    And User click Login Button
    Then User Verify Error Message is dipalyed

  Scenario: TC04_Validation of Login Page With Invalid username and Invalid password
    Given User launch Adactinhotelapp in web apllication
    When User enter Invalid username and Invalid password
    And User click Login Button
    Then User Verify Error Message is displayed
