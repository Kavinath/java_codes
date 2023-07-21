import java.util.Scanner;
class party
{
    public static void main(String args[])
    { 
      Scanner obj = new Scanner(System.in);
      int n = obj.nextInt();
      int arr1[] = new int[n];
      int arr2[] = new int[n];
      int arr=0,left=0;
      for(int i =0;i<n;i++)
      {
        arr1[i] = obj.nextInt();
      }
      for(int i =0;i<n;i++)
      {
        arr2[i] = obj.nextInt();
      }
      for(int i=0;i<n;i++)
      {
        if(arr1[i]>arr2[i] || arr1[i]==0 && arr1[i-1]>arr2[1])
        {
            arr = arr + arr1[i];
            left = left + arr2[i];
        }

      }
      int max = arr - left;
      System.out.print(max);
    }
}
