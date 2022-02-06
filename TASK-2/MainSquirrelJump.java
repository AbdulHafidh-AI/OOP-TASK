import java.util.Scanner;
/**
 * Sebuah class yang berisi method public static void main(String[] args) yang bertujuan untuk memberikan output kepada user
 * Berikut ini adalah link Gdrive untuk penjelasan pada source code ini: https://drive.google.com/file/d/1zfqcbtrHLgQbhnwFBg1AYnNhxgyL_1O3/view?usp=sharing
 * @author Abdul Hafidh
 * @version 2021.10.12
 */
public class MainSquirrelJump {
    // FIELDS
    private boolean play;
    private String kalimat;
    /**
     * Sebuah method constructor untuk menginisialisikan nilai awal
     */
    public MainSquirrelJump(boolean play){
        this.play = play;
    }
    /**
     * Sebuah method accessor untuk mengembalikan nilai true atau false
     * @return this.play
     */
    public boolean getMainkan() {
        if (kalimat.equalsIgnoreCase("ya")) {
            this.play = true;
        } else {
            this.play = false;
        }
        return this.play;
    }
    
    /**
     * Sebuah method setter untuk memberi nilai untuk kalimat 
     * @param kalimat
     */
    public void setMainkan(String kalimat) {
        this.kalimat = kalimat;
    }
    /**
     * The main method that reads input, calls the function 
     * for each question's query, and output the results.
     * @param args Unused.
     * @return Nothing.
     */
    public static void main(String[] a) {
        // INISIALISASI VARIABEL
        String nama;
        String arah;
        String kalimat;
        int jumTupai;
        Scanner in = new Scanner(System.in);
        Scanner lokasi = new Scanner(System.in);
        Scanner jump = new Scanner(System.in);
        Scanner ulang = new Scanner(System.in);
        boolean condition = true;
        
        while (condition) {

            System.out.println("================================ PERMAINAN TUPAI LOMPAT ================================================");
            System.out.print("Masukkan nama kamu: ");
            nama = in.nextLine();
        
            System.out.println("[KANAN]        [KIRI]       [ATAS]        [BAWAH]");
            System.out.print("Ayo coba tebak arah tidak disukai tupai: ");
            arah = lokasi.nextLine();
        
            System.out.print("Masukkan jumlah tupai: ");
            jumTupai = jump.nextInt();
    
            // Memanggil 3 objek
            Pemain objekPemain = new Pemain();
            KotakAngka objekKotakAngka = new KotakAngka();
            MainSquirrelJump objekLanjut = new MainSquirrelJump(true);

            // Memanggil method di bawah ini bertujuan untuk mendeskripsikan squirrel (tupai)
            objekPemain.setNama(nama);
            objekPemain.setArahLompat(arah);
            objekPemain.buatSquirrel();
            System.out.println("[" + objekPemain.getArahLompat() + "]");
            System.out.println("[" + objekPemain.getNama() + "]");
            objekKotakAngka.setTambahSquirrel(jumTupai);
            objekKotakAngka.getTambahSquirrel();
            System.out.println("[" + objekKotakAngka.toString() + "]");
            // Memanggil method buatkotak
            objekKotakAngka.buatKotak();
            objekKotakAngka.cetakKotak();
            // Memanggil method getter untuk mendapatkan nilai dari kesempatan lompat tupai
            objekPemain.getKesempatanLompat();
            // Memanggil method dibawah ini untuk mencetak kesempatan lompat
            System.out.println(objekPemain.cetakKesempatanLompat());
            // Memanggil method ini untuk menentukan arah loncatan tupai
            objekPemain.squirrelJump();
            // Memanggil method ini untuk memberikan penghargaan kepada user
            System.out.println(objekPemain.getReward());
            // Implementasi untuk bermain kembali atau tidak
            System.out.print("Apakah anda ingin bermain lagi? (y/n) : ");
            kalimat = ulang.nextLine();
            
            if (kalimat.equalsIgnoreCase("y")) {
                objekLanjut.setMainkan("ya");
            } else {
                objekLanjut.setMainkan("tidak");
            }
            if (objekLanjut.getMainkan() == true) {
                condition = true;
            } else {
                condition = false;
            }
        }
        // Memanggil method ini dari java.lang.objects untuk menutupi inputan agar mencegah terjadinya warning! pada program
        in.close();
        lokasi.close();
        jump.close();
        ulang.close();
    }
}