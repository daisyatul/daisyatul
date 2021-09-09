Feature: Change in the image using Color Feature


@change_Image
Scenario: User is able to change in the image using Color


Given user is ready for Login to http:Automationpractice.com by giving email as "John_demo@gmail.com" and password as "12345" and click on sign in
When user is ready to Selects the category as T-Shirts
When user Clicks on the product: Faded Short Sleeve T-shirts
When Click on Color Blue link
Then Check the Image is changed