import java.util.*;
public class patt1{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int rows = obj.nextInt();
        int num= 1;
    
        for(int i=1;i<=rows;i++) {
    
          for(int j=1;j<=i;j++) {
            System.out.print(num + " ");
            num++;
          }
    
          System.out.println();
        }
    }
}