import java.util.Scanner;
/**
 * Sebuah class yang berisi method main yang bertujuan untuk menjalankan output
 * @author Abdul Hafidh
 * @version 2021.11.02
 */
public class TestTabungan 
{
    public static void main(String[] args) 
    {
        
        int i = 0;
        String test;
        String kalimat;
        double jumlahPenarikan;
        double saldo = 500;
        boolean kondisi = true;
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        while(kondisi){

        do{
        if(i > 0){
            System.out.println("Berapakah uang yang anda ingin tarik: ");
            jumlahPenarikan = in.nextInt();
        }else{
        System.out.print("Berapakah uang yang anda ingin tarik32: ");
        jumlahPenarikan = in.nextInt();
        }
        if(jumlahPenarikan > saldo * 10 / 100 && i == 0){
            System.out.println("saran! jangan ambil dari 10 %");
            i++;
        }else if(jumlahPenarikan > saldo * 10 / 100){
            System.out.println("Karena anda terlalu marok maka lebih baik setiap pengambilan ini uang anda akan dipotong 50 rb hahahha");
            i++;
        }else{
            System.out.println("karena kurang dari 10 persen dari total saldo maka tidak akan ada pengurangan");
        }

          }while((jumlahPenarikan > saldo * 10 / 100) && (i == 1));

          System.out.println("Apakah anda ingin menarik uang lagi?: ");
          kalimat = input.nextLine();

          if(kalimat.equalsIgnoreCase("y")){
             kondisi = true;
          }else{
             kondisi = false;
          }
        
        }
    System.out.println("done");
    in.close();
    input.close();
    Scanner tes = new Scanner(System.in);
    System.out.println("ayo tes2");
    try {
    test = tes.nextLine();
    System.out.println(test);
    } catch (Exception e) {
        //TODO: handle exception
    }
    System.out.println("yey berhasil");
    tes.close();
    }
}

