import classes.AdvancedCalculator;
import classes.BasicCalculator;
import interfaces.Calculator;
import interfaces.Scientific;

public class Main {

    public static void main(String[] args) {

        int sayi1=20,sayi2=4,sonuc=0,toplam,cikarma,carpim,bolme;
        int sayi=6,kupu,karesi;

        Calculator basicCalculator=new BasicCalculator();
        Scientific scientific=new AdvancedCalculator();

        toplam=basicCalculator.toplam(sayi1,sayi2);
        cikarma=basicCalculator.cikarma(sayi1,sayi2);
        carpim=basicCalculator.carpim(sayi1,sayi2);
        bolme=basicCalculator.bolum(sayi1,sayi2);
        System.out.println("Sayıların Toplamı:"+toplam);
        System.out.println("Sayıların Farkı:"+cikarma);
        System.out.println("Sayıların Çarpımı:"+carpim);
        System.out.println("Sayıların Bölümü:"+bolme);
        System.out.println("*****************************************");
        kupu=scientific.KupAl(sayi);
        karesi=scientific.KareAl(sayi);
        System.out.println(sayi+" sayısının karesi:"+karesi);
        System.out.println(sayi+" sayısının küpü:"+kupu);
    }
}
