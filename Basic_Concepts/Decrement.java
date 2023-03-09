import java.util.Scanner;

public class Decrement {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    // taking initial score
    int initScore = scanner.nextInt();
    int scoreBob = initScore;

    System.out.println("Round 1 results:");
    // fix
    System.out.println(--scoreBob);
  }
}