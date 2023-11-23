import java.util.Scanner;
public class digits_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        int mod =0;
        int sum = 0;
        while (num!=0){
            mod=num%10;
            sum=sum+mod;
            num=num/10;
        }
        System.out.println("Sum of digits=  "+sum);
    }
}

