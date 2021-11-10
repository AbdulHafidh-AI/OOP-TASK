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
     * Sebuah method constructor di class bisnis dengan adanya 3 parameter yang dimana isinya terdapat kata kunci super untuk memanggil super constructor, mengeset saldo minimum, setoran minimum dan saldo
     * @param nama
     * @param noRek
     * @param saldoAwal
     */
    public Bisnis(String nama, long noRek, double saldoAwal)
    {
        super(nama,noRek);
        super.setSaldoMinimum(SALDO_MINIMUM);
        super.setSetoranMinimum(SETORAN_MINIMUM);
        if(saldoAwal > SALDO_AWAL_MINIMUM){
            super.setSaldo(saldoAwal);
        }else{
            super.setSaldo(0);
        }
    }
}
