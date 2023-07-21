import java.util.*;

public class highesttwo 
{
  public static void main(String[] args)
  {
    Scanner obj = new Scanner(System.in);
    int no_of_sales = obj.nextInt();
    int[] sales = new int[no_of_sales];
    for (int i = 0; i < sales.length; i++) {
        sales[i] = obj.nextInt();
    }
    Arrays.sort(sales);
    int highest = sales[no_of_sales-1] + sales[no_of_sales-2];
    System.out.println(highest);

  }    
}
