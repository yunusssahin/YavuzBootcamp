// Dizilerdeki tekrarl� say�lar� silme

package Homework;
public class Main {
	public static void main(String[] args) {
		
		int[] array = {1,1,2,3,2,6,5,2,11,11,3,5};
		int sayac = 0;
		for(int i = 0 ; i < array.length ; i++) {
	//�ncelikle tekrar eden say�lar�n hepsine dizinin birinci elaman�n� bas�yoruz.	
			for(int j = 0 ; j < array.length ; j++) {
				if(i == j) {
					break;
				}else if(array[i]==array[j]) {
					sayac++; // kac adet sayinin tekrar etti�ini buluyoruz.
					array[j] = array[0];
					
				}
			}
			
		}
		int temp[]= new int[array.length - sayac];// yeni olu�turdu�umuz dizinin kapasitesini belirlerken tekrar eden say� adedini d��eriz.
		temp[0] = array[0];
		int sayac2 = 0;// ikinci bir sayac ile s�ras� ile yeni dizimize eklenecek say�lar�n dizi numaras�n� tutar�z.
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