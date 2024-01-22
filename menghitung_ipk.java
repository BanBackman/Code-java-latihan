import java.util.Scanner;


public class menghitung_ipk {
    public static void main(String[] args) {
    Scanner rizky = new Scanner(System.in);

    float nilai;
    String nama,ket;

    System.out.println("===Menentukan predikat Yudisium berdasarkan Nilai IPK===");
    System.out.print("Masukan Nama Anda = ");
    nama = rizky.nextLine();
    System.out.print("Masukan Nilai IPK = ");
    nilai = rizky.nextFloat();

    if(nilai >= 3.65)
    ket = "Lulus dengan Pujian";

    else if(nilai >= 3.00)
    ket = "Sangat Memuaskan";

    else if(nilai >= 2.50)
    ket = "Memuaskan";

    else if(nilai >= 2.00)
    ket = "Cukup";

    else
    ket = "Tidak Lulus";

    System.out.println(nama+" dengan Nilai IPK "+nilai+" - "+ket);

}
}
