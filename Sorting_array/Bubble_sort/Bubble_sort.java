import java.util.Scanner;
class Bubble_sort
{
  private int size=0;
  private int[] arr=new int[100];
  Bubble_sort(int s)
  {
    size=s;
  }
  public void enterarray()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter data in array");
    for(int i=0;i<size;i++)
    {
      arr[i]=sc.nextInt();
    }
    compute();
  }
  private void compute()
  {
    for(int i=0;i<size-1;i++)
    {
      for(int j=0;j<size-i-1;j++)
      {
        if(arr[j]>arr[j+1])
        {
          int temp=0;
          temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
  }
  public void display()
  {
    System.out.println("Sorted array is :");
    for(int i=0;i<size;i++)
    System.out.print(" "+arr[i]);
    System.out.println("");
  }
}
