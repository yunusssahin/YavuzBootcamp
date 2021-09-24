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

		for(int i = 0 ; i < array1.length - 1 ; i++) {//array1 deki tekrarları array1[0] yapıyorum
			if(array1[i]==array1[i +1]) {
				array1[i+1]=array1[0];	
			}
		}
			
		for(int i = 0 ; i < array2.length - 1 ; i++) {//array2 deki tekrarları array1[0] yapıyorum
				if(array2[i]==array2[i +1]) {
					array2[i+1]=array1[0];
			}
		}
		
	for(int i = 0; i < array1.length; i++) {//array1 dizisinde kaç adet array1[0] olduğunu bulma
		if(array1[i]==array1[0]) {
			sayac1++;
		
		}
	}	//System.out.println(sayac1);
		for(int i = 0 ; i<array2.length ; i++) {//array2 dizisinde kaç adet array1[0] olduğunu bulma
			if(array2[i]==array1[0]) {
				sayac1++;
			}
			
		}
		for(int i = 0; i < array1.length ; i++) { // array1 ve array2 dizilerini karşılaştırıp aynı olan sayıları array2 dizisinde array1[0] yapıyorum
			for(int j = 0 ; j < array2.length; j++) {
				if(array1[i]!=array1[0] && array2[j]!=array1[0] && array1[i]==array2[j]) {
					array2[j]=array1[0];
					sayac2++;						// iki dize arasındaki ortak sayıların adedi
				}
			}
			
		}
		int arrayMerge[]= new int[array1.length + array2.length + 1 -sayac1 - sayac2];//
		arrayMerge[0]=array1[0];
		int mergeIndex = 1;
		for(int i = 1; i < array1.length; i++ ) {//önce array1 in tüm elemanlarını arrayMerge basıp ardından array2 nin array1[0] olmayan elemanlarını arrayMerge basıyorum
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
