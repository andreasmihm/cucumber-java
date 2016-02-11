package feature.book;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.divae.app.Book;
import com.divae.app.Bookstore;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 
public class BookSearchSteps {
	Bookstore bs = new Bookstore();
	private Book book;
 
	@Given("^.+book with the title '(.+)', written by '(.+)', with isbn '(.+)'")
	public void a_book_with_the_title_One_good_book_written_by_Anonymous_with_isbn_ISBN(final String title, final String author, final String isbn) throws Throwable {
		bs.addBook(isbn, author, title);
	}


	@When("^the customer searches for the book with isbn '(.+)'")
	public void the_customer_searches_for_the_book_with_isbn_ISBN(final String isbn) throws Throwable {
		book = bs.getBookByISBN(isbn);
	}

	@Then("^(\\d+) book should have been found$")
	public void book_should_have_been_found(int booksFound) throws Throwable {
		if (booksFound == 1) 
			assertNotNull(book);
		else if (booksFound == 0)
			assertNull(book);
	}

	@Then("^it should have the title '(.+)'$")
	public void it_should_have_the_title_How_to_cook_a_dino(String title) throws Throwable {
		assertThat(book.getTitle(), equalTo(title));
	}
	
}