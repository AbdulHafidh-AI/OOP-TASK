/**
 * Sebuah class yang terdapat informasi dari si penabung
 * @author Abdul Hafidh
 * @version 2021.11.02
 */
public class Tabungan  {
    // fields
    private String nama;
    private long noRekening;
    private double saldo = 0;
    private double saldo_minimum = 0;
    private double setoran_minimum = 0;

    /**
     * 
     */
    public Tabungan(){

    }

    /**
     * 
     * @param nama
     * @param noRekening
     */
    public Tabungan(String nama, long noRekening){
        this.nama = nama;
        this.noRekening = noRekening;
    }

     /**
      * 
      * @param saldo_minimum
      */
    protected void setSaldoMinimum(double saldo_minimum){

    }
    /**
     * 
     * @param setoran_minimum
     */
    protected void setSetoranMinimum(double setoran_minimum){
        this.setoran_minimum = setoran_minimum;
    }
    /**
     * 
     * @return
     */
    public double getSaldo(){
        return saldo;
    }
    /**
     * 
     * @param saldo
     */
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    /**
     * 
     * @param uang
     */
    public void simpanUang(double uang){
        if(uang < this.setoran_minimum){
            System.out.println("Maaf jumlah uang yang disetor kurang dari setoran minimum");
        }else{
            System.out.println("Alhamdulillah jumlah uang yang disetor tidak kurang dari setoran minimum");
        }
    }
    
    /**
     * 
     * @param jumlahPenarikan
     */
    public void tarikUang(double jumlahPenarikan){
        double sisaPenarikan = jumlahPenarikan - saldo;
        if(jumlahPenarikan < 0 || jumlahPenarikan > this.saldo || sisaPenarikan < this.saldo_minimum){
            System.out.println("Maaf anda tidak boleh tarik uang");
        }
    }
}
