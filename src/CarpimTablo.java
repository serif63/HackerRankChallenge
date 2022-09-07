import java.util.Scanner;
public class CarpimTablo {
    public static void main(String[] args) {
        int n,i,t;

        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz");
        n=input.nextInt();

        for(i=1;i<=10;i++) {
            t = i * n;
            System.out.println(n + "*" + i + "=" + t);
        }
    }
}
