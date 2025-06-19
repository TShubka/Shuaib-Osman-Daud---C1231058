import java.util.Scanner;

public class ret {
    public static void main(String[] args) {
        Scanner akhri = new Scanner(System.in);

        System.out.print("Magaca badeecada: ");
        String magaca = akhri.next();

        System.out.print("Qiimaha badeecada: ");
        double qiimaha = akhri.nextDouble();

        // Qaybaha code-ka sirta ah
        String xarfo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lambarro = "0123456789";

        // Qayb ka mid ah magaca
        char xarafMagac = magaca.toUpperCase().charAt(0);

        // Abuur code 4-digit random
        String code = "";
        for (int i = 0; i < 4; i++) {
            int index = (int)(Math.random() * lambarro.length());
            code += lambarro.charAt(index);
        }

        String finalCode = xarafMagac + "-" + code;

        System.out.println("Badeeco: " + magaca);
        System.out.println("Qiimaha: $" + qiimaha);
        System.out.println("Code-ka badeecada: " + finalCode);
    }
}