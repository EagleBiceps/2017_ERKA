import java.util.Scanner;

public class DodawanieXD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// spytaj jaka liczba bêdzie dodawana

		Scanner s =new Scanner(System.in);
		System.out.print("Jak du¿a liczba :  ");
		int rozmiar=s.nextInt();


		//wczytaj liczbe a  i b do tablic
		
		
		byte[] a =new byte[rozmiar];
		byte []  b =new byte[rozmiar];
		byte[] c = new byte[rozmiar+1];
		
		for(int i = rozmiar-1; i>=0; i--)
		{
			System.out.print("A : Podaj cyfre nr:  "+i+": ");
			a[i]=s.nextByte();
			
			
			
			
		}

		for(int i = rozmiar-1; i>=0; i--)
		{
			System.out.print("B: Podaj cyfre nr:  "+i+": ");
			b[i]=s.nextByte();
		}
		

		// dodaj metoda w s³upku 
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
