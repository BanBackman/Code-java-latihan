public class runBidang {

	public static void main(String [] args) {

		System.out.println("===============================");
		System.out.println("UTS STRUKTUR DATA DAN ALGORITMA");
		System.out.println("===============================");
		System.out.println("Nama : RIZKY PRATAMA");
		System.out.println("Nim : 701210181");
		System.out.println("Kelas : 3C SISTEM INFORMASI");
		System.out.println("===============================");

		Persegipanjang1 persegipanjang1 = new Persegipanjang1();
		persegipanjang1.panjang = 100;
		persegipanjang1.lebar = 2;

		Persegipanjang2 persegipanjang2 = new Persegipanjang2();
		persegipanjang2.panjang = 10;
		persegipanjang2.lebar = 1;

		Segitiga segitiga1 = new Segitiga();
		segitiga1.alas = 2;
		segitiga1.tinggi = 3;

		System.out.println("Luas Persegi panjang besar = "+persegipanjang1.hitungluas());
		System.out.println("Luas Persegi panjang kecil = "+persegipanjang2.hitungluas());
		System.out.println("Luas Segitiga = "+segitiga1.hitungluas());
		
		double LuasBidangBiru = persegipanjang1.hitungluas()-persegipanjang2.hitungluas()-segitiga1.hitungluas();

		System.out.println("Luas Bidang Biru = "+LuasBidangBiru);
	}
}  