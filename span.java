import java.util.Scanner;

public class span {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int no_of_stack = obj.nextInt();int stacks[] = new int[no_of_stack];int count =0;
        for (int i = 0; i < stacks.length; i++)
        stacks[i] = obj.nextInt();

        for (int i = 1; i < stacks.length; i++) {
            for (int j = i-1; j>=0; j--) 
            {
                  if (stacks[i]<stacks[j]) {
                     count+=1;
                    
                  }  
            }
        }
    }
}
