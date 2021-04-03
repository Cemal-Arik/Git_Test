package day01_variables;

public class C2_Variables {

	public static void main(String[] args) {
		
		int sayi; //;yazim dilindeki . gibidir. java ;'u görünce o satirdaki kod yaziliminin bittiðini anlar.
		sayi=27;
		
		
		
		System.out.print(sayi); //eger println yerine print yazarsak yazdirma isleminden
								//sonra alt satira gecmez.
		
		char ilkHarf='C';
		
		System.out.println(ilkHarf); // println yazinca yazma isleminden sonra alt satira gecer. 
		
		double sayiDouble = 5.34;
		
		System.out.println(sayiDouble);
		
		System.out.println(sayi+sayiDouble); // 32.34
		
		System.out.println(sayi+ilkHarf); // 27+67(ascii)=94
		// eger bir toplama isleminde char degisken kullanilirsa karakterin Ascii degeri ile toplama yapar.
		
		
		
	}
	
}
