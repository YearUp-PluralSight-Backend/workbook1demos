package com.pluralsight;

public class Demo1 {

    public static void main(String[] args) {

        char status = 'm'; // declaration and initialization            DATA TYPE: char
        int identifier = 1; // declaration and initialization           DATA TYPE: int
        String name = "Yiming";   // declaration and initialization     DATA TYPE: String

        String greeting = "Hello, " + name + "!";  // Expression DATA TYPE: String
        int numberOfDaysPerWeekWatchTV = 5; // declaration and initialization DATA TYPE: int
        int minutesPerDayOnDayWatchedOnAverage = 70; // declaration and initialization DATA TYPE: int
        int minutesPerWeek = numberOfDaysPerWeekWatchTV * minutesPerDayOnDayWatchedOnAverage; // Expression DATA TYPE: int


        int minutesPerYear = minutesPerWeek * 52; // Expression DATA TYPE: int
        int hoursPerYear = minutesPerYear / 60; // Expression DATA TYPE: int

        int hoursInWorkWeek = 40; // declaration and initialization DATA TYPE: int
        int workWeeksPerYearWatchingTV = hoursPerYear / hoursInWorkWeek; // Expression DATA TYPE: int

        System.out.println("If " + name + " did not watch TV during the work week, they would have worked " + workWeeksPerYearWatchingTV + " weeks per year."); // Statement  DATA TYPE: void
        System.out.println("Hours watched per year: " + hoursPerYear); // Statement  DATA TYPE: void
        System.out.println("Total minutes watched: " + minutesPerWeek); // Statement  DATA TYPE: void
        System.out.println(greeting); // Statement  DATA TYPE: void

    }
}
