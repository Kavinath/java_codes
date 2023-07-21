import java.util.*;
class negative
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int arr[] = new int[num];
        int arr1[] = new int[num];
        int sum=0;
        for(int i=0;i<num;i++)
        {
            arr[i]= obj.nextInt();
        }
        for(int i=0;i<num;i++)
        {
            if(arr[i]<0)
            {
            arr1[sum] = arr[i];
            sum++;
        }
        }
        for(int i=0;i<num;i++)
        {
            if(arr[i]>0){
            arr1[sum] = arr[i];
            sum++;}
        }
        for(int i=0;i<num;i++)
        {
        System.out.print(arr1[i] + " ");
        }

    }
}