import java.util.Scanner;

public class Kembalian {
    public static void main(String[] args) {
        Scanner inpHargaBarang = new Scanner(System.in);
        Scanner inpUangDiberikan = new Scanner(System.in);

        System.out.print("Masukan harga barang: ");
        int hargaBarang = inpHargaBarang.nextInt();

        System.out.print("Masukan uang diberikan: ");
        int uangDiberikan = inpUangDiberikan.nextInt();

        System.out.println("Harga Barang : " + hargaBarang);
        System.out.println("Uang diberikan: " + uangDiberikan);
        System.out.println("Kembalian: " + (uangDiberikan - hargaBarang));

        inpHargaBarang.close();
        inpUangDiberikan.close();
    }
}