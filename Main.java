import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int basamakSayisi, a, sayi1 = 0, sayi2 = 1, islem;
        Scanner inp = new Scanner(System.in);

        System.out.print("Basamak Sayısını Giriniz: ");
        basamakSayisi = inp.nextInt();

        for(a=1; a<=basamakSayisi; ++a){
            islem = sayi1 + sayi2;
            System.out.println(sayi1 +" + "+ sayi2 +" = "+ islem);
            sayi1 = sayi2;
            sayi2 = islem;
        }
    }
}