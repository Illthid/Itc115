package com.company;

public class LibraryMain {

    public static void main(String[] args) {
        Book feed = new Book(1, "InterWorld", false, true, 0, 0.0, "Sci-Fi", 260, "Neil Gaiman");
        System.out.println(feed.print());

        System.out.println();

        Magazine time = new Magazine(2, "Time", true, true, 0, 0.0, "News", 80, "Time-Warner",
                "Jan.2.1928");
        System.out.println(time.print());

        System.out.println();

        CD pad = new CD(3, "Thriller",
                false, false, 5, 2.5, 42.19, "Pop", "Michal Jackson");
        System.out.println(pad.print());

        System.out.println();

        DVD godF = new DVD(4, "Godfather",
                false, false, 10, 5.0, 175, "Drama", "Francis Ford Coppola");
        System.out.println(godF.print());
    }

}