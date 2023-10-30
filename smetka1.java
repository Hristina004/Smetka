package Proekt2;
import java.util.Scanner;
public class smetka1 {

	public static void main(String[] args) {
		double smetka=0;
		System.out.println("Vnesi sto si pazaruval vo kg");
		Scanner tastatura= new Scanner(System.in);
		
		System.out.println("jabolki");
		double jabolki=  tastatura.nextDouble();
		System.out.println ("krusi");
		double krusi= tastatura.nextDouble();
		System.out.println ("Grozje");
		double grojze= tastatura.nextDouble();
		
		smetka=jabolki*50 + krusi*60 + grojze*100;
		System.out.println("Smetkata iznesuva"+ smetka+ "den");

	}

}
