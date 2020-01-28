package com.alextym.task06;

import java.util.Arrays;

public class Books {
    private int i;
    private int count = 0;
    private Book[] books;
    private Book[] search;

    public Books(int i) {
        this.i = i;
        books = new Book[i];
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void addBook(Book book) {
        if (books[count] == null) {
            books[count] = book;
        }
        count++;
    }

    public void printBooks() {
        for (Book elem : books) {
            elem.view();
        }
    }

    public Book[] changePrice(int x) {
        Book[] newPriceBooks = new Book[books.length];
        for (int i = 0; i < books.length; i++) {
            int oldPrice = books[i].getPrice();
            int newPrice = oldPrice * (100 + x) / 100;
            books[i].setPrice(newPrice);
        }
        return newPriceBooks;
    }

    public Book[] searchBookAuthor(String str) {
        Book[] search = new Book[books.length];
        int count = 0;
        for (Book elem : books) {
            if (elem.getAuthor().equals(str)) {
                search[count] = elem;
                count++;
            }else{
                System.out.println("Извините, книги данного автора не найдены");
                break;
            }
        }
        return Arrays.copyOf(search, count);
    }

    public Book[] searchBookYear(int y) {
        Book[] search = new Book[books.length];
        int count = 0;
        for (Book elem : books) {
            if (elem.getYear() > y) {
                search[count] = elem;
                count++;
            }
            else{
                System.out.println("Извините, книги за указанный период не найдены");
                break;
            }
        }
        return Arrays.copyOf(search, count);
    }

}
