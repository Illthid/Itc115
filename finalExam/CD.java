package com.company;

    public class CD extends LibraryItem {

        private double runTime;
        private String genre;
        private String author;

        public CD(int itemNumber, String title, boolean reserved, boolean checkedIn, int daysLate,
                  double finesAccrued, double runTime, String genre, String author) {
            super(itemNumber, title, reserved, checkedIn, daysLate, finesAccrued);
            this.runTime = runTime;
            this.genre = genre;
            this.author = author;
        }



        public double getRunTime() {
            return runTime;
        }



        public String getGenre() {
            return genre;
        }



        public String getAuthor() {
            return author;
        }



        @Override
        public String print() {
            return super.print() + ", CD Title: " + getTitle() +
                    ", \n CD Genre: " + genre + ", Artist: " + author + ", CD Runtime: " + runTime;
        }
    }
}
