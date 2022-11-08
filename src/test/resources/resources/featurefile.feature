Feature: Testing functionality of html form

  
  Scenario: Testing the submission of story
    Given I am on the webpage
    When I enter the  name
    When I enter the  address
    When I enter the story
    When I click on the submit button
    Then The next page should be displayed
    And  Close the webpage
    
    
   Scenario: Verifying the length limitation of the textboxes
    Given I am on the webpage
    Then  I check the max length of name 
    Then  I check the max length of address
    Then  I check the max length of story
    And Close the webpage
    
    
   Scenario Outline: Verifying the pattern of the textboxes
    Given I am on the webpage
    When I enter the  name as "<name>" 
    When I enter the  address as "<address>" 
    When I enter the story as "<story>" 
    When I click on the submit button 
    Then Check if valid input or missing fields or pattern mismatch
    And  Close the webpage
    
    Examples: 
      | name                | address            | story       |
      | Skywalker///        |     Tatooine       | Jedis tale  |
      | Djarin              |     Mandalore////  | Mandalorian |
      | Grogu               |     Mandalore      | Mandalorian |
    
    
    
    
    
    
   
    
    
 
    
