import java.util.Scanner;

public class DodawanieStringi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s =new Scanner(System.in);
		System.out.print("Podaj pierwsz� liczbe : "); 
		String liczba1 = s.nextLine();
		System.out.print("Podaj drug� liczbe : ");
		String liczba2 = s.nextLine();

		int rozmiar = 0;
		int r1=liczba1.length();
		int r2=liczba2.length();

		if(r1>r2) rozmiar = r1;
		else rozmiar =r2;


		byte[] a =new byte[rozmiar];
		byte []  b =new byte[rozmiar];
		byte[] c = new byte[rozmiar+1];


		for(int i = 0;i<r1;i++)
		{
			a[i]=0;
			b[i]=0;

		}
		for(int i = 0;i<r1;i++)
		{
			char znak =liczba1.charAt(r1-i-1);
			String cyfra=Character.toString(znak);
			a[i]=Byte.parseByte(cyfra);


		}

		for(int i = 0;i<r2;i++)
		{
			char znak =liczba2.charAt(r2-i-1);
			String cyfra=Character.toString(znak);
			b[i]=Byte.parseByte(cyfra);


		}

		// dodaj metoda w s�upku 
		byte p =0;
		for(int i =0;i<rozmiar;i++)
		{
			c[i]= (byte)(a[i] + b[i] + p);
			if(c[i] > 9)
			{
				p=1;
				c[i]=(byte) (c[i] % 10);
			}
			else
			{
				p=0;
			}

			//3a ostatnie przeniesienie

			c[rozmiar]=p;
		}
		//wypisz wynik
		for(int i=rozmiar;i>=0;i--)
		{
			System.out.print(c[i]);
		}


	}


}