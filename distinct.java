import java.util.*;
class distinct
{
    public static void main(String args[])
    {
       Scanner obj = new Scanner(System.in);
       int n = obj.nextInt();
       int a[] = new int[n];
       //int b[] = new int[n];
       int count=0;
       for(int i=0;i<n;i++)
       {
         a[i] = obj.nextInt();
       }
       for(int i=0;i<n;i++)
       {
        for(int j=i+1;j<i;j++)
        {
            if(a[i]==a[j])
            break;
            if(i==j)
            count++;
    
              

        }
       }
       System.out.print(count);
    }
}
