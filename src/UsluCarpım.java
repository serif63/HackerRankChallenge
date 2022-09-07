import java.util.Scanner;
public class UsluCarpım {
    public static void main(String[] args) {
        int a, b, n, carp=1, toplam;

        Scanner input = new Scanner(System.in);
        System.out.print("a baş kat sayısını giriniz");
        a = input.nextInt();
        System.out.print("b II. baş kat sayısını giriniz");
        b = input.nextInt();
        System.out.print("n us sayısını giriniz");
        n = input.nextInt();

        for (int i = 2; i < n+2; i++) {
            toplam = a + carp * b;
            System.out.println(toplam);
            int us=1;
            carp = 1;

            for (int k = 1; k < i; k++) {
                us *= 2;
                carp += us;
            }
        }
    }
}
