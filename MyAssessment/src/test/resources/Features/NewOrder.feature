Feature: Placinng an order on the online store 
  Scenario: User placing an online order 
    Given The user has the baseURL "https://demowebshop.tricentis.com/" and browser "chrome"
    When The user click register button
    Then user select their gender "Male"
    Then user enter first name "Bheki"
    Then user enter last name "Dlomo"
    Then User enter email address "dlomo.dlomo@xetgroup.com"
    Then User enter password "P@ssw0rd1"
    Then User enter confirm password "P@ssw0rd1"
    Then user click register button
    Then user click continue button
    Then user click logout button
    When The user click login link button
    Then user enter username "dlomo.dlomo@xetgroup.com"
    Then user enter Login password "P@ssw0rd1"
    Then user click login
    Then user click computer
    Then user click desktop
    Then user click build your own cheap computer
    Then user click add to cart
    Then user click shopping cart
    Then user select "South Africa" on the drop down
    Then user click terms
    Then user click checkout
    Then user select shiping address "South Africa" on the drop down
    Then user enter city "Midrand"
    Then user enter address one "391 etude, 51 Mozart lane"
    Then user enter zipcode "1683"
    Then user enter phone "0798585464"
    Then user click button continue
    Then user click button in store pickup
    Then user click button continue pickup
    Then user click button continue payment method
    Then user click button continue payment info
    Then user click button continue confirm order
    Then user click button continue Thank you   