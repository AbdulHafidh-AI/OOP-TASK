import java.util.Scanner; // Library Scanner (untuk mengakses proses input)
/**
 * Source code java untuk membuat permainan Jump Squirrel jump
 * Berikut ini adalah link google drive untuk membahas isi dari source code ini: https://drive.google.com/file/d/1wL2Oj4O7ieWUeUyq_-bgJMwiqEyIDY0b/view?usp=sharing
 * @author Abdul Hafidh
 * @version 2021.09.23
 */
public class Permainan {
    public static void main(String[] args) {
        // Inisialisasi Variabel
        String ulang;
        char lagi;
        int [] bilanganUjungKanan = {10,20,30,40,50,60,70,80,90}; // Angka Pengecualian
        int [] bilanganUjungKiri = {11,21,31,41,51,61,71,81,91}; // Angka Pengecualian
        int pilihan = 0;
        try(Scanner in = new Scanner(System.in)){
        // Membuat perulangan untuk bermain kembali atau tidak
        do{
        System.out.println("==================    PERMAINAN JUMP SQUIRREL JUMP    ===================="); 
            System.out.println("PILIHLAH KEMAMPUAN TUPAI YANG ANDA INGINKAN");
            System.out.println("1 -->  Tupai tidak bisa melompat secara diagonal");
            System.out.println("2 -->  Tupai bisa melompat secara diagonal");
            System.out.print("Masukkan pilihan anda: ");
            pilihan = in.nextInt();
        // Membuat array 2D dengan panjang 10 lebar 10 untuk membuat tabel
        int [][] tempat = new int[10][10];
        int awal = 1;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                tempat[i][j] = awal;
                System.out.print(tempat[i][j] + "\t");
                awal++;
            }
            System.out.println();
        }
        // Mengacak posisi Si Tupai
        int min = 1;
        int max = 99;
        int posisiTupai = (int)(min + Math.random() * (max - min));
        System.out.println("Squirrel is at number " + posisiTupai);
        // Membuat perulangan dengan 20 dan 10 kali inputan sesuai posisiTupai
        int momen;
        if(posisiTupai <= 50){
            momen = 20;
        }else{
            momen = 10;
        }
        // PROSES INPUT
        int lompat = 0; // variabel input untuk memindahkan posisi katak
        System.out.println("Anda mempunyai kesempatan sebanyak " + momen + " kali");
        switch (pilihan){
            case 1: // Kasus pertama ini tupai tidak boleh melompat secara diagonal
            for(int i = 1; i <= momen; i++){
                if (posisiTupai == 100)
                break;
                System.out.print("Jump to: ");
                System.out.print("");
                lompat = in.nextInt();
                    if(posisiTupai - lompat == 10 || posisiTupai - lompat == 1 || posisiTupai - lompat == -1 || posisiTupai - lompat == -10){
                        if(posisiTupai == bilanganUjungKanan[0] || posisiTupai == bilanganUjungKanan[1] || posisiTupai == bilanganUjungKanan[2] || posisiTupai == bilanganUjungKanan[3] || posisiTupai == bilanganUjungKanan[4] || posisiTupai == bilanganUjungKanan[5] || posisiTupai == bilanganUjungKanan[6] || posisiTupai == bilanganUjungKanan[7] || posisiTupai == bilanganUjungKanan[8]){
                            if(posisiTupai - lompat == -1 ){
                                System.out.println("Wrong jump location Try again");
                            }else{
                                posisiTupai = lompat;
                                System.out.println("Squirrel is at number " + posisiTupai);
                            }
                        }else if( posisiTupai == bilanganUjungKiri[0] || posisiTupai == bilanganUjungKiri[1] || posisiTupai == bilanganUjungKiri[2] || posisiTupai == bilanganUjungKiri[3] || posisiTupai == bilanganUjungKiri[4] || posisiTupai == bilanganUjungKiri[5] || posisiTupai == bilanganUjungKiri[6] || posisiTupai == bilanganUjungKiri[7] || posisiTupai == bilanganUjungKiri[8]){
                            if(posisiTupai - lompat == 1){
                                System.out.println("Wrong jump location Try again");
                            }else{
                                posisiTupai = lompat;
                                System.out.println("Squirrel is at number " + posisiTupai);
                            }
                        }else{
                        posisiTupai = lompat;
                        System.out.println("Squirrel is at number " + posisiTupai);
                        }
                    }else if(posisiTupai - lompat == 11 || posisiTupai - lompat == 9 || posisiTupai - lompat == -11 || posisiTupai - lompat == -9){
                        System.out.println("Wrong. Try again");
                    }else if(posisiTupai == lompat){
                        System.out.println("Posisi yang anda input sama");
                    }else{
                        System.out.println("Wrong jump location Try again");
                    }  
                    System.out.println("Anda sudah melakukan inputan sebanyak: " + i +" kali"); 
                }
                // Suatu ucapan untuk merayakan sesuai dengan posisi tupai setelah dilakukan perulangan
                if(posisiTupai == 100){
                    System.out.println("Congratulation you win ^_^");
                }else{
                    System.out.println("Sorry you lost -_-");
                }
                break;
                case 2: // Kasus kedua ini Tupai boleh melompat secara diagonal
                for(int i = 1; i <= momen; i++){
                    if (posisiTupai == 100)
                    break;
                    System.out.print("Jump to: ");
                    System.out.print("");
                    lompat = in.nextInt();
               if(posisiTupai - lompat == 10 || posisiTupai - lompat == 1 || posisiTupai - lompat == -1 || posisiTupai - lompat == -10 ||posisiTupai - lompat == 11 || posisiTupai - lompat == 9 || posisiTupai - lompat == -11 || posisiTupai - lompat == -9 ){
                if(posisiTupai == bilanganUjungKanan[0] || posisiTupai == bilanganUjungKanan[1] || posisiTupai == bilanganUjungKanan[2] || posisiTupai == bilanganUjungKanan[3] || posisiTupai == bilanganUjungKanan[4] || posisiTupai == bilanganUjungKanan[5] || posisiTupai == bilanganUjungKanan[6] || posisiTupai == bilanganUjungKanan[7] || posisiTupai == bilanganUjungKanan[8]){
                    if(posisiTupai - lompat == -1 || posisiTupai - lompat == 9 ){
                        System.out.println("Wrong jump location Try again");
                    }else{
                        posisiTupai = lompat;
                        System.out.println("Squirrel is at number " + posisiTupai);
                    }
                }else if( posisiTupai == bilanganUjungKiri[0] || posisiTupai == bilanganUjungKiri[1] || posisiTupai == bilanganUjungKiri[2] || posisiTupai == bilanganUjungKiri[3] || posisiTupai == bilanganUjungKiri[4] || posisiTupai == bilanganUjungKiri[5] || posisiTupai == bilanganUjungKiri[6] || posisiTupai == bilanganUjungKiri[7] || posisiTupai == bilanganUjungKiri[8]){
                    if(posisiTupai - lompat == 1){
                        System.out.println("Wrong jump location Try again");
                    }else{
                        posisiTupai = lompat;
                        System.out.println("Squirrel is at number " + posisiTupai);
                    }
                }else{
                posisiTupai = lompat;
                System.out.println("Squirrel is at number " + posisiTupai);
                }
               }else if(posisiTupai == lompat){
                System.out.println("Posisi yang anda input sama");
               }else{
                System.out.println("Wrong jump location Try again");
            }   
            System.out.println("Anda sudah melakukan inputan sebanyak: " + i +" kali"); 
        }
        if(posisiTupai == 100){
            System.out.println("Congratulation you win ^_^");
                }else{
            System.out.println("Sorry you lost -_-");
        }
    }
         // Membuat suatu pernyataan untuk bermain kembali atau tidak  
        System.out.println("Apakah kamu masih mau bermain?: (y/n) ");
        in.nextLine(); // Memanggil method ini agar bisa dideteksi oleh method Scanner in dari library import java.util.Scanner
        ulang = in.nextLine();
        lagi = ulang.charAt(0); // Memanggil method charAt(0) karena pada akhir inputan user hanya boleh menginput satu huruf 
        }while(lagi == 'Y' || lagi == 'y');
    }
        System.out.println("=== THANK YOU AND SEE YOU BYE ===");
    }
}