Feature: SMB76 testing
  to test the smb frontend of the is76
 
  Scenario: login and add product to cart
	Given user navigates to 'https://jxdemoserver.intershop.de/INTERSHOP/web/WFS/inSPIRED-inTRONICS_Business-Site/en_US/-/USD/ViewUserAccount-ShowLogin'
	When user enters 'a.mihm@ageto.de' in input with id 'ShopLoginForm_Login'
	And user enters '!InterShop00!' in input with id 'ShopLoginForm_Password'
	And user clicks on button 'SignIn_On_LoginPage'
	Then the text 'OVERVIEW' should appear in element 'Header_On_MyAccount'
	# click homepage
	And user clicks on link 'Home'
	# click on 1st product in caroussel
	And user clicks on link '1st_product_in_caroussel'
	Then the text 'A-DATA 120GB S510' should appear in element 'ProductTitle_On_ProductDetail'
	# click addToCart
	And user clicks on button 'AddToCart_On_ProductDetail'
	Then the text 'YOUR SHOPPING CART' should appear in element 'Title_On_Cart'
	# check if product appears in cart
	And the text 'A-DATA 120GB S510' should appear in element 'FirstProductTitle_On_Cart'
	
	
  Scenario: test false login attempt
	Given user navigates to 'https://jxdemoserver.intershop.de/INTERSHOP/web/WFS/inSPIRED-inTRONICS_Business-Site/en_US/-/USD/ViewUserAccount-ShowLogin'
	When user enters 'a.mihm@ageto.de' in input with id 'ShopLoginForm_Login'
	And user enters 'gfhgfhfhg' in input with id 'ShopLoginForm_Password'
	And user clicks on button 'SignIn_On_LoginPage'
	Then the text 'incorrect' should appear in element 'Warning_On_LoginPage'