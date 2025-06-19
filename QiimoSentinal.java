import java.util.Scanner;

public class QiimoSentinal {
    public static void main(String[] args) {

        int wadarta = 0;
        char joojiso = 'n';

        Scanner aqri = new Scanner(System.in);
        System.out.println("Geli tirooyin si loo isku daro");
        System.out.println("Riix n si aad u joojiso: ");
        System.out.println("Geli tiro dhan: ");

        String gelinta = aqri.nextLine();

        while (!gelinta.equalsIgnoreCase("n")) {
            int tiro = Integer.parseInt(gelinta);

            wadarta += tiro;

            System.out.println("So Geli tiro kale: ");
            gelinta = aqri.nextLine();
        }

        System.out.println("Qiimaha guud Wa : " + wadarta);

        aqri.close();
    }
}
