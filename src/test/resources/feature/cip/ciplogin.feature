Feature: CIP test
  to allow a user to use the CIP demo frontend
 
@ignore
  Scenario: login to CIP
	Given user navigates to 'https://cz-dev-dev1.boreus.de:446/INTERSHOP/web/BOS/PrimeTech-PrimeTechBusiness-Site/en_US/-/USD/ViewUserAccount-ShowLogin'
	When user enters 'a.mihm@ageto.de' in input with id 'ShopLoginForm_Login'
	And user enters '!InterShop00!' in input with id 'ShopLoginForm_Password'
	And user clicks on button 'SignIn_On_LoginPage'
	Then the text 'Overview' should appear in element 'Header_On_MyAccount'
	# click homepage
	And user clicks on link 'ZeissLogo'
	# click on 1st product in caroussel
	And user clicks on link '1st_product_in_caroussel'
	Then the text 'A-DATA CH94 Portable 640GB' should appear in element 'ProductTitle_On_ProductDetail'
	# click addToCart
	And user clicks on button 'AddToCart_On_ProductDetail'
	Then the text 'Your Shopping Cart' should appear in element 'Title_On_Cart'
	# check if product appears in cart
	And the text 'A-DATA CH94 Portable 640GB' should appear in element 'FirstProductTitle_On_Cart'
	
@ignore
  Scenario: login to CIP
	Given user navigates to 'https://cz-dev-dev1.boreus.de:446/INTERSHOP/web/BOS/PrimeTech-PrimeTechBusiness-Site/en_US/-/USD/ViewUserAccount-ShowLogin'
	When user enters 'a.mihm@ageto.de' in input with id 'ShopLoginForm_Login'
	And user enters 'gfhgfhfhg' in input with id 'ShopLoginForm_Password'
	And user clicks on button 'SignIn_On_LoginPage'
	Then the text 'incorrect' should appear in element 'Warning_On_LoginPage'