package day02_scanner;

import java.util.Scanner;

public class C3_Scanner3 {

	public static void main(String[] args) {
		//Kullanicidan ismini ve soyismini alip aralarýnda bir bosluk birakarak
		//isim ve soyismi yazdirin
		//Mehmet , Bulutluoz => Mehmet Bulutluoz
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("lutfen isminizi giriniz");
		
		String name=scan.nextLine(); 
		// Sadece next() secilirse kullanici birden fazla kelime girse bile ilk kelimeyi alýr.
		// Eger kullanicinin girdiði tum yazýyý almak istersek nextLine() secmeliyiz.
		
		System.out.println("lutfen soysisminizi giriniz");
		
		String surname= scan.nextLine();
		
		System.out.println(name + " "+ surname);
		scan.close();
	}

}
