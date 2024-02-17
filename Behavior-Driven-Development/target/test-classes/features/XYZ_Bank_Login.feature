Feature: BankingProject - Perform test simulation on web site www.globalsqa.com

  Background: 
  Given User Opens chrome browser and launch url "APP_URL"
    
  @Sanity
  Scenario: TC01 Verify the XYZ Bank Home Page Elements are avaialble to intract
    When User displayed with "Bank_Name"
    Then User verify web element "Home_Button" is present
    Then User verify web element "CustomerLogin_Button" is present
    Then User verify web element "BankManagerLogin_Button" is present
    And User captutres screenprints "TC01_HOME_PAGE"

  @Regression @Sanity
  Scenario Outline: <testcase> Verify the XYZ Bank customer Login as - <Name>
    When User displayed with "Bank_Name"
    And User verify web element "Home_Button" is present
    When User clicks on "<Login_Buttoms>"
    And User displayed with "LoginAs_Label"
    And User selects "<Name>" from dropdown "CustomerLoginName_Dropdown"
    When User clicks on "Login_Button"
    Then User verify web page contains the text "<Name>"
    And User captutres screenprints "<testcase>_LOGIN_USER"
  Examples:
    |Login_Buttoms            |Name        |testcase|
    |CustomerLogin_Button     |Harry Potter|TC02    |
    |CustomerLogin_Button     |Ron Weasly  |TC03    |



