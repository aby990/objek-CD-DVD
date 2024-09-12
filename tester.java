
import java.util.Scanner;

public class tester {
    private static Scanner in;

    public static void main(String[] args) {
        System.out.println("Berapa objek yg dibuat? (MAKS 10)");
        int jumlah = in.nextInt();
        Scanner in = new Scanner(System.in);
        System.out.println("CD ATAU DVD");
        String pilihan = in.next();


        if (pilihan.equals("CD")) {
            cd c1 = new cd();
            c1.print();
        } else if (pilihan.equals("DVD")) {
        dvd d1 = new dvd();
        d1.print();
        } else {
            System.out.println("input Salah");
        }



        in.close();
    }
}
