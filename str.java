import java.util.*;
import java.lang.*;
class revstr
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        String arr[] = s.spilt();
        String arr1[] = new String[s.length]; 
    }
    int t=0;
    for(int i=arr.length;i>=0;i--)
    {
        arr1[t] = arr[i];
        t++;
    }
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr1[i]);
    }
}
