import java.util.Scanner;
public class Selection_sort
{
  private int size;
  private int[] arr=new int[100];
  Selection_sort(int s)
  {
    size=s;
  }
  private int smallest(int i)
  {
    int pos=i,small=arr[i];
    for(int j=i+1;j<size;j++)
    {
      if(arr[j]<small)
      {
        small=arr[j];
        pos=j;
      }
    }
    return pos;
  }
  private void selection_sort()
  {
    int pos,temp;
    for(int k=0;k<size;k++)
    {
      pos=smallest(k);
      temp=arr[k];
      arr[k]=arr[pos];
      arr[pos]=temp;
    }
  }
  public void enterarray()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the elements in array : ");
    for(int i=0;i<size;i++)
    {
      arr[i]=sc.nextInt();
    }
    selection_sort();
  }
  public void display()
  {
    System.out.println("Sorted array is : ");
    for(int i=0;i<size;i++)
    {
      System.out.println(" "+arr[i]);
    }
  }
}
