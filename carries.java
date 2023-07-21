import java.util.*;
class carries
{
   public static void main(String[] args) 
   {
      Scanner obj = new Scanner(System.in);
      int num1 = obj.nextInt();
      int num2 = obj.nextInt();
      int count=0,rem,rem1,carry;
     for(int i=0;i<num1;i++)
     {
          rem = num1%10;
          rem1 = num2%10;
          carry = rem + rem1;
          if(carry>=10)
          {
             count= count +1;
             num1 = num1 + carry;
          }
          num1=num1/10;
          num2=num2/10;
          
     }
     System.out.println(count);

   }

}