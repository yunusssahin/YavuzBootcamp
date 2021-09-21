// Dizilerdeki tekrarlý sayýlarý silme

package Homework;
public class Main {
	public static void main(String[] args) {
		
		int[] array = {1,1,2,3,2,6,5,2,11,11,3,5};
		int sayac = 0;
		for(int i = 0 ; i < array.length ; i++) {
	//öncelikle tekrar eden sayýlarýn hepsine dizinin birinci elamanýný basýyoruz.	
			for(int j = 0 ; j < array.length ; j++) {
				if(i == j) {
					break;
				}else if(array[i]==array[j]) {
					sayac++; // kac adet sayinin tekrar ettiðini buluyoruz.
					array[j] = array[0];
					
				}
			}
			
		}
		int temp[]= new int[array.length - sayac];// yeni oluþturduðumuz dizinin kapasitesini belirlerken tekrar eden sayý adedini düþeriz.
		temp[0] = array[0];
		int sayac2 = 0;// ikinci bir sayac ile sýrasý ile yeni dizimize eklenecek sayýlarýn dizi numarasýný tutarýz.
		for(int i = 1 ; i<array.length ; i++) {
			if(array[i]!=array[0]) {
				sayac2++;
				temp[sayac2]=array[i];
				//System.out.println(array[i]);
			}
				//System.out.println(array[i]);
			
		}for(int i = 0 ; i<temp.length ; i++) {
			System.out.println(temp[i]);
			
		}
	}
}