package chapter4;


import java.util.Scanner;



public class printingthedecimalequivalentofabinarynumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int binarynumber = 0;
        boolean isValid = false;
        while (!isValid) {

                System.out.print("Enter a binary number (only 0s and 1s): ");
            binarynumber = input.nextInt();


                isValid = isBinary(binarynumber);

                if (!isValid) {
                    System.out.println("Error: Please enter a binary number containing only 0s and 1s.");
                }
            }

            int decimal = convertBinaryToDecimal(binarynumber);
            System.out.printf("The decimal equivalent of binary %d is: %d%n", binarynumber, decimal);
        }


        public static boolean isBinary(int number) {
            int digit;
            while (number != 0) {
                digit = number % 10;
                if (digit != 0 && digit != 1) {
                    return false;
                }
                number /= 10;
            }
            return true;
        }


        public static int convertBinaryToDecimal(int binary) {
            int decimal = 0;
            int power = 0;

            while (binary > 0) {
                int lastDigit = binary % 10;
                decimal += lastDigit * Math.pow(2, power);
                binary /= 10;
                power++;
            }

            return decimal;
        }
    }

