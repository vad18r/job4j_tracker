package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] lib = new Book[4];
        lib[0] = new Book("Anna Karenina", 500);
        lib[1] = new Book("Karamazov brothers", 459);
        lib[2] = new Book("Clean code", 123);
        lib[3] = new Book("Harry Potter and Prisoner of Azkaban", 345);
        for (Book book : lib) {
            System.out.println(book.getName() + " " + book.getPages());
        }

        Book k = lib[0];
        lib[0] = lib[3];
        lib[3] = k;
        System.out.println("Change book one and book four");
        for (Book book : lib) {
            System.out.println(book.getName() + " " + book.getPages());
        }
        System.out.println("Get book with name \"Clean code\"");
        for (Book book : lib) {
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " " + book.getPages());
            }
        }
    }
}
