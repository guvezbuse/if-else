package ifelse;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		/* klavyeden girilen öğrenci notu 90 dan büyükse A, 80 den büyükse B,
		   70 den büyükse C, 60 dan büyükse D, hiçbiriyse F yazan program */
		
		Scanner input = new Scanner(System.in);
		/* scanner kullanıcının girecegi veriyi okumak için tanımlanmıs bir sınıftır. Bu sınıfı tanımlamak için
		yandaki uyarıdan import etmek gerekir. input değişken adıdır. */
		
		System.out.println("Ogrenci Notunu Tamsayi Olarak Girin.");
		
		int ogrenciNotu = input.nextInt();
		if(ogrenciNotu >= 90) {  
			System.out.println("A");
		    System.out.println("Gecti.");
		}
		//if komutundan sonra süslü parantez kullanılmazsa sadece arkasındaki bir satırı çalıştırır.
		// süslü parantez açılarak kod bloğu oluşturulmalıdır.
		else if(ogrenciNotu >= 80)
			System.out.println("B");
		else if(ogrenciNotu >= 70)
			System.out.println("C");
		else if(ogrenciNotu >= 60)
		System.out.println("D");
		else {
		System.out.println("F");
		System.out.println("Kaldi.");
		}
		/*else ifadesinin altına 2. bir komut yazarken süslü parantez 
		kullanılmazsa üstteki değerler için de 2. komut çalışır ve program doğru çalışmayabilir. */
	     
	
     }
		
	
}		



