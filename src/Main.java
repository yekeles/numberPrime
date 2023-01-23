import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //x üssü y nin sonucu bulmak için x sayısı y defa kendisiyle çarpılır.
        int x, y, total = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz : ");
        x = input.nextInt();
        System.out.print("Sayının üs kuvvetini giriniz : ");
        y = input.nextInt();
        for (int i = 1; i <= y; i++) {
            total *= x;
        }
        System.out.print("Sonuç : " + total);
    }
}