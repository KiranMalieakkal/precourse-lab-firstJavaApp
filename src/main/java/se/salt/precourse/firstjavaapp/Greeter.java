package se.salt.precourse.firstjavaapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Greeter {
  private static String greet(String namePassedIn) {
    return "Welcome to SALT, " + namePassedIn;
  }
    private static String calcualte(String inputdate) {
      LocalDate targetdate= LocalDate.parse(inputdate);
      LocalDate currentdate=LocalDate.now();
      long daysRemaining = ChronoUnit.DAYS.between(currentdate, targetdate);
      return "Today it is " + daysRemaining  +" days left until the course starts";
    }

  public static void main(String[] args) throws IOException {
    System.out.print("What is your name? ");

    Scanner Sc = new Scanner(System.in);
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String name = Sc.nextLine();
    System.out.print("When does that course start?");
    String inputdate = Sc.nextLine();
    String greeting = greet(name);
    String Date= calcualte(inputdate);
    System.out.println(greeting);
    System.out.println(Date);

  }
}
