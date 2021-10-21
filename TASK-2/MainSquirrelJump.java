import java.util.Scanner;

/**
 * Sebuah class yang ada method utamanya
 * 
 * @author Abdul Hafidh
 * @version 2021.10.12
 */
public class MainSquirrelJump {
    // FIELDS
    private boolean play;
    private String kalimat;
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
     * Sebuah method main untuk mengeluarkan output yang diinginkan
     * @param a
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
            System.out.print("Masukkan nama tupai: ");
            nama = in.nextLine();

            System.out.print("Tentukan arah yang disukai tupai: ");
            arah = lokasi.nextLine();

            System.out.print("Masukkan jumlah tupai: ");
            jumTupai = jump.nextInt();

            // Memanggil 3 objek
            Pemain objekLompat = new Pemain();
            KotakAngka objekKotakAngka = new KotakAngka();
            MainSquirrelJump objekLanjut = new MainSquirrelJump();

            // Memanggil method arah dan nama
            objekLompat.setNama(nama);
            objekLompat.setArahLompat(arah);
            System.out.println(objekLompat.getArahLompat());
            System.out.println(objekLompat.getNama());
            // Memanggil method buatkotak
            objekKotakAngka.setTambahSquirrel(jumTupai);
            objekKotakAngka.gettambahSquirrel();
            System.out.println(objekKotakAngka.toString());
            objekKotakAngka.buatKotak();
            objekKotakAngka.cetakKotak();
            objekLompat.getkesempatanLompat();
            objekLompat.SquirrelJump();
            objekLompat.reward();
            System.out.println("Apakah anda ingin main lagi? (y/n) : ");
            kalimat = ulang.nextLine();
            
            if (kalimat.equalsIgnoreCase("y")) {
                objekLanjut.setMainkan("ya");
            } else {
                objekLanjut.setMainkan("tidak");
            }

            if (objekLanjut.getMainkan() == true) {
                condition = true;
                System.out.println(objekLanjut.getMainkan());
            } else {
                condition = false;
                System.out.println(objekLanjut.getMainkan());
            }
        }
    }
}