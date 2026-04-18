import java.util.*;

class Main {
  public static void main(String[] args) {
    
    System.out.println("\nGenerate an integer list:");
    ArrayList<Integer> nums = generateList(10);
    System.out.println(nums);
    System.out.println("\nEven numbers in the list:");
    System.out.println(evenNums(nums));
    System.out.println("\nModifiy by removing the smallest:");
    System.out.println(removeSmallest(nums));
    System.out.println("\nModify by adding the sum to the end:");
    System.out.println(addSum(nums));
    System.out.println("\nModify by dividing all the multiples of 3 by 3:");
    System.out.println(divideMultiplesOf3(nums));

    System.out.println("\nGenerate a word list:");
    ArrayList<String> test = generateStringList(4);
    System.out.println(test);
    System.out.println("\nModify by inserting \"MIDDLE\" into the middle:");
    System.out.println(insertMiddle(test));

  }

  // 1. Write a method that takes in an integer N and returns an ArrayList with N random integers between -50 and 50. In your main method, call this method and print out the resulting list.
  public static ArrayList<Integer> generateList(int N){
    ArrayList<Integer> list = new ArrayList<>();
    for(int i = 0; i < N; i++){
       int num = (int)((Math.random()*100)-50);
        list.add(num);
    }
    return list;
  }

  // 2. Write a method which takes in an ArrayList of numbers and returns an ArrayList containing only the even numbers.
  public static ArrayList<Integer> evenNums(ArrayList<Integer> arrList) {
    ArrayList<Integer> result = new ArrayList<Integer>();

    for (int i = 0; i < arrList.size(); i++) {
      if (arrList.get(i) % 2 == 0) {
        result.add(arrList.get(i));
      }
    }
    return result;
  }

  // 3. Write a method which takes in an ArrayList of numbers and returns the ArrayList with the smallest number removed.
  public static ArrayList<Integer> removeSmallest(ArrayList<Integer> arrList) {
    int indexOfSmallest = 0;
    for (int i = 0; i < arrList.size(); i++) {
      if (arrList.get(i) < arrList.get(indexOfSmallest)) {
        indexOfSmallest = i;
      }
    }
    arrList.remove(indexOfSmallest);
    return arrList;
  }

  // 4. Write a method which takes in an ArrayList of numbers and returns the ArrayList with the sum of all the numbers added to the end.
  public static ArrayList<Integer> addSum(ArrayList<Integer> arrList) {
    int sum = 0;
    for (int i = 0; i < arrList.size(); i++) {
      sum += arrList.get(i);
    }
    arrList.add(sum);
    return arrList;
  }

  // 5. Write a method that takes in an ArrayList of numbers and modifies the list by dividing multiples of 3 by 3
  public static ArrayList<Integer> divideMultiplesOf3(ArrayList<Integer> list){
    for(int i = 0; i < list.size(); i++){
      if(list.get(i) % 3 == 0){
        list.set(i, list.get(i)/3);
      }  
    }
    return list;
  }

  // 6. Write a method that takes in an integer N, and returns an ArrayList with N words that the user types in. In your main method, call this method and print out the resulting list.
  public static ArrayList<String> generateStringList(int N){
    ArrayList<String> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    String string;

    for(int i = 0; i < N; i++){
      System.out.print("Enter a word: ");
      string = scanner.nextLine();
      list.add(string);
    }
    scanner.close();
    return list;
  }

  // 7. Write a method that takes in an ArrayList of strings and inserts the string "MIDDLE" in the middle of the list. This method will modify the original list.
  public static ArrayList<String> insertMiddle(ArrayList<String> list){
    int midpoint = (int)(list.size()/2);
    list.add(midpoint, "MIDDLE");
    return list;
  }
}