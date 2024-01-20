package intro;

public class Main {

	public static void main(String[] args) {

		String InternetSubeButonu = "İnternet Şubesi";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = true;

		System.out.println(InternetSubeButonu);
		System.out.println(dolarDun);
		System.out.println(vade);
		System.out.println(dustuMu);

		if (dolarBugun < dolarDun) {
			System.out.println("Dolar Düştü Resmi");
		} else if (dolarBugun > dolarDun) {
			System.out.println("Dolar Yükseldi Resmi");
		} else {
			System.out.println("Dolar Eşittir Resmi");
		}

		String kredi1 = "Hizli Kredi";
		String kredi2 = "Mutlu Emekli Kredisi";
		String kredi3 = "Konut Kredisi";
		String kredi4 = "Çiftçi Kredisi";
		String kredi5 = "Msb Kredisi";
		String kredi6 = "Meb Kredisi";
		String kredi7 = "Kültür Baknlığı Kredisi";

		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);

		System.out.println("-----------------------------------------------------------");

		String[] krediler = {
		"Hizli Kredi", 
		"Mutlu Emekli Kredisi",
		"Konut Kredisi",
		"Çiftçi Kredisi",
		"Msb Kredisi",
		"Meb Kredisi",
		"Kültür Baknlığı Kredisi"}; 

		//foreach
		for(String kredi : krediler){
			System.out.println(kredi);
		}
		System.out.println("-----------------------------------------------------------");

		//Sayac Güdümlü Döngü
		for(int i = 0; i<krediler.length;i++){
			System.out.println(krediler[i]);
		}
	
		int[] Sayilar1 = {1,2,3,4,5};
		int[] Sayilar2 = {10,20,30,40,50};
		Sayilar1 = Sayilar2;
		Sayilar2[0] = 100;
		System.out.println(Sayilar1[0]);
		
		
		
		

	}
}
