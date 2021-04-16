import java.util.Scanner;

public class BAITAP_sayHello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten cua ban: ")
        String name = sc.nextLine();
        System.out.println("Hello: " + name);
    }
}
