package array;

public class Test {
	int offl = 2;
	public void test2 ()
	{
		int on = 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//For Loop
		int j = 0;
		for (int i=1;i<=10;i=j+i)
		{
			System.out.println("FOR:"+i);
			j = i;
		}


		//While loop
		int k=10;
		while(k<30)
		{
			System.out.println("While:"+k);
			k++;
		}


		//do While loop
		int m=20;
		do
		{
			System.out.println("Do While:"+m);
			m++;

		}
		while(m==30);
		{
			System.out.println("Do While2:"+m);//exe once
		}

		//Nested loop
		//
		//1
		//22
		//333
		//4444

		for(int G=1;G<=4;G++)
		{

			for(int H=1;H<=G;H++)
			{
				System.out.print(H);
			}

			System.out.println();
		}



		System.out.println();
		//1111
		//222
		//33
		//4

		for(int G=1;G<=4;G++)
		{

			for(int H=4;H>=G;H--)
			{
				System.out.print(G);
			}

			System.out.println();
		}
		System.out.println("==========");
		for(int G1=1;G1<=4;G1++)
		{

			for(int H1=1;H1<=5-G1;H1++)
			{
				System.out.print(G1);
			}

			System.out.println();
		}


		System.out.println();
		//1
		//23
		//456
		//78910
		
		int w =1;
		for(int G=1;G<=4;G++)
		{

			for(int H=1;H<=G;H++)
			{
				System.out.print(w);
				w++;
			}

			System.out.println();
		}


		System.out.println("NEW");
		//1234
		//567
		//89
		//10
		int w2 =1;
		for(int q=0;q<4;q++)
		{

			for(int z=1;z<=4-q;z++)
			{
				System.out.print(w2);
				w2++;
			}

			System.out.println();
		}
		System.out.println("Try 2 ============");
		System.out.println();
		
		
		int w3 =1;
		for(int q3=1;q3<=4;q3++)
		{

			for(int z3=1;z3<=5-q3;z3++)
			{
				System.out.print(w3);
				w3++;
			}

			System.out.println();
		}
		System.out.println("Try 3 ============");
		System.out.println();
		
		int w4 =3;
		for(int q4=1;q4<=4;q4++)
		{

			for(int z4=1;z4<=5-q4;z4++)
			{
				System.out.print(w4);
				w4=w4+3;
			}

			System.out.println();
		}
		System.out.println("Try 4 ============");
		System.out.println();
		
		int w5 =3;
		for(int q5=1;q5<=4;q5++)
		{

			for(int z5=1;z5<=q5;z5++)
			{
				System.out.print(w5);
				w5=w5+3;
			}

			System.out.println();
		}
		
		


	}

}
