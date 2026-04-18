class Main {
  public static void main(String[] args) {
    int numFortunes = 5;
    String[] fortunes = new String[numFortunes];

    fortunes[0] = "You will find $20 in your pocket!";
    fortunes[1] = "You will catch the sniffles.";
    fortunes[2] = "You will have your favorite meal tonight!";
    fortunes[3] = "You will ace your next test!";
    fortunes[4] = "Your phone will run out of battery at an inconvenient time.";

    int rand = (int)(Math.random()*5);
    System.out.println("Your random fortune is:");
    System.out.println(fortunes[rand]);
  }
}