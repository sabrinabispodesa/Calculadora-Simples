public class Main {
  public static void main(String[] args) {

    java.util.Scanner scanner = new java.util.Scanner(System.in);
    String operation;

    do {
      System.out.println("What operation do you want to perform? (add, subtract, multiply, divide)");
      operation = scanner.nextLine();

      System.out.println("Enter the first number:");
      double num1 = scanner.nextDouble();
      scanner.nextLine(); // Consume newline

      System.out.println("Enter the second number:");
      double num2 = scanner.nextDouble();
      scanner.nextLine(); // Consume newline

      double result = 0;

      if (operation.equals("add")) {
        result = num1 + num2;
      } else if (operation.equals("subtract")) {
        result = num1 - num2;
      } else if (operation.equals("multiply")) {
        result = num1 * num2;
      } else if (operation.equals("divide")) {
        if (num2 != 0) {
          result = num1 / num2;
        } else {
          System.out.println("Cannot divide by zero.");
          continue;
        }
      } else {
        System.out.println("Invalid operation.");
        continue;
      }

      System.out.println("Result: " + result);

      System.out.println("Do you want to perform another operation? (yes/no)");
    } while (scanner.nextLine().equalsIgnoreCase("yes"));

    System.out.println("Exiting...");
    scanner.close();
  }

}
