import java.util.*;
public class handshake
{
    public static void main(String[] args)
    {
        Scanner hands = new Scanner(System.in);
        int n = hands.nextInt();
        int handshake =0;
       for(int i=1;i<=n;i++)
       {
          handshake = handshake + n-i;
       }
       System.out.println(handshake);
    }
}
