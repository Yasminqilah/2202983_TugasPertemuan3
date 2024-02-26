package latihan.pertemuan.pkg3;
import java.util.Scanner;
public class tigasisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan panjang sisi pertama:");
        double sisi1 = scanner.nextDouble();
        
        System.out.println("Masukkan panjang sisi kedua:");
        double sisi2 = scanner.nextDouble();
        
        System.out.println("Masukkan panjang sisi ketiga:");
        double sisi3 = scanner.nextDouble();
        
        if (sisi1 == sisi2 && sisi2 == sisi3) {
            System.out.println("Termasuk Kubus");
        } else {
            System.out.println("Bukan Kubus");
        }
        
        scanner.close();
    }
    
}
