import java.util.Scanner;

public class PetlaDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
int number;
int sum=0;
double av=0;
int i =0;
int max =Integer.MIN_VALUE;
int min = Integer.MAX_VALUE;
do 
{ System.out.print("Podaj liczbê: ");
	number = scanner.nextInt();
	sum=sum+number;
	System.out.println("suma to :  "+sum);
	i++;
	av=(double)sum/i;
	System.out.println("srednia wynosi:  "+av);
	if((number > max) && (number !=0) )
	{
	max = number;
	}
	
	if((number > min ) && (number !=0))
	{
	min = number;
	}
}while(number  !=0);
System.out.println("suma wynosi:  "+sum);
System.out.println("srednia wynosi : "+av);
System.out.println("max wynosi:  "+max);
System.out.println("min wynosi:  "+min);
scanner.close();
	}

}
