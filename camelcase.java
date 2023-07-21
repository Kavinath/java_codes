import java.util.*;
class camelcase
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        String a = obj.nextLine();
        char arr[] = a.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(i==0)
             {
                System.out.print(Character.toUpperCase(arr[0]));
             }
             else if(arr[i] == ' ')
             {
                arr[i+1] = Character.toUpperCase(arr[i+1]);
                System.out.print(arr[i]);
             }
             else
             {
                System.out.print(arr[i]);
             }
        }
        
       
    }
}