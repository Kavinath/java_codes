import java.util.Scanner;
import java.lang.*;
class vowels
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        String s = obj.next();
        char ch[]= s.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='a' || ch[i]=='i' || ch[i]=='e' || ch[i]=='o' || ch[i]=='u')
            count++;
        }
        System.out.print(count);
    } 
}