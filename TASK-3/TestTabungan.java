import java.util.Scanner;
/**
 * Sebuah class yang berisi method main yang bertujuan untuk menjalankan output
 * @author Abdul Hafidh
 * @version 2021.11.02
 */
public class TestTabungan 
{
    /**
     * Sebuah method main yang bertujuan untuk melakukan operasi input dan output
     * @param args
     */
    public static void main(String[] args)
    {
        // Inisialisasi Variabel
        int pilihan;
        String nama;
        String kalimat;
        long noRek;
        double saldoAwal = 0;
        double uang = 0;
        double jumlahPenarikan = 0;
        boolean condition = true;

        // Membuat 5 method scanner
        Scanner inputLagi = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        Scanner inputNama = new Scanner(System.in);
        Scanner inputNoRek = new Scanner(System.in);
        Scanner inputSaldoAwal = new Scanner(System.in);
        Scanner inputTarikUang = new Scanner(System.in);

        while (condition) {
        System.out.println("================== SELAMAT DATANG DI APLIKASI TABUNGAN SEDERHANA ================");

        System.out.print("Masukkan nama anda terlebih dahulu: ");
        nama = inputNama.nextLine();

        System.out.print("Masukkan no rekening anda: ");
        noRek = in.nextLong();

        System.out.print("Input saldo awal anda: ");
        saldoAwal = in.nextDouble();

         // Membuat objek
        Bisnis objekBisnis = new Bisnis(nama, noRek, saldoAwal);
        Haji objekHaji = new Haji(nama, noRek, saldoAwal);

        System.out.printf("Saldo anda sekarang berjumlah : %f\n", saldoAwal);
        System.out.println(" | Berikut ini adalah menu yang tersedia di aplikasi tabungan sederhana ini | ");
        System.out.println("|===========     MENU      ==============|");
        System.out.println("|===========  1. Bisnis    ==============|");
        System.out.println("|===========  2. Haji      ==============|");
        System.out.print("SILAHKAN PILIH JENIS FITUR TABUNGAN YANG ANDA INGINKAN: ");
        pilihan = in.nextInt();

        switch (pilihan){
            case 1:
            if(saldoAwal > 1000000){
            do{
             System.out.println("==== TABUNGAN BISNIS ====");
             System.out.println("PILIH APAKAH ANDA INGIN MENARIK ATAU MENYIMPAN UANG ? ");
             System.out.println("1. simpan uang");
             System.out.println("2. Tarik uang");
             System.out.print("Tentukan pilihan anda: ");
             pilihan = in.nextInt();
             if(pilihan == 1){
                 System.out.println("====================== STATUS PADA PENYIMPANAN DANA BISNIS ========================");
                 objekBisnis.simpanUang(uang);
                 System.out.println("NAMA : " + objekBisnis.getNama());
                 System.out.println("NO REK :" + objekBisnis.getNoRekening());
                 System.out.printf("Total Saldo untuk simpanan bisnis anda berjumlah: %f\n", objekBisnis.getSaldo());
             }else if (pilihan == 2){
                 System.out.print("Masukkan jumlah uang yang ingin anda tarik: ");
                 jumlahPenarikan = in.nextDouble();
                 objekBisnis.tarikUang(jumlahPenarikan);
                 System.out.println("====================== STATUS PADA PENARIKAN DANA BISNIS ==========================");
                 System.out.println("NAMA : " + objekBisnis.getNama());
                 System.out.println("NO REK :" + objekBisnis.getNoRekening());
                 System.out.printf("Total Saldo untuk simpanan bisnis anda berjumlah: %f\n", objekBisnis.getSaldo());
             }else{
                 System.out.println("MAAF PILIHAN YANG ANDA MASUKKAN TIDAK TERSEDIA! SILAHKAN COBA LAGI");
             }
             System.out.print("Apakah anda ingin menarik atau menyimpan uang lagi untuk kebutuhan dana bisnis? (y/n)?");
             kalimat = inputLagi.nextLine();
            }while(pilihan < 1 || pilihan > 2 || kalimat.equalsIgnoreCase("y"));
            }else{
                System.out.println("MAAF ANDA TIDAK BISA MENGGUNAKAN FITUR INI KARENA SALDO AWAL ANDA TIDAK MENCUKUPI ");
            }
                break;
            case 2:
            if(saldoAwal > 500000){
            do{
             System.out.println("==== TABUNGAN HAJI ====");
             System.out.println("PILIH APAKAH ANDA INGIN MENARIK ATAU MENYIMPAN UANG ? ");
             System.out.println("1. simpan uang");
             System.out.println("2. Tarik uang");
             System.out.print("Tentukan pilihan anda: ");
             pilihan = in.nextInt();
             if(pilihan == 1){
                 System.out.println("====================== STATUS PADA PENYIMPANAN DANA HAJI ========================");
                 objekHaji.simpanUang(uang);
                 System.out.println("NAMA : " + objekHaji.getNama());
                 System.out.println("NO REK :" + objekHaji.getNoRekening());
                 System.out.printf("Total Saldo untuk simpanan haji anda berjumlah: %f ",objekHaji.getSaldo());
             }else if (pilihan == 2){
                 System.out.println("SALDO ANDA SEKARANG BERJUMLAH : " + objekHaji.getSaldo());
                 System.out.print("Masukkan jumlah uang yang ingin anda tarik : ");
                 jumlahPenarikan = inputTarikUang.nextDouble();
                 objekHaji.tarikUang(jumlahPenarikan);
                 System.out.println("====================== STATUS PADA PENARIKAN DANA HAJI ==========================");
                 System.out.println("NAMA : " + objekHaji.getNama());
                 System.out.println("NO REK :" + objekHaji.getNoRekening());
                 System.out.printf("Total Saldo untuk untuk simpanan haji anda berjumlah: %f ",objekHaji.getSaldo());
             }else{
                 System.out.println("MAAF PILIHAN YANG ANDA MASUKKAN TIDAK TERSEDIA! SILAHKAN COBA LAGI");
             }
             System.out.print("Apakah anda ingin Menarik atau Menyimpan uang lagi untuk kebutuhan dana haji?  (y/n )  ");
             kalimat = inputLagi.nextLine();
            }while(pilihan < 1 || pilihan > 2 || kalimat.equalsIgnoreCase("y"));
            }else{
                System.out.println("MAAF ANDA TIDAK BISA MENGGUNAKAN FITUR INI KARENA SALDO AWAL ANDA TIDAK MENCUKUPI ");
            }
                break;
        }
            System.out.println("Selamat anda sudah berhasil melakukan proses transaksi ^_^");
            System.out.print("Apakah anda ingin mencoba Aplikasi ini lagi  (Y/N) ?: ");
            kalimat = inputLagi.nextLine();
            if(kalimat.equalsIgnoreCase("y")){
               condition = true;
            }else{
               condition = false;
            }
        }
           System.out.println("================================ TERIMA KASIH TELAH MENGGUNAKAN APLIKASI KAMI ================================");
          // Memanggil method close untuk menutup inputan
          in.close();
          inputLagi.close();
          inputNama.close();
          inputNoRek.close();
          inputSaldoAwal.close();
          inputTarikUang.close();   
    }
}