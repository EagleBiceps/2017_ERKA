import java.util.Scanner;

public class Petla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b;
Scanner scanner =new Scanner(System.in);
System.out.println("Podaj liczbe wierszy : ");
a=scanner.nextInt();
System.out.println("Podaj liczbe kolumn : ");
b=scanner.nextInt();
System.out.println("Podaj znak :   ");
char c = scanner.next().charAt(0);
		
		for(int i =0;i < 10;i++) 
{
	for(int j=0;j <10 ;j++)
	{
		System.out.print(c);
	}
	System.out.println("");
	}
}

	
}
