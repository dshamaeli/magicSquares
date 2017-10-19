import java.util.Scanner;

class SquareMaster
{
  private static int first,second,third;
  private static Scanner input = new Scanner(System.in);
  public static void main(String[] args)
  {
    System.out.print("Please enter Number magic keys:");
    first = input.nextInt();
    second = input.nextInt();
    third = input.nextInt();
    MagicSquare square = new MagicSquare(first,second,third);
    square.sort();
  }
}

/*  private static int getValidInt(String tag,String name)
 {
   int var,counter;
   Scanner input = new Scanner(System.in);

   do
   {
     //prompting user for input
     System.out.print("Please enter Number magic keys:");


     //check if input is an integer
     while(!input.hasNextInt())
     {
       System.out.print("The "+ name +"'s " + tag +" should be a number(1-10): ");
       input.next();
     }

     //getting user input
     var = input.nextInt();
   }
   while(0<a && a<b && b<(c-a)); //checking unput until get a positive number

   return var;
 }
 public void conjure()
 {
   System.out.print("Please enter Number magic keys:");
 }

}*/
