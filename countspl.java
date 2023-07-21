import java.util.*;


public class countspl 
{
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    String str = obj.nextLine();
    int count =0;
    char[] str1 = str.toCharArray();
    for (int i = 0; i < str1.length; i++) {
        if(((int)str1[i]>=48 && (int)str1[i]<=57) || ((int)str1[i]>=65 && (int)str1[i]<=90) || ((int)str1[i]>=97 && (int)str1[i]<123))
        {
           continue;
        }else{
            count+=1;
        }
    } 
    System.out.println(count);
}
}
