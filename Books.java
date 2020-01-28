package com.alextym.task06;

import java.util.Arrays;

public class Books {
    private Book[] books = new Book[] {
            new Book(1, "The Old Man and the Sea", "Ernest Hemingway", "B & W Publishing", 1987, 324, 78),
            new Book(2, "A Walk in Amnesia", "O. Henry", "Ballantine Books", 2001, 90, 45),
            new Book(3, "Robin Hood", "Sally M. Stockton", "Ace Books", 1999, 342, 90),
            new Book(4, "A Kiss Before Dying", "Ira Levin", "Airiti Press", 2009, 420,110),
            new Book(5, "Pride And Prejudice", "Jane Austen", "Armida Publications", 2004, 145, 90),
            new Book(6, "Batman Begins", "Goyer David", "Arcade Publishing", 2006, 560, 190),
            new Book(7, "Between Two Worlds", "Ira Levin", "Book Works", 1998,342, 80),
            new Book(8, "The Model Millionaire", " Oscar Wilde", "Brill Publishers", 2001,342, 45)
    };
    public Book[] getBooks() {
        return books;
    }

    public Book[][] addBook(int id, String name, String author, String publisher, int year, int pages, int price) {
        Book[][] newBook = new Book[books.length + 1][books.length + 1];
        for (int i =0; i < books.length+1; i++) {
        for (int j = 0; j < (books.length + 1); j++) {
            newBook[books.length][j].setId(id);
            newBook[books.length][j].setName(name);
            newBook[books.length][j].setAuthor(author);
            newBook[books.length][j].setPublisher(publisher);
            newBook[books.length][j].setYear(year);
            newBook[books.length][j].setPages(pages);
            newBook[books.length][j].setPrice(price);
        }
        }
        System.out.println(Arrays.toString(newBook));
        return newBook;
    }


    public void printBooks() {
        for (Book elem : books) {
            elem.view();
        }
    }
    public Book[][] changePrice(int x) {
        Book[][] newPriceBooks = new Book[books.length][];
        for (int i = 0; i < books.length; i++){
            int oldPrice = books[i].getPrice();
            int newPrice = oldPrice *(100+x)/100;
            books[i].setPrice(newPrice);
        }
        return newPriceBooks;
    }

    public String[] searchAuthorBooks(String string) {
        Book[] authourBooks = new Book[books.length];
        int count = 0;
        String[] ab = new String[0];
        for (Book elem : books) {
            if (elem.getAuthor().equals(string)) {
                ab[count] = elem.getName();
                count++;
            }
            System.out.println(ab);
        }
        return ab;
    }


}
