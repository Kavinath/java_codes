import java.util.*;

public class Kprogram {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int k=0,d,temp=0;
        int div =0,rem =0, power=0;
        int flag =0;

        while(N!=0){
           for(d=1;d<N;d++)
           {
            temp = N - d*d;
            // System.out.println(temp);
            }
            for(k=1;k<=N;k++)
            {
                if(temp == (int)Math.pow(k,k))
                {
                    flag =1;
                }
            }

            N--;
        }
        if(flag == 1)
            {
             System.out.println("yes " + k);
            }
            else
            {
                System.out.println("no");
            }  
    }
}
