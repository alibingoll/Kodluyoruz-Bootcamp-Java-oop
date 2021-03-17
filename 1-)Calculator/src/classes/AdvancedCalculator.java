package classes;

import interfaces.Scientific;

public class AdvancedCalculator extends BasicCalculator implements Scientific {
    @Override
    public int KareAl(int sayi) {
        return sayi*sayi;
    }

    @Override
    public int KupAl(int sayi) {
        return sayi*sayi*sayi;
    }
}
