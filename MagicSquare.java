

class MagicSquare
{
  private int int1;
  private int int2;
  private int int3;
  MagicSquare(int int1, int int2,int int3)
  {
    this.int1 = int1;
    this.int2 = int2;
    this.int3 = int3;
  }
  
  public void print()
  { 
    System.out.println((int3 - int2) + "\t" + (int3 + (int1 + int2)) + "\t" + (int3 - int1) + "\n");
    System.out.println(int3 - (int1 - int2) + "\t" + int3 + "\t" + (int3 + (int1 - int2)) + "\n");
    System.out.println((int3 + int1) + "\t" + (int3 - (int1 + int2)) + "\t" + (int3 + int2 + "\n"));
  }  
}
