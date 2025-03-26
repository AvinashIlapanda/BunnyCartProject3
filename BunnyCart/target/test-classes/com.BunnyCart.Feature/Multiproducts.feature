Feature:
Scenario: Add Multiple Products to cart
Scenario: To sign in and add a product to cart
Given User opens the Browser
And User navigates to the "https://www.bunnycart.com/aquatic-plants/duckweed" webpage
When User clicks on Sign in link
And User enters the Sign in credentials
|bunnycart data.xlsx|
And User clicks on Sign in button
And User search for a product "aquatic Plants"
And User select a product
And user selects  quantity of "Pack of 100 Stems"
And User add a product to cart
When User Search for product2 "Money Plant" in search textbox
And User click type of the product2
And User click on Add to cart for product2
And User verifies the products and close cart
And User close the browser

