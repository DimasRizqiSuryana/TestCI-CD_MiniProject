Feature: Posts

  As an admin
  I want to see the posts
  So that I can request to the api endpoints

Scenario: POST - As an admin I have be able to create new category posts
Given I set POST category api endpoints
When I send POST category HTTP request
Then I receive valid HTTP response code 201
And I receive valid data for new category posts

Scenario: POST - As an admin I shouldn't be able to create new category posts with invalid url
Given I set typo POST category api endpoints
When I send typo POST HTTP request
Then I receive invalid HTTP response code 404 Not Found
And I receive nothing from the page