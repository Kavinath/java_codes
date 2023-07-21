import java.util.*;
class encode_string
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        String input = obj.nextLine();
        char input1[] = input.toCharArray();
         int count =1;

         for (int i = 0; i< input1.length; i++)
         {
            System.out.print(input1[i]);
            
            for (int j = i+1; j < input1.length; j++)
            {
               if(input1[i]==input1[j])
               {
                count++;
                // i+=count;
               }
               else if(input1[i]!=input1[j] && j==input1.length-1)
               {
                System.out.print(count);
                i+=count-1;
                 count=1;
                 break;
               }

            }
            
           
        }
         System.out.print(count);
}
}
