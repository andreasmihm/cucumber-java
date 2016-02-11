Feature: Book search
  To allow a customer to find his books, the library must at least offer search for a book by isbn.
 
  Scenario: Search books by isbn ISBN12
    Given a book with the title 'One good book', written by 'Anonymous', with isbn 'ISBN10'
      And another book with the title 'Some other book', written by 'Tim Tomson', with isbn 'ISBN11'
      And another book with the title 'How to cook a dino', written by 'Fred Flintstone', with isbn 'ISBN12'
    When the customer searches for the book with isbn 'ISBN12'
    Then 1 book should have been found
      And it should have the title 'How to cook a dino'
      
  Scenario: Search books by isbn ISBN10
    Given a book with the title 'One good book', written by 'Anonymous', with isbn 'ISBN10'
      And another book with the title 'Some other book', written by 'Tim Tomson', with isbn 'ISBN11'
      And another book with the title 'How to cook a dino', written by 'Fred Flintstone', with isbn 'ISBN12'
    When the customer searches for the book with isbn 'ISBN10'
    Then 1 book should have been found
      And it should have the title 'One good book'
      
Scenario: Search books by isbn ISBN15
    Given a book with the title 'One good book', written by 'Anonymous', with isbn 'ISBN10'
      And another book with the title 'Some other book', written by 'Tim Tomson', with isbn 'ISBN11'
      And another book with the title 'How to cook a dino', written by 'Fred Flintstone', with isbn 'ISBN12'
    When the customer searches for the book with isbn 'ISBN15'
    Then 0 book should have been found