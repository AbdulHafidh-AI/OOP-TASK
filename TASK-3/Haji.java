import java.util.Scanner;
/**
 * Sebuah class yang merupakan turunan dari class tabungan untuk penyimpanan atau penarikan pada dana haji
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
        super(nama,noRek);
        super.setSaldoMinimum(SALDO_MINIMUM);
        super.setSetoranMinimum(SETORAN_MINIMUM);
        if(saldoAwal >= SALDO_AWAL_MINIMUM){
        super.setSaldo(saldoAwal);
        }
    }
    
    /**
     * Sebuah method yang di override dari super method yaitu dari class Tabungan
     * @param jumlahPenarikan
     */
    @Override
    public void tarikUang(double jumlahPenarikan)
    {
        int i = 0;
        String kalimat;
        boolean kondisi = true;
        Scanner inputKata = new Scanner(System.in);
        Scanner inputAngka = new Scanner(System.in);
        double saldoSekarang = super.getSaldo();
        double sisaPenarikan = saldoSekarang - jumlahPenarikan;
        while(kondisi){
            i = 0;
            System.out.printf("Total Saldo Anda Adalah : %.0f \n",saldoSekarang);
            do{
            if(i > 0){
                System.out.println("Berapakah uang yang anda ingin tarik: ");
                jumlahPenarikan = inputAngka.nextDouble();
            }else{
            System.out.print("Berapakah uang yang anda ingin tarik: ");
            jumlahPenarikan = inputAngka.nextDouble();
            }
            if(jumlahPenarikan > saldoSekarang * 10 / 100 && i == 0){
                System.out.println("Disarankan untuk tidak mengambil lebih dari 10 persen!");
                i++;
            }else if(jumlahPenarikan > saldoSekarang * 10 / 100){
                System.out.println("Karena anda mengambil lebih dari 10 persen maka akan ada pemotongan 50 ribu setiap pengambilan");
                saldoSekarang = saldoSekarang - jumlahPenarikan;
                saldoSekarang = saldoSekarang -  50000;
                super.setSaldo(saldoSekarang);
                i++;
            }else if(jumlahPenarikan < 0 || sisaPenarikan < 0){
                System.out.println("Maaf anda tidak bisa tarik uang silahkan coba lagi!");
            }else{
                System.out.println("karena kurang dari 10 persen dari total saldo maka tidak akan ada pengurangan");
                saldoSekarang = saldoSekarang - jumlahPenarikan;
                super.setSaldo(saldoSekarang);
            }
    
              }while(((jumlahPenarikan > saldoSekarang * 10 / 100) && (i == 1)) || (jumlahPenarikan < 0 || sisaPenarikan < 0));
    
              System.out.print("Apakah anda ingin menarik uang untuk kebutuhan haji lagi (Y/N)?: ");
              kalimat = inputKata.nextLine();
    
              if(kalimat.equalsIgnoreCase("y")){
                 kondisi = true;
              }else{
                 kondisi = false;
              }
            }
            super.setSaldo(saldoSekarang);
        
    }

}