Feature: Write a Review Feature
@write_review
  Scenario: User is able to write a Review

Given Login to http:Automationpractice.com
  When user clicks on sign in button and enters email as "John_demo@gmail.com" and password as "12345"
When user click on the category as T-Shirts
When user Click on the product: Faded Short Sleeve T-shirts
When Click on Send a Review and enter the title as "Faded Short Sleeve T-shirts" and comments as "Product is very good" and click on send button
Then Check the Message appeared that New comment added.




























