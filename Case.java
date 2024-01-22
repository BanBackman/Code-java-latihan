import java.util.Scanner;

public class Case {
    public static void main(String[] args){
            String ulang;
            Scanner scanner = new Scanner(System.in);
            do{
                System.out.println("Masukan pilihan (a/b/c)=");    

                 //inisiasi variabel dan nilai di input dari user
                String pilihan = scanner.nextLine();

            switch (pilihan){
                case "a":
                    System.out.println("Anda memilih a");
                    break;
                case "b":
                System.out.println("Anda memilih b");
                break;
                case "c":
                System.out.println("Anda memilih c");
                break;
                default:
                System.out.println("Pilihan anda tidak terdaftar di case");
                    break;
            }
            System.out.println("Tekan 'y' untuk mengulang");
            ulang = scanner.nextLine();
        }while(ulang.equals("y"));
    }
}
