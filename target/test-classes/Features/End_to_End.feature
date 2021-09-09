Feature: End To End User Journey Feature

  @End
Scenario: User is able to do end to end journey
Given Login to http:automationpractice.com by click on sign in and add as Email as "John_demo@gmail.com" and password as "12345"
When User Select the category as T-Shirts
When User Select the category as T-Shirts product  Faded Short Sleeve T-shirts
When user Fetch the Amount of the product in a variable
When increase Quantity to 2
    When Increase Size to L
  When user Click on Add to Cart
 Then Check the User sees the Pop Up: Product Successfully Added to Cart
  Then Check the Quantity and Color
  Then Check Total Price is twice the amount fetched earlier.
 When Click on Proceed to Checkout.
 Then Check the User sees the product name
  Then Availability as Instock
  Then Unit Price equal to what was captured previously
  Then Quantity to what was set earlier
  Then Check the Total is equal to twice the amount with $ 2 for shipping
  When Click on Proceed to Check out again and reach till payment and click on Terms and condition check box
  When On Payment Page click on Pay by bank wire and Click on I confirm my Order
  Then Check the order submit page and message "Your order on My Store is complete." also check is amount is right.