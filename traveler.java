
import java.util.*;

public class traveler
{
    public static void main(String[] args)
    {
       Scanner obj = new Scanner(System.in);
       int no_path = obj.nextInt();
       int paths[] = new int[no_path];
       for (int i = 0; i < paths.length; i++)
       {
        paths[i] = obj.nextInt();
       }
       Arrays.sort(paths);

       System.out.println(paths[0]+ " " +paths[1]);


    }
}