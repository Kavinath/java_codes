import java.util.*;

 class patt {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		int row=obj.nextInt();
		int col=obj.nextInt();


		  for (int i = row; i > 0; i--) 
		{ 
		    for (int j = col; j > i; j--) 
		        System.out.print(j); 
		 
		    for (int j = i; j > 0; j--) 
		        System.out.print(i);
		 
		    System.out.println(); 
		} 
			}

		
	

}
