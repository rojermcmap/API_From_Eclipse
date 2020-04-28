package arratlst;

public class ArrayList1 {

	public int a[]={1,2,2,4,34,55,90,1};
	int k = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList1 execu = new ArrayList1();
		execu.SS();
		
		
	}
	
	public void SS()
	{
		
		
		for (int i=0;i<=(a.length)-1;i++)
			
		{
			k = 1;
			for (int j=i+1;j<=(a.length)-1;j++)
			
			{

			if (a[i]==a[j])
				
			{
				
				k++;
				
				
					
			}
			
			}
			
			System.out.println(a[i]+"repeated"+k);
		}
	}

}
