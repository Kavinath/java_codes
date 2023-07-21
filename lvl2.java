import java.util.*;
import java.lang.*;
class lvl2
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        char ch[] = s.toCharArray();
        s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
            continue;
            else
            System.out.print(ch[i]);
        }
    }
}
