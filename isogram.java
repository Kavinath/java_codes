import java.util.*;
import java.lang.*;
class isogram
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        String s1 = obj.nextLine();
        String arr1[] = s1.split(" ");
        System.out.println("Duolicate words in a given strig :");
        String S1 = s1.toLowerCase();
        int count=0;
        for(int i=0;i<arr1.length;i++)
        {
            count=1;
          for(int j=i+1;j<arr1.length;j++)
          {
            if(arr1[i].equals(arr1[j]))
            count++;
            arr1[j] = "0";
            //j++;
            //i++;
          }
          if(count>1 && arr1[i]!="0")
          System.out.println(arr1[i]);
          
          
        }
         
    }
}