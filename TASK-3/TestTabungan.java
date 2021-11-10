import java.util.Scanner;
/**
 * Sebuah class yang berisi method main yang bertujuan untuk menjalankan output
 * @author Abdul Hafidh
 * @version 2021.11.02
 */
public class TestTabungan 
{
    public static void main(String[] args)
    {
        // Inisialisasi Variabel
        int pilihan;
        String nama;
        String kalimat;
        long noRek;
        double saldoAwal;
        boolean condition = true;

        while (condition) {
        
        Scanner inputLagi = new Scanner(System.in);
        
        System.out.println("================== SELAMAT DATANG DI APLIKASI TABUNGAN SEDERHANA ================");
        System.out.println("Berikut ini adalah menu yang tersedia di aplikasi tabungan sederhana ini");
        String menu = """
       |===========     MENU      ==============|
       |===========  1. Bisnis    ==============|
       |===========  2. Haji      ==============|
        """;
        System.out.println(menu);
        Scanner in = new Scanner(System.in);
        System.out.println("SILAHKAN PILIH JENIS YANG ANDA INGINKAN: ");
        pilihan = in.nextInt();

        Scanner inputNama = new Scanner(System.in);
        System.out.print("Masukkan nama anda terlebih dahulu: ");
        nama = inputNama.nextLine();

        Scanner inputNoRek = new Scanner(System.in);
        System.out.print("Masukkan no rekening anda: ");
        noRek = in.nextLong();

        Scanner inputSaldoAwal = new Scanner(System.in);
        System.out.print("Input saldo awal anda: ");
        saldoAwal = in.nextDouble();

         // Membuat objek
         Bisnis objekBisnis = new Bisnis(nama, noRek, saldoAwal);
         Haji objekHaji = new Haji(nama, noRek, saldoAwal);

        switch (pilihan){
            case 1:
               
                break;
            case 2:

                break;
        
            default:
            System.out.println("Maaf pilihan yang anda masukkan tidak tersedia");
                break;
        }
        
         System.out.println("Apakah anda ingin menarik uang lagi?: ");
         kalimat = inputLagi.nextLine();

         if(kalimat.equalsIgnoreCase("y")){
            condition = true;
         }else{
            condition = false;
         }

          // Menutup Inputan
          in.close();
          inputLagi.close();
          inputNama.close();
          inputNoRek.close();
          inputSaldoAwal.close();
       
       }
       
    }

}

