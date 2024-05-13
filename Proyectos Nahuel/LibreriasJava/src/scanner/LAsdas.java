package scanner;

import java.util.Scanner;

public class LAsdas {

	public static int ScannerInteger(int integer) {
		Scanner leer = new Scanner(System.in);
		integer = leer.nextInt();
		leer.close();
		return integer;
	}
	

	public static String ScannerString (String string) {
		Scanner leer = new Scanner(System.in);
		string = leer.next();
		leer.close();
		return string;
	}
	public static double Scannerdouble(double doble){
		Scanner leer = new Scanner(System.in);
		doble = leer.nextDouble();
		leer.close();
		return doble;
	}

}
