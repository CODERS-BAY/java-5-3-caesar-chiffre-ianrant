import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner stringScanner = new Scanner(System.in);
        Scanner numberScanner = new Scanner(System.in);

        System.out.println("This is a cipher.");
        System.out.println("Please enter an int value to determine the shift of the cipher. The possible range ist 1 to 26:");
        int offset = numberScanner.nextInt();

        if (offset < 1 || offset > 26) {
            System.out.println("The value you entered is invalid. Please enter again:");
            offset = numberScanner.nextInt();
        }

        System.out.println("Please enter a sentence that you want to have ciphered:");
        String textInput = stringScanner.nextLine();
        char[] characterArray = textInput.toCharArray();

        for (int i = 0; i <characterArray.length; i++){
            int temp = characterArray[i];

            System.out.print(characterArray[i] + ": ");
            System.out.print("current temp = " + temp + " ==> ");

            temp += offset;

            System.out.print("temp+offset = " + temp + " ==> ");

            // if value of temp exceeds the unicode range of capital letters or small letters, it the counter
            // goes back to A or a and cunts up (proportionately from there)
            if (temp >= 'a' && temp <= 'z') {
                temp += offset;
                if (temp > 'z') {
                    temp -= 26;
                }
            } else if (temp >= 'A' && temp <= 'Z') {
                temp += offset;
                if (temp > 'Z') {
                    temp -= 26;
                }
            }

            System.out.print(" corrected temp = " + temp + " ");
            System.out.println();

            /*characterArray[i] = (char)temp;
            System.out.print(characterArray[i]);*/
        }
        System.out.println();
        Arrays.toString(characterArray);
    }
}
