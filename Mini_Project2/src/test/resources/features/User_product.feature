Feature: Posts

  As an admin
  I want to see the posts
  So that I can request to the api endpoints

  Scenario: GET - As an admin I have be able to see posts number 1
    Given I set GET api endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200


  Scenario: GET - As an admin I shouldn't be able to see posts with invalid url
    Given I set typo GET api endpoints
    When I send typo GET HTTP request
    Then I receive invalid HTTP response code 404 Not Found
    And I receive nothing from the page

  Scenario: POST - As an admin I have be able to create new posts
    Given I set POST api endpoints
    When I send POST HTTP request
    Then I receive valid HTTP response code 201
    And I receive valid data for new posts

  Scenario: POST - As an admin I shouldn't be able to create new posts with invalid url
    Given I set typo POST api endpoints
    When I send typo POST HTTP request
    Then I receive invalid HTTP response code 404 Not Found
    And I receive nothing from the page

  Scenario: DELETE - As admin I have be able to delete existing posts
    Given I set DELETE api endpoints
    When I send DELETE HTTP request
    Then I receive valid HTTP response code 200

  Scenario: DELETE - As admin I shouldn't be able to delete without input which posts
    Given I set DELETE to invalid api endpoints
    When I send DELETE Invalid HTTP request
    Then I receive invalid HTTP response code 405 Not Found
    And I receive nothing from the page