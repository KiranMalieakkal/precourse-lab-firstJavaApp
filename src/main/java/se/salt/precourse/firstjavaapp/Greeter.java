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

  public static void main(String[] args) throws IOException {
    System.out.print("What is your name? ");

    Scanner Sc = new Scanner(System.in);
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String name = Sc.nextLine();
    System.out.print("When does that course start?");
    String startDateInput = Sc.nextLine();
    String greeting = greet(name);
    StartDateHandler startDateHandler = new StartDateHandler();
    System.out.println(greeting);
    if (startDateHandler.dateHasOnlyNumbers(startDateInput)) {
      System.out.println("Today it is " + startDateHandler.daysToCourseStart(startDateInput) + " days left until the course starts");
    } else {
      System.out.println("Enter a valid date");
    }
  }
}
