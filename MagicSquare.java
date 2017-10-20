/** Author:Daniel Shamaeli, Student ID:201230464
    this is the third assignment for COMP517
    https://github.com/dshamaeli/magicSquares.git
*/
//Class for containing MagicSquare Data
class MagicSquare {
    private int int1; //The first magic key 
    private int int2; //the second magic key
    private int int3; //The third magic key

    //class constructor colour 
    MagicSquare(int int1, int int2, int int3) {
        this.int1 = int1; // this is the current object, this allows us to use the same name for variables 
        this.int2 = int2; 
        this.int3 = int3;
    }       

    /*
    Method to print Magic Square:
    
        column1         column2         column3  
        c – b          c + (a + b)       c – a
       c – (a – b)          c           c + (a – b)
        c + a          c – (a + b)       c + b
    */

    public void conjureUp() {

        //first row
        System.out.println((int3 - int2) + "\t" + (int3 + (int1 + int2)) + "\t" + (int3 - int1) + "\n");

        //second row    
        System.out.println(int3 - (int1 - int2) + "\t" + int3 + "\t" + (int3 + (int1 - int2)) + "\n");

        //third row
        System.out.println((int3 + int1) + "\t" + (int3 - (int1 + int2)) + "\t" + (int3 + int2 + "\n"));
    }
}
