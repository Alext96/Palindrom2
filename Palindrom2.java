import java.util.Scanner;

public class Palindrom2 {

    public static void main(String args[]) {

        Scanner reader = new Scanner(System.in);
        System.out.println("skriv in ett ord");
        String input = reader.nextLine();

        System.out.println("Är " + input + " palindrom " + IsPalindrom(input));

        System.out.println("skriv in ett till ord");
        input = reader.nextLine();

        System.out.println("Är " + input + " palindrom " + IsPalindrom(input));

        reader.close();
    }
    public static boolean IsPalindrom(String input) {
        if(input == null || input.isEmpty()){
            return true;
    }

    char[] array = input.toCharArray();
    StringBuilder sb = new StringBuilder(input.length());
    for (int i = input.length() - 1; i >= 0; i--){
        sb.append(array[i]);
    }

    String reverseOfString = sb.toString();

    return input.equals(reverseOfString);

    }

}
