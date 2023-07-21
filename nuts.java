import java.util.*;

public class nuts
{
  public static void main(String[] args)
  {
    Scanner obj = new Scanner(System.in);
    int N = obj.nextInt();
    char[] nuts = new char[N];char[] bolts = new char[N];int count=0;
    char[] arr = {'!','#','$','%','&','*','@','^','~'};
    char[] temp = new char[9];char[] temp1 = new char[9];
    for(int i=0;i<N;i++)
    nuts[i] = obj.next().charAt(0);
    for(int i=0;i<N;i++)
    bolts[i] = obj.next().charAt(0);
    for(int i=0;i<nuts.length;i++)
    {
      for(int j=0;j<arr.length;j++)
      {
        if(nuts[i] == arr[j])
        {
          temp[j] = 1;
        }
      }
    }
    for(int i=0;i<bolts.length;i++)
    {
      for(int j=0;j<arr.length;j++)
      {
        if (bolts[i] == arr[j]) {
          temp1[j] = 1;
        }
      }
    }
    for(int i=0;i<temp.length;i++)
    {
      if(temp[i] == 1)
      {
        System.out.print(arr[i] + " ");
      }
    }
    System.out.println();
    for(int i=0;i<temp1.length;i++)
    {
      if(temp1[i] == 1)
      {
        System.out.print(arr[i]+ " ");
      }
    }
      
  }  
}
