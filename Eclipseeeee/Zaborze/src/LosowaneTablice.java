import java.util.Random;
public class LosowaneTablice 

{

	public static void wypisz(int [] liczby) 
	{
		for(int i =0;i < liczby.length;i++)
		{
			System.out.print(liczby[i] +",");

		}

	}


	


		
	
	public static void LosujLiczby(int[]liczby,int start)
	{
		for(int i =0;i < liczby.length;i++)
		{
			Random generator= new Random ();
			liczby [i]= (generator.nextInt()% 10);
			if (liczby[i]<0)liczby[i]*=-1;
			liczby[i]+=start;
			
		}
	}
	
			
			
			public static void LosujLiczby(int[]liczby)
			
			{
				
				
				LosujLiczby(liczby,0);
				
				
				
				
			}

		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] liczby=new int[10000];

		LosujLiczby(liczby);

		wypisz(liczby);
	}

}
