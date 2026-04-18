import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("What is your name? ");
    String name = in.nextLine();
    System.out.println("Nice to meet you, " + name + "! My name is Bob.");

    System.out.print("What is your favorite food? ");
    String food = in.nextLine();
    System.out.println("Aw man, I'm allergic to " + food + ". :(");

    System.out.print("What's the best movie you've seen lately? ");
    String movie = in.nextLine();
    System.out.println("Cool, I'll add that one to my list!");

    System.out.print("Who is your favorite celebrity? ");
    String celeb = in.nextLine();
    System.out.println("You won't believe this, but I just met " + celeb + " last week!");

    System.out.println("See you next time!");
  }
}