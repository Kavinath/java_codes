import java.util.*;
class Recursion
{
    public static void main(String args[])
    {
        Scanner ject = new Scanner(System.in);
        int n = ject.nextInt();
        int m = ject.nextInt();
        int min = Math.min(n, m);
        Recursion obj = new Recursion();
        obj.recursion(n, m, min);
    }
    public static void recursion(int n,int m,int min)
    {
        
        if(n%min ==0 && m%min ==0)
        System.out.println(min);
        else
        recursion(n,m,min-1);
    }
}
