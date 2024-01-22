import java.util.Scanner;

public class menilai_karakter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tugas MK struktur data dan algoritma, membuat program sederhana");
        System.out.println("Nama = RIZKY PRATAMA (701210181)");
        System.out.println("===============================================================");
        System.out.println("Menilai karakter berdasarkan warna favorit");
        System.out.println("Pilih warna favorit anda:");
        System.out.println("1. Merah");
        System.out.println("2. Putih");
        System.out.println("3. Hitam");
        System.out.println("4. Biru ");
        System.out.println("5. Hijau");
        System.out.println("---------------------------");
        System.out.println("pilihan anda : 1/2/3/4/5 = ");

        //inisiasi variabel dan nilai di input dari user
        String pilihan = scanner.nextLine();

        switch (pilihan) {
            case "1":
                System.out.println("-------------");
                System.out.println("Warna merah :");
                System.out.println("Warna Merah menggambarkan mereka yang memiliki potensi dalam berpikir dan bertindak.");
                System.out.println("Karakteristik Merah adalah kemauan yang kuat, mandiri, cepat, pemberani, dan pantang menyerah.");
                break;

            case "2":
            System.out.println("-----------");
            System.out.println("Warna putih");
            System.out.println("warna putih adalah memiliki damai dan tenang, mereka akan memiliki sisi positif dalam berbagai hal yang terjadi dalam hidupnya.");
            System.out.println("Bahkan ketika situasi sedang sulit dan enggak berpihak padanya sekali pun, mereka tetap melihat hal-hal baik dari suatu kondisi.");
            break;

            case "3":
            System.out.println("-----------");
            System.out.println("Warna hitam");
            System.out.println("warna hitam, biasanya cenderung mempunyai sebuah kepribadian melindungi diri dari sekitar dan juga tertutup.");
           System.out.println("Seseorang yang menyukai warna hitam ini, akan melindungi dirinya supaya tidak mudah tersakiti, serta menjauhkan hidupnya dari segala sesuatu yang dia anggap negatif.");
            break;

            case "4":
            System.out.println("----------");
            System.out.println("Warna biru");
            System.out.println("warna biru diklaim sebagai warna yang menenangkan. Tak heran jika penyuka warna biru adalah individu yang cenderung lebih suka ketenangan dan kedamaian.");
            System.out.println("Tak hanya pada pasangan, penyuka warna biru diklaim sangat setia kepada teman atau kerabat.");
            break;

            case "5":
            System.out.println("-----------");
            System.out.println("Warna hijau");
            System.out.println("warna hijau dikenal sebagai pribadi yang sangat loyal pada orang-orang yang dikasihi dan dekat dengannya.");
            System.out.println("Mereka sangat setia kawan dan mau membantu juga mendukung usaha yang sedang dilakukan temannya. Mereka juga dikenal sebagai pribadi yang selalu bisa diandalkan ketika dibutuhkan.");
            break;


            default:
            System.out.println("Pilihan anda tidak terdaftar di case");
                break;
        }
    }
}
