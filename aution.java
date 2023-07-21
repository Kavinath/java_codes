import java.util.*;
public class aution
{
   public static void main(String[] args)
   {
    Scanner obj = new Scanner(System.in);
    int no_district = obj.nextInt();
    String district_range = obj.nextLine();
    int 

    char range[] = district_range.toCharArray();
    Arrays.sort(range);
    int result=0;

    for(int i=0;i<range.length;i++)
    {
        result = (int)range[i+1] - (int)range[i] + 1;
    }


     

   }    
}
