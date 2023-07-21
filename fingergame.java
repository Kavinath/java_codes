import java.util.*;
class fingergame
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        String[] fingers = {"Thumb","Index","Middle","Ring","Little"};
        int finger = n%8;
        if(finger == 1)
        System.out.println(fingers[0]);
        else if(finger == 2 || finger == 0)
        {
          System.out.println(fingers[1]);
        }
         else if(finger == 3 || finger == 7)
        {
          System.out.println(fingers[2]);
        }
        else if(finger == 4 || finger == 6)
        {
          System.out.println(fingers[3]);
        }
        else
        {
          System.out.println(fingers[4]);
        }
           
    }
}