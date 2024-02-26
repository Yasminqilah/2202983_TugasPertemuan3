package latihan.pertemuan.pkg3;
import java.util.Scanner;
public class lamakerja {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan jam masuk (dalam rentang 1-12):");
        int jamMasuk = scanner.nextInt();
        
        if (jamMasuk < 1 || jamMasuk > 12) {
            System.out.println("Jam masuk tidak valid.");
            return;
        }
        
        System.out.println("Masukkan jam keluar (dalam rentang 1-12):");
        int jamKeluar = scanner.nextInt();
        
        if (jamKeluar < 1 || jamKeluar > 12) {
            System.out.println("Jam keluar tidak valid.");
            return;
        }
    
        int lamaBekerja;
        if (jamKeluar >= jamMasuk) {
            lamaBekerja = jamKeluar - jamMasuk;
        } else {
            lamaBekerja = (12 - jamMasuk) + jamKeluar;
        }
        
        System.out.println("Lama bekerja: " + lamaBekerja + " jam.");
        
        scanner.close();
    }
    
}
