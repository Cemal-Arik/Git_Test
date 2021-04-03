package day31_varargsstringbuilder;

public class C4_Varargs03 {

	public static void main(String[] args) {
		 // Verilen integerler'den ilki hariç tüm sayilarý toplayin
        // Bulduðunuz toplam ile ilk sayiyi çarpýp sonucu yazdýrýn
		 toplama(2,5);
	        toplama(5,10,15);
	        toplama(4,5,9,7);
	        toplama(5,6,8,10,45,78,-12);
	        
	        
	    }
	    public static void toplama(int sayi,int... var) {
	    System.out.println("Varargs a dahil ilmayan argumen :"+ sayi);
	        int toplam=0;
	        int carpim=1;
	        for (int each : var) {
	            toplam+= each;
	                    carpim=sayi*toplam;
	        }
	        System.out.println("var daki sayilarin toplami: " + toplam);
	        System.out.println("ilk sayi ile var  toplamlarinin carpimi: "+carpim);
}
	}

