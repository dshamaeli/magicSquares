
/** Author:Daniel Shamaeli, Student ID:201230464
    this is the third assignment for COMP517
    https://github.com/dshamaeli/magicSquares.git
*/
//imort scanner to get input from user
import java.util.Scanner;

//Square master class to Get user input and create and conjure magic square
class SquareMaster {

    //class variable declaration
    private static int firstKey, secondKey, thirdKey; //3 magic key
    private static Scanner input = new Scanner(System.in); // input variable

    //sorts 3 int into ascending order
    public static void sort(int num1, int num2, int num3) {

        //first key should be the smallest one
        firstKey = Math.min(num1, Math.min(num2, num3));
        
        //third key should be the biggest one
        thirdKey = Math.max(num1, Math.max(num2, num3));

        //we have first and last we could subtract them from the sum and get the middle key 
        secondKey = num1 + num2 + num3 - firstKey - thirdKey;
    }

    public static void main(String[] args) {

        System.out.print("Please enter your three Magic Keys(one or more 0 to exit): ");

        //this loop get and validate input

        do {
            firstKey = input.nextInt();     //get first key
            secondKey = input.nextInt();    //get second key
            thirdKey = input.nextInt();     //get last key

            sort(firstKey, secondKey, thirdKey);    //sort key by ascending order

            //square master output
            System.out.println("\nThis is the SquareMaster!\n");
            System.out.println("You have given me " + firstKey + " " + secondKey + " " + thirdKey + "\n");
            
            //key should follow these conditions:
            //0 < a < b < (c – a) and b!=2a
            if (0 < firstKey && firstKey < secondKey && secondKey < (thirdKey - firstKey)
                    && (secondKey != 2 * firstKey))
                break; //exit the loop if key dont have the right conditions

            //exits the loop if one or key are <= 0  
            if (firstKey <= 0 || secondKey <= 0 || thirdKey <= 0)
                break;
            //these 2 only printed if keys Dont Have the right condition
            System.out.println("these are not valid keys!!!");
            System.out.print("\nPlease enter your three Magic Keys again(one or more 0 to exit): ");

        } while (firstKey > 0 && secondKey > 0 && thirdKey > 0);

        //output when user wants to quit
        if (firstKey <= 0 || secondKey <= 0 || thirdKey <= 0) {
            System.out.println("YOU MAY NOT ENTER!!!");
            return;
        }
        
        //output if keys had the required condition

        System.out.println("The Keys are appropriate. Below is your Magic Square. Use it wisely!\n");
        //initiate Magic Square
        MagicSquare square = new MagicSquare(firstKey, secondKey, thirdKey);
        //conjure up the Magic Square
        square.conjureUp();
    }
}
