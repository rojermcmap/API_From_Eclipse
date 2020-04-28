package absclas;



public class ABBSCLS extends Sclass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub1
		
	
		
		Trail2 pp = new Trail2();
		pp.Phone501();
		
		Sclass.gym();
 
		
				
		
	}
}

abstract class Abs {
		public abstract void iphone();
		public abstract void OPPO();

		public void Phone501()
		{
			System.out.println("Fraud");
		}

}

abstract class Trail1 extends Abs
{
	public void iphone()
	{
		System.out.println("ios");
	}	
}

class Trail2 extends Trail1 //Concreat class
{
	public void OPPO()
	{
		System.out.println("Android");
	}
}



