#Author: sai-kiran.vidagoti@Capgemini.com
Feature: Conference room Booking
  
  @execute
  Scenario: User will try to book conference room with invalid set of information
    Given User is on login page
    When valid user name and password are given and clicks on login
    Then Login page should be displayed

