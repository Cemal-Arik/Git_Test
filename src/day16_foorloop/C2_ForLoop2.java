package day16_foorloop;

import java.util.Scanner;

public class C2_ForLoop2 {

	public static void main(String[] args) {
		
				// Kullanicidan 2 tamsayi alin
				// ilk sayidan, ikinci sayiya kadar tum tamsayilari
				// yanyana aralarinda bosluk olarak yazdirin
				
				Scanner scan=new Scanner(System.in);
				System.out.println("Lutfen 2 Tamsayi giriniz");
				int sayi1=scan.nextInt();
				int sayi2=scan.nextInt();
				
				if (sayi1>sayi2) {
					
					for (int i = sayi1; i >=sayi2; i--) {
						System.out.print(i + " ");
					}
					
					
				} else { // sayi1<=sayi2
					
					for (int i = sayi1; i <= sayi2; i++) {
						System.out.print(i + " ");
					}

				}

				scan.close();
	}

}
