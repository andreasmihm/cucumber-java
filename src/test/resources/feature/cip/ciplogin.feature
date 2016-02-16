Feature: CIP test
  to allow a user to use the CIP demo frontend
 
  Scenario: login to CIP
	Given user navigates to 'https://cz-dev-dev1.boreus.de:446/INTERSHOP/web/BOS/PrimeTech-PrimeTechBusiness-Site/en_US/-/USD/ViewUserAccount-ShowLogin'
	When user enters 'a.mihm@ageto.de' in input with id 'ShopLoginForm_Login'
	And user enters 'Qwertz1!' in input with id 'ShopLoginForm_Password'
	And user clicks on button with xpath '//*[@id="login-user-form"]/div[3]/button'
	Then the text 'Overview' should appear in element with xpath '/html/body/div[1]/div[2]/div[1]/ol/li[3]'
	# click homepage
	And user clicks on link with xpath '/html/body/div[1]/div[1]/div[4]/a'
	# click on 1st product in caroussel
	And user clicks on link with xpath '/html/body/div[1]/div[2]/div[4]/div/div/div/div/ul/li[1]/div/a/span[3]'
	Then the text 'A-DATA CH94 Portable 640GB' should appear in element with xpath '/html/body/div[1]/div[2]/div[1]/div[4]/div/h1'
	# click addToCart
	And user clicks on button with xpath '/html/body/div[1]/div[2]/div/div[4]/div/form/div[4]/button'
	Then the text 'Your Shopping Cart' should appear in element with xpath '/html/body/div[1]/div[2]/div/div[1]/div/h1'
	# check if product appears in cart
	And the text 'A-DATA CH94 Portable 640GB' should appear in element with xpath '/html/body/div[1]/div[2]/div/div[2]/div[1]/form/div[2]/div/table/tbody/tr/td[3]/div[1]/a'
	
	
#  Scenario: login to CIP
#	Given user navigates to 'https://cz-dev-dev1.boreus.de:446/INTERSHOP/web/BOS/PrimeTech-PrimeTechBusiness-Site/en_US/-/USD/ViewUserAccount-ShowLogin'
#	When user enters 'a.mihm@ageto.de' in input with id 'ShopLoginForm_Login'
#	And user enters 'gfhgfhfhg' in input with id 'ShopLoginForm_Password'
#	And user clicks on button with xpath '//*[@id="login-user-form"]/div[3]/button'
#	Then the text 'incorrect' should appear in element with xpath '/html/body/div[1]/div[2]/div[2]/div[1]/div/div'