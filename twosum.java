import java.util.*;
class twosum
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int arr[]= new int[n];
        int i,j=0;
        for(i=0;i<n;i++)
        {
            arr[i] = obj.nextInt();
        }
        int Given = obj.nextInt();
        int flag=0;
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j] == Given)
                {
                    System.out.println("True");
                    flag=1;
                    break;
                }
                else if((i==n-1)&&(j==n))
                System.out.println("False");
            }
            if(flag==1)
            break;
        }
    }
}
