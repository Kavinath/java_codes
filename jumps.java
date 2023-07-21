import java.util.*;
public class jumps
{
    public static void main(String[] args)
    {
        Scanner step = new Scanner(System.in);
        int n=step.nextInt();
        int jump=0;
        while(n>0)
        {
            if(n%2==0)
            {
                n/=2;
                jump++;
            }
            else
            {
                n=n-1;
                jump++;
            }
        }
        System.out.println(jump);
    }
}
