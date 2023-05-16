public class Main
{
	public static void main(String[] args) {
		
		int i,j,space;
		int rows=4;
		for(i=1;i<=rows;i++)
		{
		    for(space=1;space<i;space++)
		    {
		        System.out.print(" ");
		        
		    }
		    
		    
		    for(j=i;j<=rows;j++)
		    {
		        System.out.print("* ");
		    }
		    System.out.println();
		    
		    
		}
	}
}
