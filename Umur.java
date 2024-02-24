import java.util.Scanner;

public class Umur {
    public static void main(String[] args) {
        Scanner inpTahunlahir = new Scanner(System.in);
        Scanner inpTahunSekarang = new Scanner(System.in);

        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = inpTahunlahir.nextInt();

        System.out.print("Masukkan tahun sekarang: ");
        int tahunSekarang = inpTahunSekarang.nextInt();

        System.out.println("Tahun Lahir: " + tahunLahir);
        System.out.println("Tahun Sekarang: " + tahunSekarang);
        System.out.println("Umur: " + (tahunSekarang - tahunLahir));

        inpTahunlahir.close();
        inpTahunSekarang.close();
    }
}
