import java.util.Scanner;
/**
 * Sebuah class yang terdapat informasi dari si penabung
 * @author Abdul Hafidh
 * @version 2021.11.02
 */
abstract class Tabungan
{
    // Fields
    private String nama;
    private long noRekening;
    private double saldo = 0;
    private double saldo_minimum = 0;
    private double setoran_minimum = 0;

    /**
     * Sebuah method constructor di class Tabungan tanpa adanya parameter
     */
    public Tabungan()
    {
        
    }

    /**
     * Sebuah method constructor yang diberi parameter dengan nama, dan noRekening
     * @param nama
     * @param noRekening
     */
    public Tabungan(String nama, long noRekening)
    {
        this.nama = nama;
        this.noRekening = noRekening;
    }
   
   
    /**
     * 
     * @return this.nama
     */
    public String getNama()
    {
        return this.nama;
    }
    
    /**
     * 
     * @return this.noRekening
     */
    public long getNoRekening()
    {
        return this.noRekening;
    }

     /**
      * Sebuah method untuk mengeset nilai dari saldo_minimum
      * @param saldo_minimum
      */
    protected void setSaldoMinimum(double saldo_minimum)
    {
        this.saldo_minimum = saldo_minimum;
    }
    /**
     * Sebuah method setter untuk mengeset nilai setoran_minimum
     * @param setoran_minimum
     */
    protected void setSetoranMinimum(double setoran_minimum)
    {
        this.setoran_minimum = setoran_minimum;
    }
    /**
     * Sebuah method getter untuk mendapatkan nilai dari saldo
     * @return
     */
    public double getSaldo()
    {
        return saldo;
    }
    /**
     * Sebuah method setter untuk mengeset nilai dari saldo yang dimasukkan
     * @param saldo
     */
    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }
    /**
     * Sebuah method untuk mengecek jumlah uang minimal yang disetor agar tidak kurang dari setoran minimum
     * @param uang
     */
    public void simpanUang(double uang)
    {
        Scanner inputKalimat = new Scanner(System.in);
            do{
                System.out.print("Masukkan jumlah uang yang ingin anda simpan: ");
                uang = inputKalimat.nextDouble();
            if(uang < this.setoran_minimum){
                System.out.println("Maaf jumlah uang yang ingin disimpan kurang dari setoran minimum");
                System.out.println("Silahkan input ulang!");
            }else{
                System.out.println("Alhamdulillah jumlah uang yang disetor tidak kurang dari setoran minimum");
            }
              }while(uang < this.setoran_minimum);
              setSaldo(uang);
          
    }
    
    /**
     * Sebuah Method mutator untuk membuat peraturan dalam menarik uang
     * @param jumlahPenarikan
     */
    public void tarikUang(double jumlahPenarikan)
    {
        double sisaPenarikan = jumlahPenarikan - this.saldo;
        if(jumlahPenarikan < 0 || jumlahPenarikan > this.saldo || sisaPenarikan < this.saldo_minimum){
            System.out.println("Maaf anda tidak boleh tarik uang");
        }else{
            System.out.println("Selamat anda bisa menarik uang");
            double saldoSekarang = getSaldo() - jumlahPenarikan;
            setSaldo(saldoSekarang);
        }
        
    }
}
