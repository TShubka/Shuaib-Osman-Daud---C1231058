import java.util.Scanner;

public class PrimeTiro {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Geli tiro: ");
        int tiro = read.nextInt();

        boolean waaTiroPrime = true;

        for (int i = 2; i < tiro; i++) {
            if (tiro % i == 0) {
                waaTiroPrime = false;
                break;
            }
        }

        if (waaTiroPrime) {
            System.out.println(tiro + " waa tiro prime.");
        } else {
            System.out.println(tiro + " ma ahan tiro prime.");
        }

        read.close();
    }
}
