Feature: Posts

  As an admin
  I want to see the posts
  So that I can request to the api endpoints

  Scenario: POST - As an admin I have be able to create new posts rating
    When I send POST rating HTTP request
    Then I receive valid HTTP response code 201
    Given I set POST rating api endpoints


  Scenario: POST - As an admin I shouldn't be able to create new posts rating with invalid url
    Given I set typo POST rating api endpoints
    When I send typo POST rating HTTP request
    Then I receive invalid HTTP response code 404 Not Found
    And I receive nothing from the page

  Scenario: GET - As an admin I have be able to see posts rating number 1
    Given I set GET rating api endpoints
    When I send GET rating HTTP request
    Then I receive valid HTTP response code 200
    And  I receive valid data for all of the posts rating


  Scenario: GET - As an admin I shouldn't be able to see posts rating with invalid url
    Given I set typo GET rating api endpoints
    When I send typo GET rating HTTP request
    Then I receive invalid HTTP response code 404 Not Found
    And I receive nothing from the page

  Scenario: POST - As an admin I have be able to create new posts comment
    When I send POST commant HTTP request
    Then I receive valid HTTP response code 201
    Given I set POST commant api endpoints


  Scenario: POST - As an admin I shouldn't be able to create new posts commant with invalid url
    Given I set typo POST commant api endpoints
    When I send typo POST HTTP request
    Then I receive invalid HTTP response code 404 Not Found
    And I receive nothing from the page