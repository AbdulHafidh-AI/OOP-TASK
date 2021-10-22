import java.util.Scanner; // Library Scanner
/**
 * Sebuah source code untuk mengisi method pada perilaku dan atribut pada tupai
 * @author Abdul Hafidh
 * @version 2021.10.12
 */
public class Pemain{
    // Fields
    private int posisiTupai;
    private int[] bilanganUjungKanan = {10,20,30,40,50,60,70,80,90}; // Angka Pengecualian 
    private int[] bilanganUjungKiri = {11,21,31,41,51,61,71,81,91}; // Angka Pengecualian
    private int kesempatan;
    private int min;
    private int max;
    private int lompat;
    private String nama;
    private String arah;
    /**
     * Sebuah method constructor untuk memberikan nilai awal pada objek ini
     */
    public Pemain(){
        this.min = 1;
        this.max = 99;
        this.posisiTupai = (int)(min + Math.random() * (max - min));
    }
    /**
     * Sebuah method constructor untuk menginisialisasi variabel nama
     * @param nama
     */
    public Pemain(String nama){
        this.nama = nama;
    }
    /**
     * Sebuah method untuk mengembalikan nilai string
     * @return "Nama Tupai adalah : " + this.nama
     */
    public String getNama(){
        return "Nama kamu adalah : " + this.nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    /**
     * Sebuah method getter atau accessor untuk mengembalikan nilai dari kesempatan (nilai dari kesempatan ini akan menentukan kesempatan tupai melompat)
     * @return kesempatan
     */
    public int getkesempatanLompat(){
        if(this.posisiTupai <= 50){
            kesempatan = 20;
        }else{
            kesempatan = 10;
        }
        return kesempatan;
    }
    /**
     * Sebuah method mutator untuk mengarahkan lompatan tupai tidak secara diagonal
     */
    public void SquirrelJump(){
        Scanner in = new Scanner(System.in);
        System.out.println("(Tupai) Berada di Posisi " + posisiTupai);
        for(int i = 1; i <= kesempatan; i++){
            if (posisiTupai == 100)
            break;
            System.out.print("Jump to: ");
            System.out.print("");
            lompat = in.nextInt();
                if(posisiTupai - lompat == 10 || posisiTupai - lompat == 1 || posisiTupai - lompat == -1 || posisiTupai - lompat == -10){
                    if(posisiTupai == bilanganUjungKanan[0] || posisiTupai == bilanganUjungKanan[1] || posisiTupai == bilanganUjungKanan[2] || posisiTupai == bilanganUjungKanan[3] || posisiTupai == bilanganUjungKanan[4] || posisiTupai == bilanganUjungKanan[5] || posisiTupai == bilanganUjungKanan[6] || posisiTupai == bilanganUjungKanan[7] || posisiTupai == bilanganUjungKanan[8]){
                        if(posisiTupai - lompat == -1 ){
                            System.out.println("You can Only jump to adjacent place try again");
                        }else{
                            posisiTupai = lompat;
                            System.out.println("(Tupai) is at number " + posisiTupai);
                        }
                    }else if( posisiTupai == bilanganUjungKiri[0] || posisiTupai == bilanganUjungKiri[1] || posisiTupai == bilanganUjungKiri[2] || posisiTupai == bilanganUjungKiri[3] || posisiTupai == bilanganUjungKiri[4] || posisiTupai == bilanganUjungKiri[5] || posisiTupai == bilanganUjungKiri[6] || posisiTupai == bilanganUjungKiri[7] || posisiTupai == bilanganUjungKiri[8]){
                        if(posisiTupai - lompat == 1){
                            System.out.println("You can only jump to adjacent place try again");
                        }else{
                            posisiTupai = lompat;
                            System.out.println("(Tupai) is at number " + posisiTupai);
                        }
                    }else{
                    posisiTupai = lompat;
                    System.out.println("(Tupai) is at number " + posisiTupai);
                    }
                }else if(posisiTupai - lompat == 11 || posisiTupai - lompat == 9 || posisiTupai - lompat == -11 || posisiTupai - lompat == -9){
                    posisiTupai = lompat;
                    System.out.println(" is at number " + posisiTupai);
                }else if(posisiTupai == lompat){
                    System.out.println("Posisi yang anda input sama");
                }else{
                    System.out.println("Wrong jump location Try again");
                }  
                System.out.println("Anda sudah melakukan inputan sebanyak: " + i +" kali");   
        }
        }   
        /**
         * Sebuah method mutator untuk membuat karakter tupai 
         */
        public void buatSquirrel(){
            String warna;
            Scanner in = new Scanner(System.in);
            System.out.print("Mohon input warna tupai yang disukai: ");
            warna = in.nextLine();
            System.out.println("[" +"Tupai anda bewarna: " + warna + "]"); 
        }
    /**
     * Sebuah method mutator untuk merayakan ucapan yang menang atau kalah
     */
    public void reward(){
        if(posisiTupai == 100){
            System.out.println("Congratulation You win ^_^");
        }else{
            System.out.println("Sorry You lost -_-");
        }
    }
    /**
     * Sebuah method setter untuk mengatur arah lompat
     * @param arah
     */
    public void setArahLompat(String arah){
        this.arah = arah;
    }
    /**
     * Sebuah method untuk m
     * @return kalimat + this.arah;
     */
    public String getArahLompat(){
        String kalimat;
        if(this.arah.equalsIgnoreCase("kiri")){
         kalimat = " Benar, Tupai tidak suka bergerak ke arah ";
        }else{
          kalimat = " Sayangnya, Tupai sangat suka bergerak ke arah ";
        }
        return kalimat  + this.arah;
    }
}