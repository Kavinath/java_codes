import java.util.*;
public class subset 
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int size= obj.nextInt();
        int arr[] = new int[size];
        int soln[] = new int[size];
        for(int i=0;i<arr.length;i++)
        {
          arr[i] = obj.nextInt();
        }
        subset1(arr,size,0,soln);
    }

    public static void subset1(int arr[],int size,int index, int soln[])
    {
       if(index==size)
       {
        for(int i=0;i<size;i++)
        {
            if(soln[i]==1)
            {
                System.out.printf("%d",arr[i]);
            }
        }
       }
       else
       {
        subset1(arr,size,index+1,soln);
        soln[index]=1;
        subset1(arr,size,index+1,soln);
        soln[index]=0;
       }
       System.out.println();
    }
}
