package introo;

public class Main {

	public static void main(String[] args) {
		String internetSubeButonu = "İnternet şubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.18;
		int vade = 36;
		boolean dustuMu = false;
		System.out.println(internetSubeButonu);
		
		if (dolarBugun<dolarDun) 
			System.out.println("dolar düştü");
		else if(dolarBugun>dolarDun)
			System.out.println("dolar yükseldi");
		else
			System.out.println("değişmedi");
		
		String[] krediler = {"1.","2.","3.","4.","5."};
		//foreach
		for(String kredi : krediler) {	
			System.out.println(kredi);
			}
		//for
		for(int i=0; i<krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		//i=i+1 -> eşitliğin önce sağı çalışır 
		
		//değer tip
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 30;
		System.out.println(sayi1);
		System.out.println(sayi2); 
		
		//referans tip
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 80;
		System.out.println(sayilar1[0]);
		System.out.println(sayilar2[2]);
		
		
}
}
