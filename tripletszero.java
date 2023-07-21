import java.util.*;
public class tripletszero
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int arr[] = new int[num];
        ArrayList<ArrayList> given = new ArrayList<>();
        for(int i=0;i<num;i++)
        arr[i] = obj.nextInt();


        for(int i=0;i<num;i++)
        {
            for(int j = i+1;j<num;j++)
            {
                for(int k = j+1;k<num;k++)
                {
                     ArrayList<Integer> result = new ArrayList<>();
                    if(arr[i]+ arr[j] + arr[k] == 0)
                    {
                        result.add(arr[i]);
                        result.add(arr[j]);
                        result.add(arr[k]);
                        given.add(result);


                    }
                }
            }
        }
        System.out.println(given);
    }
}


