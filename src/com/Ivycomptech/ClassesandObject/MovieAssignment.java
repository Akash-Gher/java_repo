package com.Ivycomptech.ClassesandObject;

public class MovieAssignment {

    private static final Object PG ="" ;

    /*   2) The class Movie is started below. An instance of class Movie represents a film. This
    class has the following three class variables:
     • title, which is a String representing the title of the movie
     • studio, which is a String representing the studio that made the movie
     • rating, which is a String representing the rating of the movie (i.e. PG-13, R,
    etc)*/
public class Movie {
 private String title;
 private String studio;
 private String rating;


  /*   a) Write a constructor for the class Movie, which takes a String representing the title
             of the movie, a String representing the studio, and a String representing the
             rating as its arguments, and sets the respective class variables to these values.
     An answer:*/
     public Movie(String t, String s, String r) {
         title = t;
         studio = s;
         rating = r;
     }
     /*b) Write a second constructor for the class Movie, which takes a String representing
             the title of the movie and a String representing the studio as its arguments, and
             sets the respective class variables to these values, while the class variable rating
             is set to "PG".
     An answer:*/
     public Movie (String t, String s) {
         title = t;
         studio = s;
         rating = "PG";
     }
   /*  c) Write a method getPG, which takes an array of base type MovieAssignment.Movie as its argument,
     and returns a new array of only those movies in the input array with a rating of "PG".
     You may assume the input array is full of Movie instances. The returned array need
     not be full.
     An answer:*/
     public static MovieAssignment.Movie[] getPG(MovieAssignment.Movie[] mov) {
         MovieAssignment.Movie[] pgMov = new MovieAssignment.Movie[mov.length];
         int newArrayIndex = 0;
         for (int i = 0; i < mov.length; i++) {
             if (mov[i].rating.equals("PG")) {
                 pgMov[newArrayIndex] = mov[i];
                 newArrayIndex++;
             }
         }
         return pgMov;
     }

   /*  d) Write a piece of code that creates an instance of the class Movie with the title
“Casino Royale”, the studio “Eon Productions”, and the rating “PG-13”.
     An answer:*/
     MovieAssignment.Movie mov = new MovieAssignment.Movie("Casino_Royale","Eon\n" +
           "             Productions","PG-13");


}

}
