import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String a = sc.nextLine();
        for (int i = a.length() - 1; i > -1; i--) {
//length le last element bhanda euta dherai number dincha so -1
            char x = a.charAt(i);

////            if (x.equals(a)) {
//                System.out.println("palindrome");
//            } else {
//                System.out.println("not palindrome");
//
//            }
        }
    }
}