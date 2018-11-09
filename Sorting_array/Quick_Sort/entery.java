import java.util.Scanner;
class entery
{
  public static void main(String[] args)
  {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Number of elements in array :  ");
    n=sc.nextInt();
    Quick_sort qs=new Quick_sort(n);
    qs.enterarr();
    qs.show();
  }
}
