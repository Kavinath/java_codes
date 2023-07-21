import java.util.*;

class maxmatrix 
{
 public static void main(String args[])
 {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int arr[m][n];
    int max=0;
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr.length;j++)
        {
            arr[i][j] = sc.nextInt();
        }
    }
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr.length;j++)
        {
            max = arr[i];
            if(arr[i]<arr[j])
            {
               max = arr[j];
            }
        }
    }
 }    
}
