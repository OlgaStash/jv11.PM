package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    Product[] product = new Product[]{};
    Book book1 = new Book(8, "Оно", 2000, "Стивен Кинг");
    Smartphone smartphone1 = new Smartphone(4, "S-987", 10000, "Samsung");

    @Test
    public void shouldMatchName() {
        boolean actual = book1.matches("Оно");
        assertTrue(actual);
    }
}