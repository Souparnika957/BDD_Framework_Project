Feature: Product Functionality

Background:
   Given User Logged in with valid credentials username "vishalkalal1994@gmail.com" and password "Demo1234567890"
   
 Scenario: Verify the navigation from Home Page to Product Page
   When User click on product page
   Then User should see the product page title
   
 Scenario: Search the product and get the number of products
   When User navigates to the Product page
   And User search for the "Tops"
   When User submits the search
   Then Get the number of images displayed
   
   

   

   
   
   