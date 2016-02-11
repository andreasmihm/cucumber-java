package com.divae.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Bookstore bs = new Bookstore();
        bs.loadBooks();
        System.out.println(bs.getBookByISBN("ISBN2").getTitle());
    }
}
