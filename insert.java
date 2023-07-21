import java.util.*;
class insert
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int arr[]= new int[n];
        int arr1[]= new int[n+1];
        for(int i=0;i<n;i++)
        {
            arr[i] = obj.nextInt();
        }
        int k = obj.nextInt();
        int pos = obj.nextInt();
        for(int i=0;i<pos;i++)
        {
           arr1[i] = arr[i];
        }
        for(int i=pos;i<pos+1;i++)
        {
            //arr1[i] = k;
            continue;
        }
        int t = pos+1;
        for(int i=pos;i<n;i++)
        {
            arr1[t] = arr[i];
            t++;
        }
        for(int i=0;i<n+1;i++)
        {
            System.out.print(arr1[i] + " ");
        }


    }
}
