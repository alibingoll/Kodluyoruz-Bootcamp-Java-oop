package classes;

import interfaces.Calculator;

public class BasicCalculator implements Calculator {
    @Override
    public int toplam(int sayi1, int sayi2) {
        return sayi1+sayi2;
    }

    @Override
    public int cikarma(int sayi1, int sayi2) {
        return sayi1-sayi2;
    }

    @Override
    public int carpim(int sayi1, int sayi2) {
        return sayi1*sayi2;
    }

    @Override
    public int bolum(int sayi1, int sayi2) {
        return sayi1/sayi2;
    }
}
