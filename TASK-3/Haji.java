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
        super(nama,noRek);
        super.setSaldoMinimum(SALDO_MINIMUM);
        super.setSetoranMinimum(SETORAN_MINIMUM);
        if(saldoAwal > SALDO_AWAL_MINIMUM){
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
        try {
            
        } catch (Exception e) {
            //TODO: handle exception
        }
        Scanner inputKata = new Scanner(System.in);
        Scanner inputAngka = new Scanner(System.in);
        double saldoSekarang = super.getSaldo();

            System.out.printf("Sebelum perulangan saldonya berjumlah %f \n", saldoSekarang);
        while(kondisi){
            i = 0;
            System.out.printf("Total Saldo Anda Adalah : %f \n",saldoSekarang);
            do{
            if(i > 0){
                System.out.println("Berapakah uang yang anda ingin tarik: ");
                jumlahPenarikan = inputAngka.nextDouble();
            }else{
            System.out.print("Berapakah uang yang anda ingin tarik: ");
            jumlahPenarikan = inputAngka.nextDouble();
            }
            if(jumlahPenarikan > saldoSekarang * 10 / 100 && i == 0){
                System.out.println("saran! jangan ambil dari 10 %");
                i++;
            }else if(jumlahPenarikan > saldoSekarang * 10 / 100){
                System.out.println("Karena anda terlalu marok maka lebih baik setiap pengambilan ini uang anda akan dipotong 50 rb hahahha");
                saldoSekarang = saldoSekarang - jumlahPenarikan;
                saldoSekarang = saldoSekarang -  50000;
                i++;
            }else{
                System.out.println("karena kurang dari 10 persen dari total saldo maka tidak akan ada pengurangan");
                saldoSekarang = saldoSekarang - jumlahPenarikan;
            }
    
              }while((jumlahPenarikan > saldoSekarang * 10 / 100) && (i == 1));
    
              System.out.println("Apakah anda ingin menarik uang untuk kebutuhan haji lagi (Y/N)?: ");
              kalimat = inputKata.nextLine();
    
              if(kalimat.equalsIgnoreCase("y")){
                 kondisi = true;
              }else{
                 kondisi = false;
              }
            
            }
        
    }

}