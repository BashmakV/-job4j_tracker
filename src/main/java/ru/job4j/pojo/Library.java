package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book adventures = new Book("Black corsair", 304);
        Book detective = new Book("Между Амуром и Невой", 390);
        Book stories = new Book("Большая книга рассказов", 208);
        Book programming = new Book("Clean Code", 464);
        Book[] notes = new Book[4];
        notes[0] = adventures;
        notes[1] = detective;
        notes[2] = stories;
        notes[3] = programming;
        for (int i = 0; i < notes.length; i++) {
            Book ns = notes[i];
            System.out.println(ns.getName() + " - " + ns.getPageCount());
        }
        System.out.println();
        Book g = notes[3];
        notes[3] = notes[0];
        notes[0] = g;
        for (int i = 0; i < notes.length; i++) {
            Book ns = notes[i];
            System.out.println(ns.getName() + " - " + ns.getPageCount());
        }
        System.out.println();
        for (int i = 0; i < notes.length - 1; i++) {
            Book ns = notes[i];
            if (notes[i] == programming) {
                System.out.println(ns.getName() + " - " + ns.getPageCount());
            }
        }
    }
}
