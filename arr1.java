import java.util.Scanner;
class arr1
{
    public static void main(String arg[])
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n+1];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = obj.nextInt();
        }
        int num = obj.nextInt();
        int pos = obj.nextInt();
        for(int i=0;i<pos;i++)
        {
            arr1[i] = arr[i];
        }
        arr1[pos] =num;
        for(int i=pos;i<arr.length;i++)
        {
            arr1[i+1] = arr[i];
        }
        for(int ele : arr1)
        {
           System.out.print(ele + " ");
        }
    }
}