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
        double saldoAwal = 0;
        double jumlahPenarikan = 0;
        boolean condition = true;

        // Membuat 5 method scanner
        Scanner inputLagi = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        Scanner inputNama = new Scanner(System.in);
        Scanner inputNoRek = new Scanner(System.in);
        Scanner inputSaldoAwal = new Scanner(System.in);
     


        while (condition) {
        
        
        
        System.out.println("================== SELAMAT DATANG DI APLIKASI TABUNGAN SEDERHANA ================");
        System.out.println("Berikut ini adalah menu yang tersedia di aplikasi tabungan sederhana ini");
        String menu = 
        """
       |===========     MENU      ==============|
       |===========  1. Bisnis    ==============|
       |===========  2. Haji      ==============|
        """;
        System.out.println(menu);
        
        System.out.println("SILAHKAN PILIH JENIS FITUR TABUNGAN YANG ANDA INGINKAN: ");
        pilihan = in.nextInt();

        

        System.out.print("Masukkan nama anda terlebih dahulu: ");
        nama = inputNama.nextLine();

        
        System.out.print("Masukkan no rekening anda: ");
        noRek = in.nextLong();

       
        System.out.print("Input saldo awal anda: ");
        saldoAwal = in.nextDouble();

         // Membuat objek
         Bisnis objekBisnis = new Bisnis(nama, noRek, saldoAwal);
         Haji objekHaji = new Haji(nama, noRek, saldoAwal);

        switch (pilihan){
            case 1:
             // Inisialisasi variabel untuk Menu Bisnis
             System.out.println("==== FITUR BISNIS ====");
             System.out.println("SALDO AWAL TIDAK BOLEH KURANG DARI 1000000");
             do{
             if(saldoAwal > 1000000){
             objekBisnis.setNama(nama);
             objekBisnis.setNoRekening(noRek);
             objekBisnis.simpanUang(saldoAwal);
             objekBisnis.tarikUang(jumlahPenarikan);
             }else{
                 System.out.println("MAAF SALDO AWAL ANDA KURANG DARI MINIMUM, TOLONG INPUT KEMBALI");
             }
            }while(saldoAwal > 1000000);
                break;
            case 2:
            objekHaji.setNama(nama);
            objekHaji.setNoRekening(noRek);
            objekHaji.simpanUang(saldoAwal);
            objekHaji.tarikUang(jumlahPenarikan);
                break;
        
            default:
            System.out.println("Maaf pilihan yang anda masukkan tidak tersedia");
                break;
        }
        
            System.out.println("Apakah anda ingin mencoba Aplikasi ini lagi  (Y/N) ?: ");
            kalimat = inputLagi.nextLine();
   
            if(kalimat.equalsIgnoreCase("y")){
               condition = true;
            }else{
               condition = false;
            }
       
        
       
         

        }
          // Memanggil method close untuk menutup inputan
          in.close();
          inputLagi.close();
          inputNama.close();
          inputNoRek.close();
          inputSaldoAwal.close();
          
       
       
       
    }

}

