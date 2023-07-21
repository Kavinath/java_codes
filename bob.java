import java.util.Scanner;
public class bob
{
    public static void main(String[] args)
    {
       Scanner obj = new Scanner(System.in);
       int testcase = obj.nextInt();
       while (testcase!=0)
       {
           int no_of_shops = obj.nextInt();
           int shop[] = new int[no_of_shops];
           int count =0;
           for (int i=0;i<shop.length;i++)
           {
           shop[i] = obj.nextInt();
            if (i%2 == 0 && i!=0)
           {
              count+=1;    
           }
           }
           System.out.println(count);
           testcase--;
       }    
    }
}
