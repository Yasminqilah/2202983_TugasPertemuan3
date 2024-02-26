package latihan.pertemuan.pkg3;
import java.util.Scanner;
public class LatihanPertemuan3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan tiga karakter (huruf kecil):");
        String input = scanner.nextLine();

        if (input.length() != 3) {
            System.out.println("Masukkan harus terdiri dari tiga karakter.");
        } else {
            char char1 = input.charAt(0);
            char char2 = input.charAt(1);
            char char3 = input.charAt(2);

            if (isConsonant(char1) && isVowel(char2) && isConsonant(char3)) {
                System.out.println("Urutan konsonan-vokal-konsonan terpenuhi.");
            } else {
                System.out.println("Urutan konsonan-vokal-konsonan tidak terpenuhi.");
            }
        }

        scanner.close();
    }

    private static boolean isConsonant(char c) {
        return !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    private static boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
        
  }
    
