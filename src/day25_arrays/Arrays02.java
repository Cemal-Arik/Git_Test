package day25_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// Verilen bir Array'de bir elemanin var olup olmadigini nasil kontril ederiz?
		int arr[] = {10, 25, 3, 16, 75};
		int sayi = 75;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==sayi) { flag = true; }
		} 
		if (flag) {
			System.out.println("Array Sorulan Elemani Icerir.");
		} else {
			System.out.println("Array Sorulan Elemani Icermiyor.");
		}
		// Array class'indan method kullanarak yapalim.
		Arrays.sort(arr); // ilk once siralama yapalim. // 
		System.out.println(Arrays.toString(arr)); // [3, 10, 16, 25, 75]
		Arrays.binarySearch(arr, sayi); // sonuc olarak sayinin siralanan array'deki INDEX'ini veriyor.
		System.out.println(Arrays.binarySearch(arr, sayi)); // 4 index'i
		System.out.println(Arrays.binarySearch(arr, 58)); // -5 verdi yani olmasi muhtemel sirasi, sayma sayilarina gore sirayi sayiyor
		int arr2[]= {12,15,25,14,3,12,65};
		Arrays.sort(arr2); // Siralama islemi yapildi
		System.out.println(Arrays.toString(arr2)); // [3, 12, 12, 14, 15, 25, 65]
		System.out.println(Arrays.binarySearch(arr2, 14)); // 3 cunku index'i 3
		System.out.println(Arrays.binarySearch(arr2, 20)); // -6, 20 olsa kacinci sirada olurdu, oranin sira degerini veriyor.
		System.out.println(Arrays.binarySearch(arr2, 12)); // 1 verir, ilkinin indexi
		
		
		// Array nasil String'e cevrilir
        
        String arrayString = Arrays.toString(arr2);
        System.out.println(arrayString);
        System.out.println(arrayString.substring(5)); // bastaki [ dahil tum array'i String'e cevirir
System.out.println(Arrays.binarySearch(arr2,2)); // -1 verir, indexi
	}
}	