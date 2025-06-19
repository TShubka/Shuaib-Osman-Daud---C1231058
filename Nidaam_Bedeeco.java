import java.util.Scanner;

public class Nidaam_Bedeeco {
    private static String badeeco1, badeeco2, badeeco3;
    private static double qiimo1, qiimo2, qiimo3;
    private static int tiradaBadeeco = 0;

    private static double wadartaQiimo = 0;
    private static double qiimoSare = -1;
    private static double qiimoHoose = Double.MAX_VALUE;

    public static void main(String[] args) {
        Scanner akhri = new Scanner(System.in);
        int doorasho;

        do {
            System.out.println("\n== Nidaamka Maareynta Dukaanka ==");
            System.out.println("1. Ku dar badeeco");
            System.out.println("2. Warbixin guud");
            System.out.println("3. Raadi badeeco");
            System.out.println("4. Bax");
            System.out.print("Dooro (1-4): ");
            doorasho = akhri.nextInt();

            if (doorasho == 1) darBadeeco(akhri);
            else if (doorasho == 2) warbixin();
            else if (doorasho == 3) raadsoBadeeco(akhri);
        } while (doorasho != 4);
    }

    private static void darBadeeco(Scanner sc) {
        if (tiradaBadeeco >= 3) {
            System.out.println("Lama darikaro wax ka badan 3 badeeco.");
            return;
        }

        System.out.print("Magaca badeecada: ");
        String magaca = sc.next();

        System.out.print("Qiimaha badeecada: ");
        double qiimaha = sc.nextDouble();

        tiradaBadeeco++;
        wadartaQiimo += qiimaha;

        if (qiimaha > qiimoSare) qiimoSare = qiimaha;
        if (qiimaha < qiimoHoose) qiimoHoose = qiimaha;

        if (tiradaBadeeco == 1) { badeeco1 = magaca; qiimo1 = qiimaha; }
        else if (tiradaBadeeco == 2) { badeeco2 = magaca; qiimo2 = qiimaha; }
        else { badeeco3 = magaca; qiimo3 = qiimaha; }

        System.out.println("Badeeco la daray: " + magaca);
    }

    private static void warbixin() {
        if (tiradaBadeeco == 0) {
            System.out.println("Wax badeeco lama daray weli.");
            return;
        }

        double celcelis = Math.round((wadartaQiimo / tiradaBadeeco) * 100) / 100.0;

        System.out.println("\n--- Warbixin Dukaanka ---");
        System.out.println("Tirada badeecooyinka: " + tiradaBadeeco);
        System.out.println("Qiimaha celcelis: " + celcelis);
        System.out.println("Qiimaha ugu sareeya: " + qiimoSare);
        System.out.println("Qiimaha ugu hooseeya: " + qiimoHoose);
    }

    private static void raadsoBadeeco(Scanner sc) {
        if (tiradaBadeeco == 0) {
            System.out.println("Dukaan waxba kuma jiraan.");
            return;
        }

        System.out.print("Magaca badeecada aad raadineyso: ");
        String raadso = sc.next();

        if (raadso.equalsIgnoreCase(badeeco1)) System.out.println("Qiimaheedu waa: " + qiimo1);
        else if (raadso.equalsIgnoreCase(badeeco2)) System.out.println("Qiimaheedu waa: " + qiimo2);
        else if (raadso.equalsIgnoreCase(badeeco3)) System.out.println("Qiimaheedu waa: " + qiimo3);
        else System.out.println("Badeeco lama helin.");
    }
}