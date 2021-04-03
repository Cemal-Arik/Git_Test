package day03_scannerincrementdecrement; 

import java.util.Scanner;

public class C1_Scanner1 {

	public static void main(String[] args) {
		
		//kullanicidan isim ve soyismini isteyip
		//isim : cemal
		//soyisim : arik
		//kursumuza kaydiniz alinmistir, tesekkur ederiz. 
		// seklinde yazdirin.
		// Scanner : kullanicidan bilgi almak icin kullaniyoruz.
		// 3 adimda islemi tamamliyoruz.
		// 1. adim Scanner objesi olusturyoruz.
		// Scanner'in calismasi icin Java.util(utlities) kutuphanesinden ilgili
		// kismi classimiza import etmeliyiz.
		
		
		Scanner scan= new Scanner(System.in);
		
		// 2.adim kullaniciya ne istedigimizi belirten bir mesaj yazmaliyiz.
		
		System.out.println("Lutfen sadece isminizi giriniz");
		
		// 3.adim bir variable olusturup kullanicinin girdigi degeri atayacagiz
		
		String name = scan.nextLine();
		
		System.out.println("Lutfen sadece soyisminizi giriniz");
		
		// String surname = scan.next(); // bu sekilde yazarsak sadece ilk kelimeyi alir sonrakileri almaz.
		String surname = scan.nextLine();
				
		// benden istenen sekilde ciktiyi yazdirabilirim.
		// eger yazdiracagimiz yazi sabit bir yazi ise " arasinda yazdiriyoruz.
		// "" olmadan sadece variable ismini yaziyoruz.
		
		System.out.println("Isminiz : " + name);
		System.out.println("Soyisminiz : " + surname);
		System.out.println("Kursumuza kaydiniz alinmistir, tesekkur ederiz");
		
		
		scan.close();		
		
		
	} 
		

	

}
