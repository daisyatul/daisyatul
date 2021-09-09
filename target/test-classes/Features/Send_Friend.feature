Feature: Send Friend feature
  @t
Scenario: User able to send friend
  Given User opened browser http:automationpractice.com
  And User navigated to application automation url
  When  User click on  button sign in
  When user enters Email id as "John_demo@gmail.com" and password as "12345" click on Sign in
  When Select the category as T-Shirts
  When Click on the product: Faded Short Sleeve T-shirts
  When Click Send to a Friend, fill the details as name of your friend as "Dolly" and Email Address of your friend as "Dolly_demo@gmail.com" and click on Send.
  Then Check the Message appeared that Email sent in a pop up.


















