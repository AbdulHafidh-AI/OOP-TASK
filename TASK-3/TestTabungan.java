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

        /* Suatu pertanyaan untuk menegaskan pengguna untuk menjalankan program ini di terminal saja!!!!, 
        Jika program ini di jalankan di terminal maka pernyataan di atas ini tidak akan muncul ^_^ */
        System.out.println("WARNING!!!!!!!");
        System.out.println("PASTIKAN ANDA MENJANKAN PRGORAM INI DI TERMINAL AGAR PROGRAM INI DAPAT BERJALAN SECARA MAKSIMAL!!!!!!!!");
        while (condition) {
        // Suatu manipulasi cara pada java untuk melakukan proses clear screen
        System.out.print("\033[H\033[2J");
        System.out.flush();
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

        System.out.printf("Saldo anda sekarang berjumlah : %.0f\n", saldoAwal);
        System.out.println("| Berikut ini adalah menu yang tersedia di aplikasi tabungan sederhana ini| ");
        System.out.println("|===========     MENU      ==============|");
        System.out.println("|===========  1. Bisnis    ==============|");
        System.out.println("|===========  2. Haji      ==============|");
        System.out.print("SILAHKAN PILIH JENIS FITUR TABUNGAN YANG ANDA INGINKAN: ");
        pilihan = in.nextInt();

        switch (pilihan){
            case 1:
            // Suatu manipulasi cara pada java untuk melakukan proses clear screen
            System.out.print("\033[H\033[2J");
            System.out.flush();
            if(saldoAwal > 1000000){
                objekBisnis.setSaldo(0); // Dana pada tabungan bisnis dimulai dari nol terlebih dahulu
                do{
                 // Suatu manipulasi cara pada java untuk melakukan proses clear screen
                 System.out.print("\033[H\033[2J");
                 System.out.flush();
                 System.out.println("==== TABUNGAN BISNIS ====");
                 System.out.println("PILIH APAKAH ANDA INGIN MENARIK ATAU MENYIMPAN UANG ? ");
                 System.out.println("1. simpan uang");
                 System.out.println("2. Tarik uang");
                 System.out.print("Tentukan pilihan anda: ");
                 pilihan = in.nextInt();
             if(pilihan == 1){
                 // Suatu manipulasi cara pada java untuk melakukan proses clear screen
                 System.out.print("\033[H\033[2J");
                 System.out.flush();
                 objekBisnis.simpanUang(uang);
                 System.out.println("====================== STATUS PADA PENYIMPANAN DANA BISNIS ========================");
                 System.out.println("NAMA : " + objekBisnis.getNama());
                 System.out.println("NO REK :" + objekBisnis.getNoRekening());
                 System.out.printf("Total Saldo untuk simpanan bisnis anda berjumlah: %.0f\n", objekBisnis.getSaldo());
             }else if (pilihan == 2){
                 // Suatu manipulasi cara pada java untuk melakukan proses clear screen
                 System.out.print("\033[H\033[2J");
                 System.out.flush();
                 System.out.print("Masukkan jumlah uang yang ingin anda tarik: ");
                 jumlahPenarikan = in.nextDouble();
                 objekBisnis.tarikUang(jumlahPenarikan);
                 System.out.println("====================== STATUS PADA PENARIKAN DANA BISNIS ==========================");
                 System.out.println("NAMA : " + objekBisnis.getNama());
                 System.out.println("NO REK :" + objekBisnis.getNoRekening());
                 System.out.printf("Total Saldo untuk simpanan bisnis anda berjumlah: %.0f\n", objekBisnis.getSaldo());
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
            // Suatu manipulasi cara pada java untuk melakukan proses clear screen
            System.out.print("\033[H\033[2J");
            System.out.flush();
            if(saldoAwal > 500000){
                objekBisnis.setSaldo(0); // Dana pada tabungan bisnis dimulai dari nol terlebih dahulu
                do{
                 System.out.println("==== TABUNGAN HAJI ====");
                 System.out.println("PILIH APAKAH ANDA INGIN MENARIK ATAU MENYIMPAN UANG ? ");
                 System.out.println("1. Simpan uang");
                 System.out.println("2. Tarik uang");
                 System.out.print("Tentukan pilihan anda: ");
                 pilihan = in.nextInt();
             if(pilihan == 1){
                 objekHaji.simpanUang(uang);
                 System.out.println("====================== STATUS PADA PENYIMPANAN DANA HAJI ========================");
                 // Suatu manipulasi cara pada java untuk melakukan proses clear screen
                 System.out.print("\033[H\033[2J");
                 System.out.flush();
                 System.out.println("NAMA : " + objekHaji.getNama());
                 System.out.println("NO REK :" + objekHaji.getNoRekening());
                 System.out.printf("Total Saldo untuk simpanan haji anda berjumlah: %.0f\n",objekHaji.getSaldo());
             }else if (pilihan == 2){
                 System.out.printf("SALDO ANDA SEKARANG BERJUMLAH : %.0f\n", objekHaji.getSaldo());
                 objekHaji.tarikUang(jumlahPenarikan);
                 // Suatu manipulasi cara pada java untuk melakukan proses clear screen
                 System.out.print("\033[H\033[2J");
                 System.out.flush();
                 System.out.println("====================== STATUS PADA PENARIKAN DANA HAJI ==========================");
                 System.out.println("NAMA : " + objekHaji.getNama());
                 System.out.println("NO REK :" + objekHaji.getNoRekening());
                 System.out.printf("Total Saldo untuk untuk simpanan haji anda berjumlah: %.0f \n",objekHaji.getSaldo());
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
            // Suatu manipulasi cara pada java untuk melakukan proses clear screen
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("================================ TERIMA KASIH TELAH MENCOBA APLIKASI KAMI  ^_^ ============================================");
            System.out.print("Apakah anda ingin mencoba Aplikasi ini lagi  (Y/N) ?: ");
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
          inputTarikUang.close();   
    }
}