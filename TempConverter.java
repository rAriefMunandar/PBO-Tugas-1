import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Konverter Suhu");
        System.out.println("Pilih satuan suhu yang akan diinput:");
        System.out.println("1. Celcius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Reamur");
        System.out.println("4. Kelvin");
        System.out.print("Masukkan pilihan Anda (1-4): ");
        int satuanInput = scanner.nextInt();

        double suhuInput, suhuCelcius = 0, suhuFahrenheit = 0, suhuReamur = 0, suhuKelvin = 0;

        switch (satuanInput) {
            case 1:
                System.out.print("Masukkan suhu dalam Celcius: ");
                suhuInput = scanner.nextDouble();
                suhuCelcius = suhuInput;
                suhuFahrenheit = (suhuInput * 9/5) + 32;
                suhuReamur = suhuInput * 4/5;
                suhuKelvin = suhuInput + 273.15;
                break;
            case 2:
                System.out.print("Masukkan suhu dalam Fahrenheit: ");
                suhuInput = scanner.nextDouble();
                suhuCelcius = (suhuInput - 32) * 5/9;
                suhuFahrenheit = suhuInput;
                suhuReamur = (suhuInput - 32) * 4/9;
                suhuKelvin = (suhuInput + 459.67) * 5/9;
                break;
            case 3:
                System.out.print("Masukkan suhu dalam Reamur: ");
                suhuInput = scanner.nextDouble();
                suhuCelcius = suhuInput * 5/4;
                suhuFahrenheit = (suhuInput * 9/4) + 32;
                suhuReamur = suhuInput;
                suhuKelvin = (suhuInput * 5/4) + 273.15;
                break;
            case 4:
                System.out.print("Masukkan suhu dalam Kelvin: ");
                suhuInput = scanner.nextDouble();
                suhuCelcius = suhuInput - 273.15;
                suhuFahrenheit = (suhuInput * 9/5) - 459.67;
                suhuReamur = (suhuInput - 273.15) * 4/5;
                suhuKelvin = suhuInput;
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        System.out.println("Hasil konversi:");
        System.out.println("Suhu dalam Celcius: " + suhuCelcius);
        System.out.println("Suhu dalam Fahrenheit: " + suhuFahrenheit);
        System.out.println("Suhu dalam Reamur: " + suhuReamur);
        System.out.println("Suhu dalam Kelvin: " + suhuKelvin);

        scanner.close();
    }
}
