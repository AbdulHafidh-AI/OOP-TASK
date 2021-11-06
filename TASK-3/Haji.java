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
     * 
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
        
    }

}