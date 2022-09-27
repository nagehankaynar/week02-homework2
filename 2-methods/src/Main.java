
public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		//mesajVer(7);

	}
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {8,9,7,4,1,3};
		int aranacak = 8;
		boolean varmi = false;
		
	for(int sayi : sayilar) {
		if(sayi == aranacak) {
			varmi = true;
			break;
		
		}
	}
	
	String mesaj="";
	if(varmi) {
		mesaj = "Sayı bulunuyor " + aranacak;
		mesajVer(mesaj);
	}
	else {
		mesajVer("Sayı bulunmuyor : " + aranacak);
	}
	
	}
	
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}

