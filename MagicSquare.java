class MagicSquare
{
  private int first;
  private int second;
  private int third;
  MagicSquare(int first, int second,int third)
  {
    this.first = first;
    this.second = second;
    this.third = third;
  }
/*  private inputCheck(){

  }
  public MagicSquare create()
  {

  } */
  private void swap(int a,int b)
  {
    int buffer;
    buffer = a;
    a=b;
    b=buffer;
  }
  public void sort()
  {
    if (third < first) swap(first,third);
     else if (third < second) swap(second,third);
            else swap(first,third);
              if(third<second) swap(second,third);
     System.out.print(first + " " + second + " " + third);
  }
}
