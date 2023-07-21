import java.util.*;
public class magicindex
{
    public static void main(String[] args)
    {
       Scanner obj = new Scanner(System.in);
       int testcase = obj.nextInt();
       while(testcase!=0)
       {
          int size = obj.nextInt();
          int n[] = new int[size];
          int temp =0;
          for (int i=0;i< size;i++)
          {
             n[i] = obj.nextInt();
             if (n[i] == i)
             {
                  temp =i; 
             }  
          }
          if(temp!=0)
          System.out.println(temp);
          else
          System.out.println("-1");
          testcase--;

       }    
    }
}

