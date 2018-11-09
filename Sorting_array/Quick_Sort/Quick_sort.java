import java.util.Scanner;
class Quick_sort
{
  private int size;
  private int[] arr=new int[100];
  Quick_sort(int s)
  {
    size=s;
  }
  public void enterarr()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter elements in array : ");
    for(int i=0;i<size;i++)
    arr[i]=sc.nextInt();
    quick_sort(arr,0,size-1);
  }
  private void quick_sort(int[] a,int beg,int end)
  {
    int loc;
    if(beg<end)
    {
      loc=partition(a,beg,end);
      quick_sort(a,beg,loc-1);
      quick_sort(a,loc+1,end);
    }
  }
  private int partition(int[] a,int beg,int end)
  {
    int left,right,temp,loc,flag;
    loc=beg;
    left=beg;
    right=end;
    flag=0;
    while(flag!=1)
    {
      while(a[loc]<=a[right]&&(loc!=right))
      right--;
      if(loc==right)
      flag=1;
      else if(a[loc]>a[right])
      {
        temp=a[loc];
        a[loc]=a[right];
        a[right]=temp;
      }
      if(flag!=1)
      {
        while(a[loc]>a[left]&&(loc!=left))
        left++;
        if(loc==left)
        flag=1;
        else if(a[loc]<a[left])
        {
          temp=a[left];
          a[left]=a[loc];
          a[loc]=temp;
        }
      }
    }
    return loc;
  }
  public void show()
  {
    System.out.println("The Sorted array is : ");
    for(int i=0;i<size;i++)
    System.out.println(" "+arr[i]);
  }
}
