import java.util.*;
import java.lang.*;
class strsort
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]);
        }
    }
}