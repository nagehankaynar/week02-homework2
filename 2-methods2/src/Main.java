
public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		String yenimesaj = sehirVer();
		System.out.println(yenimesaj);
		//mesaj.substring(0,2);
		int sayi=topla(5,9);
		System.out.println(sayi);
		int toplam = topla2(1,3,5,7,9);
		System.out.println(toplam);

		
	}
	
	public static void ekle() {
		System.out.println("Eklendi");

}

	public static void guncelle() {
		System.out.println("Güncellendi");

}
	public static void sil() {
		System.out.println("Silindi");

}
	
	public static int topla(int sayi1, int sayi2) {
		
		return sayi1+sayi2;
		
	}
	
	public static int topla2(int... sayilar) {
		int toplam =0;
		for(int sayi : sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}
	public static String sehirVer() {
		
		return "Ankara";
		
	}
}