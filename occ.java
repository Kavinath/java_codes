import java.util.*;
class occ
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while(t!=0)
        {
            int n = obj.nextInt();
            int arr1[] = new int[n];
            int flag=0;
            for(int i=0;i<n;i++)
            {
                arr1[i] = obj.nextInt();
            }
            Arrays.sort(arr1);
            int k = obj.nextInt();
             for(int i=0;i<n;i++)
             {
                if(k==arr1[i])
                {
                    flag = flag + 1;
                }
                
             }

        }
    }
}