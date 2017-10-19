import java.util.Scanner;

class SquareMaster{
  private static int firstNum, secondNum, thirdNum;
  private static Scanner input = new Scanner(System.in);

  public static void sort(int num1, int num2, int num3) {
    firstNum = Math.min(num1, Math.min(num2, num3));
    thirdNum = Math.max(num1, Math.max(num2, num3));
    secondNum = num1 + num2 + num3 - firstNum - thirdNum;
  }

  public static void main(String[] args) {
    System.out.print("Please enter your three Magic Keys: ");
    do {
      firstNum = input.nextInt();
      secondNum = input.nextInt();
      thirdNum = input.nextInt();
      sort(firstNum, secondNum, thirdNum);
      System.out.println("This is the SquareMaster!");
      System.out.println("You have given me " + firstNum + " " + secondNum + " " + thirdNum);
      if (0 < firstNum && firstNum < secondNum && secondNum < (thirdNum - firstNum) && 
                                                            (secondNum != 2 * firstNum))
        break;
      System.out.println("these are not valid keys");
      System.out.print("\nPlease enter your three Magic Keys again: ");
    } while (true);
    System.out.println("The Keys are appropriate. Below is your Magic Square. Use it wisely!");
    MagicSquare square = new MagicSquare(firstNum, secondNum, thirdNum);
    square.print();
  }
}
