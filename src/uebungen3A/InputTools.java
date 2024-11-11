package uebungen3A;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * class to ease input from standard input (stdin, keyboard)
 * 
 * @author S.Frenz
 * @version 2011-10-14
 */
public class InputTools {
  /**
   * BufferedReader to be used in read methods
   */
  private static BufferedReader in;
  
  /**
   * Remember initialization state
   */
  private static boolean initDone = false;
  
  /**
   * Prevent instantiation of this tool class
   */
  private InputTools() {
  }
  
  /**
   * Initialize buffered streams
   */
  private static void init() {
    if (initDone) return;
    initDone = true;
    in = new BufferedReader(new InputStreamReader(System.in));
  }
  
  /**
   * Print an error message
   */
  private static void error(String reason) {
    if (reason==null) reason="internal error";
    System.out.println();
    System.out.println(reason);
  }
  
  /**
   * Read input from the user (stdin, keyboard) and convert it to an integer.
   * Repeat input until given string is a valid integer.
   * 
   * @param message
   *          the message to print
   * @return the user input
   */
  public static int readInteger(String message) {
    init();
    while (true) {
      System.out.print(message);
      try {
        int retVal = Integer.parseInt(in.readLine());
        return retVal; //if this line is executed, everything was ok
      }
      catch (NumberFormatException e) {
        error("input was not an int");
      }
      catch (IOException e) {
        error(null);
      }
    }
  }

  /**
   * Read input from the user (stdin, keyboard) and convert it to a double.
   * Repeat input until given string is a valid double.
   * 
   * @param message
   *          the message to print
   * @return the user input
   */
  public static double readDouble(String message) {
    init();
    while (true) {
      System.out.print(message);
      try {
        double retVal = Double.parseDouble(in.readLine());
        return retVal; //if this line is executed, everything was ok
      }
      catch (NumberFormatException e) {
        error("input was not a double");
      }
      catch (IOException e) {
        error(null);
      }
    }
  }

  /**
   * Read input from the user (stdin, keyboard) and return it directly.
   * 
   * @param message
   *          the message to print
   * @return the user input
   */
  public static String readString(String message) {
    init();
    while (true) {
      System.out.print(message);
      try {
        String retVal = in.readLine();
        return retVal; //if this line is executed, everything was ok
      }
      catch (IOException e) {
        error(null);
      }
    }
  }
}