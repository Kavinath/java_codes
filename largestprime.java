import java.util.*;
public class largestprime
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int start = obj.nextInt();
        int end = obj.nextInt();
        int prime =0;
        for(int i=start+1;i<end;i++)
        {
            boolean flag = true;
            for(int j=2;j<=i/2;j++)
            {
               
               if(i%j == 0)
               {
                flag = false;
                break;
               }
            }
            if(flag == true && i>prime)
            {
                prime = i;
            }
        }
        System.out.println(prime);
    }
}
