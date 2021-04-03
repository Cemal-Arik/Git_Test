package day02_scanner;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {
		
		// Scanner ile kullanicidan bilgi alabiliriz.
		// 3 adimle scanner islemini gerceklestiriyoruz.
		
		// 1.adim Scanner objesi olusturacagiz.
		
		Scanner scan = new Scanner(System.in);
		
		// new : Java da ne zaman new kelimesini gorseniz yeni bir object olusturuluyor demektir.
		// parantezin icine yazilan degerlere parametre diyoruz ve Scanner icin System.in yazmamiz gerekir.
		// Bir kod yazdigimizda kodun alt�nda kirmizi cizgi olusuyorsa veya satir numarasi
		// olan kisimda kirmizi x olusuyorsa bir seyler yanlis demektir.
		// java.util java'nin bizim icin hazirladigi kutuphanedir , ihtiyac�m�z oldugunda ihtiyacimiz olan kodlar�
		// class'a import etmemiz yeterlidir.
		// scan olusturdugumuz Scanner objesine verdigimiz isimdir. Farkl� isimler de verebiliriz.
		// ancak scan ismi tum programcilar taraf�ndan kullan�lan bir isimdir.
		// kodumuzun anlasilabilir ve rahat okunabilir olmasi icin scan ismini kullanmamiz tavsiye edilir.
		
		// 2.adim kullaniciya bir mesaj yazin.
		System.out.println("Karenin bir kenar uzunlugunu girin");
		
		// 3.adim kullanicinin konsola girdigi degeri programimiza alacagiz.
		// ve bir variable olusturup bu degeri atayacagiz.
		// kullanicidan bir kenar uzunlugu istedigim icin kullanici kucuk bir say� da yazabilir,
		// buyuk bir say� da yazabilir,tamsayi da yazabilir, virgullu say� da yazabilir.
		
		double kenar=scan.nextDouble();
		
		System.out.println("girdiginiz kenar uzunluguna sahip karenin alani= "+kenar*kenar);
		scan.close();
		
	}

}
