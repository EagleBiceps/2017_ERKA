
public class WyjscieWejscie {
public static double Policz()
{
	double wynik=100/20;
	System.out.println("jestem bez wejœcia");
	return wynik;
	
}

public static double Policz(int a)
{
double wynik = a/20.0;
System.out.println("Jestem w funkcji z wejœciem");
return wynik;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start programu");
double w =Policz(25);
System.out.println("Wynik po funkcji :  "+ w);
		System.out.println("Koniec programu");
	}

}
