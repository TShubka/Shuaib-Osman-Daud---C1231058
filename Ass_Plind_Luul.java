import java.util.Scanner;

public class Ass_Plind_Luul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Qor Xaraf: ");
        String xrf = input.nextLine();


        if (xrf.matches("[0-9]+")) {
            System.out.println("Mahan eray waa tiro, fadlan geli xaraf sax ah.");
            return;
        }

        String reversedXrf = "";
        for (int i = xrf.length() - 1; i >= 0; i--) {
            reversedXrf = reversedXrf + xrf.charAt(i);
        }

        if (xrf.equalsIgnoreCase(reversedXrf)) {
            System.out.println("Erygaaga \"" + xrf + "\" wuu yahay palindrome.");
        } else {
            System.out.println("Erygaaga \"" + xrf + "\" maahan palindrome.");
        }


        System.out.print("Su Gali Tirooooooo: ");
        String tiroInput = input.next();


        if (!tiroInput.matches("[0-9]+")) {
            System.out.println("Mahan tiro waa xarfaf, fadlan soo geli tiro sax ah.");
            return;
        }

        int Tiro = Integer.parseInt(tiroInput);
        int tiroSaxdaAh = Tiro;
        int reversedTiro = 0;

        while (Tiro != 0) {
            int digit = Tiro % 10;
            reversedTiro = reversedTiro * 10 + digit;
            Tiro = Tiro / 10;
        }

        if (tiroSaxdaAh == reversedTiro) {
            System.out.println("Tirada " + tiroSaxdaAh + " wuu yahay palindrome.");
        } else {
            System.out.println("Tiradaada " + tiroSaxdaAh + " maahan palindrome.");
        }

        input.close();
    }
}
