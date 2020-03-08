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

        int decValueRange = 0; // variable that checks the range of the decimal value of a character

        for (int i =0; i <characterArray.length; i++){
            int temp = characterArray[i];

            temp += offset;

            // if value of temp exceeds the unicode range of capital letters or small letters, it the counter
            // goes back to A or a and counts up (proportionately from there)
            if ((temp > 90) | (temp > 122)){
                temp -= 26;
            }

            characterArray[i] = (char)temp;
            System.out.print(characterArray[i]);
        }


        // when the decimal value of a character is between 65 and 90 (for capital letters)
        // or between 97 and 122 (for small letters) everything is fine
        // but if they exceed, they must be subtracted by 26 to fit into the "allowed" range again






        /*for (int k = 0; k <= preCipher.length; k++){
            String finalCipher = ((char)(preCipher[k]+cipherNumber)) ;
            System.out.print();
        }*/







        /*char[] sign  = {'C', 'D'} ;

        System.out.println((char)(sign[0] + 4));
        System.out.println((char)(sign[1]+ 7));*/
    }

}
