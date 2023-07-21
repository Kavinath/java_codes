import java.util.*;

public class sumofdiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        int right =0, left =0;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }}
        for(int i=0; i<row; i++){
            right += arr[i][i];
            left += arr[i][row-i-1];
        }
        System.out.println("Right Diagonal: " + right);
        System.out.println("Left Diagonal: " + left);
    }
}