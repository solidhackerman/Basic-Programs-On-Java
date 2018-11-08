import java.util.Scanner;
class entry{
  public static void main(String[] args)
  {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Number of elements in array : ");
    n=sc.nextInt();
    Selection_sort ss=new Selection_sort(n);
    ss.enterarray();
    ss.display();
  }
}
