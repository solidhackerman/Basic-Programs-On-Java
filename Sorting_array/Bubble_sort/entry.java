import java.util.Scanner;
class entry
{
  public static void main(String[] args)
  {
    int s;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Number of elements in array : ");
    s=sc.nextInt();
    Bubble_sort bs=new Bubble_sort(s);
    bs.enterarray();
    bs.display();
  }
}
