import java.util.*;
class catchfish
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int r,c;
        int arr[][] = new int[r][c];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                arr[i][j] = obj.nextInt();
            }
        }
        int t = fish(arr,r,c);
    }
    public static int fish(int arr[][],int r,int c)
    {
        int max=0;
       for(int i=0;i<arr.length;i++)
       {
        for(int j=0;j<arr.length;j++)
        {
            if(arr[i][j]==0)
            {
                return 0;
            }
            else if(arr[i][j]>max)
            {
              max = arr[i][j];
            }
        }
       }
    }
}