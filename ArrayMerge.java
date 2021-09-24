package MergeArrays;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] array1 = {5,1,3,8,9,2,6,6,2};
		int[] array2 = {1,2,3,4,5,5,4,8,10};
		int sayac1 = 0;					
		int sayac2 = 0;
		Arrays.sort(array1);
		Arrays.sort(array2);

		for(int i = 0 ; i < array1.length - 1 ; i++) {//array1 deki tekrarlar� array1[0] yap�yorum
			if(array1[i]==array1[i +1]) {
				array1[i+1]=array1[0];	
			}
		}
			
		for(int i = 0 ; i < array2.length - 1 ; i++) {//array2 deki tekrarlar� array1[0] yap�yorum
				if(array2[i]==array2[i +1]) {
					array2[i+1]=array1[0];
			}
		}
		
	for(int i = 0; i < array1.length; i++) {//array1 dizisinde ka� adet array1[0] oldu�unu bulma
		if(array1[i]==array1[0]) {
			sayac1++;
		
		}
	}	//System.out.println(sayac1);
		for(int i = 0 ; i<array2.length ; i++) {//array2 dizisinde ka� adet array1[0] oldu�unu bulma
			if(array2[i]==array1[0]) {
				sayac1++;
			}
			
		}
		for(int i = 0; i < array1.length ; i++) { // array1 ve array2 dizilerini kar��la�t�r�p ayn� olan say�lar� array2 dizisinde array1[0] yap�yorum
			for(int j = 0 ; j < array2.length; j++) {
				if(array1[i]!=array1[0] && array2[j]!=array1[0] && array1[i]==array2[j]) {
					array2[j]=array1[0];
					sayac2++;						// iki dize aras�ndaki ortak say�lar�n adedi
				}
			}
			
		}
		int arrayMerge[]= new int[array1.length + array2.length + 1 -sayac1 - sayac2];//
		arrayMerge[0]=array1[0];
		int mergeIndex = 1;
		for(int i = 1; i < array1.length; i++ ) {//�nce array1 in t�m elemanlar�n� arrayMerge bas�p ard�ndan array2 nin array1[0] olmayan elemanlar�n� arrayMerge bas�yorum
			if(array1[i]!=array1[0]) {
			arrayMerge[mergeIndex] = array1[i];
			mergeIndex++;
			}
		}
		for(int j = 0 ; j<array2.length ; j++) {	
		    	if(array2[j]!=array1[0]) {
		    		arrayMerge[mergeIndex]=array2[j];
		    		mergeIndex++;
			}
		}
				  Arrays.sort(arrayMerge);
		for(int k = 0 ; k <arrayMerge.length ; k++) {
			System.out.print(arrayMerge[k]+",");
		}
	}

}
