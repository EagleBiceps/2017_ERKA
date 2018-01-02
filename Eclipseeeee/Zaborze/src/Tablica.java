import java.util.Scanner;

public class Tablica {
	public static void wczytaj(int[]a)
	{
		Scanner scanner = new Scanner(System.in); 
		//1.wczytaj zmienne
		for(int i=0;i<a.length; i++)
		{
			a[i]=scanner.nextInt();


		}
		scanner.close();



	}

	public static void sortuj(int[]a)
	{

		//2.sortuj
		for(int i=a.length-1; i >=1;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(a[j]>a[j+1])
				{
					//zamieñ
					int bok=a[j];
					a[j]=a[j+1];
					a[j+1]=bok;

				}
			}

		}



	}

	public static void wypisz(int[]a)
	{

		//3.wypisz posortowane
		for(int i=0;i<a.length; i++)
		{
			System.out.print(a[i] + ",");

		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= new int [15];
		wczytaj(a);

		sortuj(a);
		wypisz(a);


	}

}
