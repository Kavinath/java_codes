import java.util.Scanner;
class rowsum
{
    public static void main(String args[])
    {
     Scanner obj=new Scanner(System.in);
    int row = obj.nextInt();
    int col = obj.nextInt();
    int arr[][] = new int[row][col];
    int a[]=new int[row];
    int add=0;
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<col;j++)
        {
            arr[i][j] = obj.nextInt();
            add=add+arr[i][j];
            a[i]=add;

        }add=0;
    }
    
    for(int i=0;i<row;i++,System.out.println(" "))
    {
        System.out.println("the sum of row is " + a[i]);
    }
}
}