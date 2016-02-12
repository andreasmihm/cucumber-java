Feature: Google search
  To allow a user to find urls using the google search
 
  Scenario: Search for diva-e
	Given user navigates to 'https://www.google.de'
	When user enters 'diva-e' in searchfield
	Then the text 'diva-e - Digital Value Enterprize' should appear in search result