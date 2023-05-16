public class Main
{
	public static void main(String[] args) {
		
		int i,j,space;
		int rows=4;
		for(i=0;i<rows;i++)
		{
		    for(space=rows;space>i;space--)
		    {
		        System.out.print(" ");
		        
		    }
		    
		    
		    for(j=0;j<=i;j++)
		    {
		        System.out.print("* ");
		    }
		    System.out.println();
		    
		    
		}
	}
}
