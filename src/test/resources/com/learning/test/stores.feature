Feature: Authentication
  
 #Scenario: Successfully logging in
 #  Given the Symbiote home page "https://symbiote-app.herokuapp.com" on "chrome"
 #  When logging in as an admin
 #  Then the home page navigation is available
 #
@login
  Scenario: Successfully logging in
    Given the Symbiote home page "https://symbiote-app.herokuapp.com" on "phantomjs"
    When logging in as an admin with details
      | username | password |
      | admin    | admin    |
    Then the home page navigation is available
	
#  Scenario: logging in with user name & password
#    Given Given the Symbiote home page "https://symbiote-app.herokuapp.com" on "Chrome"
#    And I enter username as "admin" in symbiote
#    When I enter password as "admin" in symbiote
#    Then I click on loginbutton in symbiote
#
#  Scenario Outline: Successfully logging in via mozilla & chrome
#    Given the Symbiote home page "https://symbiote-app.herokuapp.com" on "<browser>"
#    And logging in as an admin
#    Then the home page navigation is available
#    Examples: 
#      | browser   |
#      | chrome    |
#      | htmlunit  |
#      | firefox   |
#      | phantomjs |