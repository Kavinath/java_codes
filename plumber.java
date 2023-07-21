import java.util.*;
public class plumber
{
   public static void main(String[] args)
   {
        Scanner obj = new Scanner(System.in);
        int no_inlet = obj.nextInt();
        int no_outlet = obj.nextInt();
        int rust = obj.nextInt();
        int inlets[] = new int[no_inlet];
        int outlets[] = new int[no_outlet];
        int sum=0 ,sum1=0,result=0;
        for ( int i = 0; i < inlets.length; i++)
            inlets[i] = obj.nextInt();

        for (int j = 0; j < outlets.length; j++)
           outlets[j] = obj.nextInt();
           
        for (int i= 0; i< inlets.length; i++)
        {
           sum = sum + inlets[i];
        }
        for(int i=0;i<outlets.length;i++)
        {
            sum1 = sum1 + outlets[i];
        }

        if(sum == sum1 )
        {
            System.out.println("BALANCED");
        }
        else if( sum > sum1)
        {
             result = (sum - sum1) + rust;
            System.out.println("-"+result);
        }

                
        
   }
} 
