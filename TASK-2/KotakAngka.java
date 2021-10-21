/**
 * Sebuah class untuk menciptakan lapangan untuk tupai tersebut bisa melompat
 * @author Abdul Hafidh
 * @version 2021.12.10
 */
public class KotakAngka{
    // Fields
    private int [][] Kotak;
    private int kotakAwal;
    private int jumTupai;
    /**
     * Sebuah method constructor untuk menginisialisasi nilai awal
     */
    public KotakAngka(){
        this.Kotak = new int[10][10];
        this.kotakAwal = 1;
    }
    /**
     * Sebuah method mutator untuk membuat kotak sebanyak 100 buah
     */
    public void buatKotak(){
        
        for(int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                Kotak[i][j] = kotakAwal;
                kotakAwal++;
            }
        }
    }  
    /**
     * Sebuah method mutator untuk mencetak kotak 
     */
    public void cetakKotak(){
        System.out.println("=================================================================================================================");
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.printf("%10d]", Kotak[i][j]);
                if (j == 9){
                    System.out.println("\n");
                }
            }
        }
        System.out.println("=================================================================================================================");
    }

    /**
     * Sebuah method setter untuk memberi nilai jumlah tupai
     * @param jumTupai
     */
    public void setTambahSquirrel(int jumTupai){
        this.jumTupai = jumTupai;
    } 
    /**
     * Sebuah method getter untuk mengembalikan jumTupai
     * @return this.jumTupai
     */
    public int gettambahSquirrel(){
        return this.jumTupai;
    }
    /**
     * Sebuah method toString untuk mencetak hasil output yang diinginkan
     */
    public String toString(){
        return "Tupainya berjumlah " + this.jumTupai;
    }

}