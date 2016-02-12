Feature: CIP test
  to allow a user to use the CIP demo frontend
 
  Scenario: login to CIP
	Given user navigates to 'https://cz-dev-dev1.boreus.de:446/INTERSHOP/web/BOS/PrimeTech-PrimeTechBusiness-Site/en_US/-/USD/ViewUserAccount-ShowLogin'
	When user enters 'a.mihm@ageto.de' in input with id 'ShopLoginForm_Login'
	And user enters 'Qwertz1!' in input with id 'ShopLoginForm_Password'
	And user clicks on button with xpath '//*[@id="login-user-form"]/div[3]/button'
	Then the text 'Overview' should appear in element with xpath '/html/body/div[1]/div[2]/div[1]/ol/li[3]'