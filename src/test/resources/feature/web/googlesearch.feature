Feature: Google search
  To allow a user to find urls using the google search
 
  Scenario: Search for diva-e
	Given user navigates to 'https://www.google.de'
	When user enters 'diva-e' in searchfield
	Then the text 'diva-e - Digital Value Enterprise' should appear in search result
	
  Scenario: Search for ageto
	Given user navigates to 'https://www.google.de'
	When user enters 'ageto' in searchfield
	Then the text 'SAP E-Commerce Spezialist: AGETO' should appear in search result