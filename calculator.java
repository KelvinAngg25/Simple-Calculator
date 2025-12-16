import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double hasil = 0;

        System.out.print("Masukkan angka pertama: ");
        double angkaPertama = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angkaKedua = scanner.nextDouble();

        System.out.print("Masukkan operasi (+/-/*/:) : ");
        String operation = scanner.next();

        switch (operation) {
            case "+" : {
                hasil = angkaPertama + angkaKedua;
                System.out.println("Hasil : " + hasil);
                break;
            }
            case "-" : {
                hasil = angkaPertama - angkaKedua;
                System.out.println("Hasil : " + hasil);
                break;
            }
            case "*" : {
                hasil = angkaPertama * angkaKedua;
                System.out.println("Hasil : " + hasil);
                break;
            }
            case ":" : {
                if (angkaKedua == 0) {
                    System.out.println("Error njing");
                }
                else {
                    hasil = angkaPertama / angkaKedua;
                    System.out.println("Hasil : " + hasil);
                }
                break;
            }
        }
        scanner.close();
    }
}
