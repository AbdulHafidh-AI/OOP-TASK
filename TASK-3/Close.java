import java.util.Scanner;
public class Close {
    public static void main(String[] args) throws Exception {
        String nama;
        int umur;
        try(Scanner input = new Scanner(System.in)){
        try(Scanner in = new Scanner(System.in)){
        System.out.print("Masukkan nama anda: ");
        nama = in.nextLine();
        System.out.println(nama);
        } catch (Exception e) {
            //TODO: handle exception
        }finally{

        }
        System.out.println("Pasti error");
    
        System.out.print("Masukkan umur anda: ");
        try {
        umur = input.nextInt();
        System.out.println(umur);
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }catch (Exception e) {
        //TODO: handle exception
    }
        
        
        
        
    }
}
