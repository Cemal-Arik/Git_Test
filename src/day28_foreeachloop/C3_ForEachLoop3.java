package day28_foreeachloop;

import java.util.ArrayList;
import java.util.List;

public class C3_ForEachLoop3 {

	public static void main(String[] args) {
		
		// Verilen bir array'deki tum elemanlari bir listeye aktaran
		// bir method yaziniz.
		
		String arr[] = {"Ali","Veli","Ayse","Fatma"};
		
		List<String> list = listeyeCevir(arr);
		
		list.add(0,"Bu is bu kadar diye ekledik");
        System.out.println(list);
		
		
	}

	private static List<String> listeyeCevir(String[] arr) {
		
		List<String> geciciList = new ArrayList<>();
        
        for (String each : arr) {
            
            geciciList.add(each);
        }
        
        
        return geciciList;

	}

}
