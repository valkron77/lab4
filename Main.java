import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        String numHexa;
        int spacesHexa;
        char digitHexa;
        int countDown;
        long countDeci = 0;
        long finalCount = 0;
        int hexaPower = 0;

        System.out.print("Enter a hexadecimal number: ");
        numHexa = scnr.next();
        spacesHexa = numHexa.length();
        countDown = spacesHexa;

        while (countDown > 0) {

            countDeci = 0;
            digitHexa = numHexa.charAt(countDown - 1);

            if (Character.isDigit(digitHexa)) {
                countDeci = Character.getNumericValue(digitHexa);
            }
            else if (digitHexa == 'x') {
                countDown = 0;
            }
            else {
                digitHexa = Character.toLowerCase(digitHexa);
                if (digitHexa == 'a') {
                    countDeci = 10;
                }
                else if (digitHexa == 'b') {
                    countDeci = 11;
                }
                else if (digitHexa == 'c') {
                    countDeci = 12;
                }
                else if (digitHexa == 'd') {
                    countDeci = 13;
                }
                else if (digitHexa == 'e') {
                    countDeci = 14;
                }
                else if (digitHexa == 'f') {
                    countDeci = 15;
                }
                else {
                    System.out.println("Error: not valid hexadecimal");
                }
            }
            countDeci = countDeci * (int)Math.pow(16, hexaPower);
            finalCount = finalCount + countDeci;
            countDown--;
            hexaPower++;
        }
        System.out.print("Your number is " + finalCount + " in decimal");

    }
}
