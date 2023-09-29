import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int f = scanner.nextInt();
        if (a > b && a > c && a > f )System.out.println(a) ;
        if (b > a && b > c && b > f )System.out.println(a) ;
        if (c > b && c > a && c > f )System.out.println(a) ;
        if (f > b && f > a && f > c )System.out.println(a) ;

    }
}