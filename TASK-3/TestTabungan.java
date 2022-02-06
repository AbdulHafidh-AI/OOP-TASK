import java.util.Scanner;
/**
 * Sebuah class yang berisi method main yang bertujuan untuk menjalankan output 
 * Berikut ini adalah link gdrive untuk membahas isi source code: https://drive.google.com/file/d/1uAC2_k3vA2UoNDI81k3FzFleYTNrSYi8/view?usp=sharing
 * @author Abdul Hafidh
 * @version 2021.11.02
 */
public class TestTabungan 
{
    /**
     * Sebuah method untuk membersihkan layar pada kondisi tertentu
     */
    private static void clearScreen()
    {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                // clear screen untuk windows
                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO()
                        .start()
                        .waitFor();
            } else {
                // clear screen untuk Linux, Unix, Mac
                Runtime.getRuntime().exec("clear");
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            System.out.println("Error karena: " + e.getMessage());
        }
    }   
    /**
     * The main method that reads input, calls the function 
     * for each question's query, and output the results.
     * @param args Unused.
     * @return Nothing.
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
        clearScreen();
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

        System.out.printf("Saldo awal sebelum menyimpan dana di bisnis atau haji berjumlah : %.0f\n", saldoAwal);
        System.out.println("| Berikut ini adalah menu yang tersedia di aplikasi tabungan sederhana ini| ");
        System.out.println("|===========     MENU      ==============|");
        System.out.println("|===========  1. Bisnis    ==============|");
        System.out.println("|===========  2. Haji      ==============|");
        System.out.print("SILAHKAN PILIH JENIS FITUR TABUNGAN YANG ANDA INGINKAN: ");
        pilihan = in.nextInt();

        switch (pilihan){
            case 1:
            clearScreen();
            if(saldoAwal > 50000){
                objekBisnis.setSaldo(0); // Dana pada tabungan bisnis dimulai dari nol terlebih dahulu
                do{
                 System.out.println("==== TABUNGAN BISNIS ====");
                 System.out.printf("SALDO pada tabungan bisnis anda berjumlah: %.0f\n" ,objekBisnis.getSaldo());
                 System.out.println("PILIH APAKAH ANDA INGIN MENARIK ATAU MENYIMPAN UANG ? ");
                 System.out.println("1. simpan uang");
                 System.out.println("2. Tarik uang");
                 System.out.print("Tentukan pilihan anda: ");
                 pilihan = in.nextInt();
             if(pilihan == 1){
                 clearScreen();
                 objekBisnis.simpanUang(uang);
                 System.out.println("====================== STATUS PADA PENYIMPANAN DANA BISNIS ========================");
                 System.out.println("NAMA : " + objekBisnis.getNama());
                 System.out.println("NO REK :" + objekBisnis.getNoRekening());
                 System.out.printf("Total Saldo untuk simpanan bisnis anda berjumlah: %.0f\n", objekBisnis.getSaldo());
             }else if (pilihan == 2){
                 clearScreen();
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
             System.out.print("Tekan \"y\" untuk menarik atau menyimpan uang lagi untuk kebutuhan dana bisnis : ");
             kalimat = inputLagi.nextLine();
            }while(pilihan < 1 || pilihan > 2 || kalimat.equalsIgnoreCase("y"));
            }else{
                System.out.println("MAAF ANDA TIDAK BISA MENGGUNAKAN FITUR INI KARENA SALDO AWAL ANDA TIDAK MENCUKUPI ");
            }
                break;
            case 2:
            clearScreen();
            if(saldoAwal > 100000){
                objekHaji.setSaldo(0); // Dana pada tabungan bisnis dimulai dari nol terlebih dahulu
                do{
                 System.out.println("==== TABUNGAN HAJI ====");
                 System.out.printf("Saldo pada tabungan haji anda berjumlah:  %.0f\n" , objekHaji.getSaldo());
                 System.out.println("PILIH APAKAH ANDA INGIN MENARIK ATAU MENYIMPAN UANG ? ");
                 System.out.println("1. Simpan uang");
                 System.out.println("2. Tarik uang");
                 System.out.print("Tentukan pilihan anda: ");
                 pilihan = in.nextInt();
             if(pilihan == 1){
                 clearScreen();
                 objekHaji.simpanUang(uang);
                 System.out.println("====================== STATUS PADA PENYIMPANAN DANA HAJI ========================");
                 System.out.println("NAMA : " + objekHaji.getNama());
                 System.out.println("NO REK :" + objekHaji.getNoRekening());
                 System.out.printf("Total Saldo untuk simpanan haji anda berjumlah: %.0f\n",objekHaji.getSaldo());
             }else if (pilihan == 2){
                 System.out.printf("SALDO ANDA SEKARANG BERJUMLAH : %.0f\n", objekHaji.getSaldo());
                 objekHaji.tarikUang(jumlahPenarikan);
                 clearScreen();
                 System.out.println("====================== STATUS PADA PENARIKAN DANA HAJI ==========================");
                 System.out.println("NAMA : " + objekHaji.getNama());
                 System.out.println("NO REK :" + objekHaji.getNoRekening());
                 System.out.printf("Total Saldo untuk untuk simpanan haji anda berjumlah: %.0f \n",objekHaji.getSaldo());
             }else{
                 System.out.println("MAAF PILIHAN YANG ANDA MASUKKAN TIDAK TERSEDIA! SILAHKAN COBA LAGI");
             }
             System.out.print("Tekan \"y\" untuk Menarik atau Menyimpan uang lagi untuk kebutuhan dana haji:  ");
             kalimat = inputLagi.nextLine();
            }while(pilihan < 1 || pilihan > 2 || kalimat.equalsIgnoreCase("y"));
            }else{
                System.out.println("MAAF ANDA TIDAK BISA MENGGUNAKAN FITUR INI KARENA SALDO AWAL ANDA TIDAK MENCUKUPI ");
            }
                break;
        }
            System.out.println("================================ TERIMA KASIH TELAH MENCOBA APLIKASI KAMI  ^_^ ============================================");
            System.out.print("Tekan \"y\" mencoba Aplikasi ini lagi: ");
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