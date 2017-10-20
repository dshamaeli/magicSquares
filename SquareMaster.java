
/** Author:Daniel Shamaeli, Student ID:201230464
    this is the third assigment for COMP517
    https://github.com/dshamaeli/magicSquares.git
*/
import java.util.Scanner;

class SquareMaster {
    private static int firstNum, secondNum, thirdNum;
    private static Scanner input = new Scanner(System.in);

    public static void sort(int num1, int num2, int num3) {
        firstNum = Math.min(num1, Math.min(num2, num3));
        thirdNum = Math.max(num1, Math.max(num2, num3));
        secondNum = num1 + num2 + num3 - firstNum - thirdNum;
    }

    public static void main(String[] args) {
        System.out.print("Please enter your three Magic Keys(one or more 0 to exit): ");
        do {
            firstNum = input.nextInt();
            secondNum = input.nextInt();
            thirdNum = input.nextInt();
            sort(firstNum, secondNum, thirdNum);
            System.out.println("\nThis is the SquareMaster!\n");
            System.out.println("You have given me " + firstNum + " " + secondNum + " " + thirdNum + "\n");
            if (0 < firstNum && firstNum < secondNum && secondNum < (thirdNum - firstNum)
                    && (secondNum != 2 * firstNum))
                break;
            if (firstNum <= 0 || secondNum <= 0 || thirdNum <= 0)
                break;
            System.out.println("these are not valid keys!!!");
            System.out.print("\nPlease enter your three Magic Keys again(one or more 0 to exit): ");
        } while (firstNum > 0 && secondNum > 0 && thirdNum > 0);
        if (firstNum <= 0 || secondNum <= 0 || thirdNum <= 0) {
            System.out.println("YOU MAY NOT ENTER!!!");
            return;
        }
        System.out.println("The Keys are appropriate. Below is your Magic Square. Use it wisely!\n");
        MagicSquare square = new MagicSquare(firstNum, secondNum, thirdNum);
        square.conjureUp();
    }
}
