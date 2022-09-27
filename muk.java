package muk;
import java.util.Scanner;
public class muk {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Lütfen bir sayı giriniz : ");
	     int sayi = scanner.nextInt();
	     int toplam=0;
	     for(int i=1; i<sayi;i++)      
	     {
	     if(sayi%i==0) {
	    	 
	     toplam+=i;
	    	
	     }
	    	 
	     }
	     if(toplam==sayi) {
	    	 
	    	 System.out.println(sayi+"Sayisi bir mükemmel sayidir "); 
	     }
	     else {
	    	 System.out.println(sayi+" Sayisi bir mükemmel sayi değildir. "); 
	     }
	    
	  }
}
