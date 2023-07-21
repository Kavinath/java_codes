import java.util.*;
class alex
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int arr[]= new int[n];
		int i =0;
		int count =0;
		int sum =0;
		for (i=0;i<n;i++) {
			arr[i]=obj.nextInt();
		}
			for ( i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i]  == arr[j])
						count++;
				}
	
			}
		
		System.out.println(count/3);
            }
           
            
            
           
            t--;
        }
    }
}
