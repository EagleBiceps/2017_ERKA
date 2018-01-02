import java.util.Scanner;

public class Sumowanie {

	



	

		

		public static void main(String[] args) 

		{

			

			Scanner scanner = new Scanner(System.in);

			

			System.out.print("Podaj Liczbê a:	" );

			int a = scanner.nextInt();

			

			System.out.print("Podaj Liczbê b:	" );

			int b =  scanner.nextInt();

			

			scanner.close();

			

			int sum =		 a + b;

			int mn =		 a*b;

//			float dz = 		 (float)a/b;

			double dz =		 (double)a/b;

			int roz =		 a-b;

			double pie =	 Math.sqrt(a);

			double pot =	 Math.pow(a, b);

			double bez = 	 Math.abs(a-b) ;

			int dzCalc = 	 a/b;

			int reszta = a%b;

			

			System.out.println("suma wynosi: "+ sum);

			System.out.println("iloczyn wynosi: "+ mn);

			System.out.println("iloraz wynosi: "+ dz);

			System.out.println("ró¿nica wynosi:	"+ roz);

			System.out.println("Pierwiastek wynosi: "+ pie);

			System.out.println("potêga wynosi: "+ pot);

			System.out.println("bezwzglêdna wynosi: "+ bez);

			System.out.print("a/b = "+ dzCalc);

			System.out.println(" reszta "+ reszta);

		}



	}