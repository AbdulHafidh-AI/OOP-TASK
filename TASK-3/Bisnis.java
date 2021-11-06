/**
 * Sebuah class turunan dari class tabungan
 * @author Abdul Hafidh
 * @version 2021.11.02
 */
public class Bisnis extends Tabungan
{
    // Fields
    private double SALDO_AWAL_MINIMUM = 1000000;
    private double SALDO_MINIMUM = 1000000;
    private double SETORAN_MINIMUM = 50000;

    /**
     * 
     * @param nama
     * @param noRek
     * @param saldoAwal
     */
    public Bisnis(String nama, long noRek, double saldoAwal)
    {
        super();
        super.setSaldoMinimum(SALDO_MINIMUM);
        super.setSetoranMinimum(SETORAN_MINIMUM);
        super.setSaldo(saldoAwal);
        
    }
}
