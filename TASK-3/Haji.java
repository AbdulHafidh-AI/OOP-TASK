import java.util.Scanner;
/**
 * Sebuah class turunan dari class tabungan 
 * @author Abdul Hafidh
 * @version 2021.11.02
 */
public class Haji extends Tabungan
{
    // Fields
    private double SALDO_AWAL_MINIMUM = 500000;
    private double SALDO_MINIMUM = 500000;
    private double SETORAN_MINIMUM = 100000;

    /**
     * Sebuah Method Constructor untuk class haji dengan adanya 3 parameter
     * @param nama
     * @param noRek
     * @param saldoAwal
     */
    public Haji(String nama, long noRek, double saldoAwal)
    {
        super();
        super.setSaldoMinimum(SALDO_MINIMUM);
        super.setSetoranMinimum(SETORAN_MINIMUM);
        super.setSaldo(saldoAwal);
    }
    
    /**
     * Sebuah method yang di override dari super method yaitu dari class Tabungan
     * @param jumlahPenarikan
     */
    @Override
    public void tarikUang(double jumlahPenarikan)
    {
        int i = 0;
        try(Scanner in = new Scanner(System.in)){
        do{
        if(i > 0){
            System.out.println("Berapakah uang yang anda ingin tarik: ");
            jumlahPenarikan = in.nextInt();
        }
        System.out.print("Berapakah uang yang anda ingin tarik: ");
        jumlahPenarikan = in.nextInt();
        if(jumlahPenarikan > super.getSaldo() * 10 / 100 && i == 0){
            System.out.println("saran! jangan ambil dari 10 %");
        }else if(jumlahPenarikan > super.getSaldo() * 10 / 100){

        }else{

        }
           i++;
          }while(jumlahPenarikan > super.getSaldo() * 10 / 100 && i == 0);
        } catch (Exception e) {

        }finally{

        }
        
        
    }

}