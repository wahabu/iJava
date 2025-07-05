import java.util.Scanner;

public class TimeConverter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int days = scanner.nextInt();

    int hours, minutes, seconds;
    hours = days * 24;
    minutes = hours * 60;
    seconds = minutes * 60;

    System.out.println(seconds);
    scanner.close();
  }
}