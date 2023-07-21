import java.util.Scanner;
class minimum
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int a[] = new int[n];
        int min=0,count=1;
        for(int i=0;i<n;i++)
        {
           a[i]= obj.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            if(min<a[j])
            {
            min=a[j];
        }
        else 
        {
            count++;
            min=a[j];
        }
        


    }System.out.print(count);
    }
}