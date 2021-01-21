package ru.job4j.oop.pojo;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LibraryTest {
    @Test
    public void whenLastNull() {
        Book[] books = new Book[5];
        books[0] = new Book("Java", 10);
        books[1] = new Book("Python", 4);
        books[2] = new Book("Kotlin", 19);
        int rsl = Library.indexOfNull(books);
        assertThat(rsl, is(3));
    }

    @Test
    public void whenFirstNull() {
        Book[] books = new Book[5];
        books[1] = new Book("Java", 10);
        int rsl = Library.indexOfNull(books);
        assertThat(rsl, is(0));
    }

    @Test
    public void whenHasNotNull() {
        Book[] products = new Book[1];
        products[0] = new Book("Java", 10);
        int rsl = Library.indexOfNull(products);
        assertThat(rsl, is(-1));
    }
}