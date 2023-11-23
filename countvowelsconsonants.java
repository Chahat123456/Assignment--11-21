import java.util.Scanner;

public class countvowelsconsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String a = sc.nextLine().toLowerCase();
        int sum_vowels = 0;
        int sum_conson = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    sum_vowels++;
                } else {
                   sum_conson++;
                }
            }
        }

        System.out.println("Number of vowels: " + sum_vowels);
        System.out.println("Number of consonants: " + sum_conson);
    }
}
