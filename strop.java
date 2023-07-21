import java.util.Scanner;

public class strop
{
   public static void main(String[] args)
   {
       Scanner obj = new Scanner(System.in);
       String s = obj.nextLine();
       String t = obj.nextLine();
       int count=0;
       if (s.equalsIgnoreCase(t))
       {
         count=0;  
       } 
       else
       {
         count+=1;
      }
       System.out.println(count);





   }    
}
