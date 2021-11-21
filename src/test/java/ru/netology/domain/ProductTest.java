package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    Product[] product = new Product[]{};
    Book book1 = new Book(8, "Оно", 2000, "Стивен Кинг");
    Smartphone smartphone1 = new Smartphone(4, "S-987", 10000, "Samsung");

    @Test
    public void shouldMatchNameBook() {
        boolean actual = book1.matches("Оно");
        assertTrue(actual);
    }

    @Test
    public void shouldMatchAuthor() {
        boolean actual = book1.matches("Стивен Кинг");
        assertTrue(actual);
    }

    @Test
    public void shouldMatchNameSmartphone() {
        boolean actual = smartphone1.matches("S-987");
        assertTrue(actual);
    }

    @Test
    public void shouldMatchProducer() {
        boolean actual = smartphone1.matches("Samsung");
        assertTrue(actual);
    }
}