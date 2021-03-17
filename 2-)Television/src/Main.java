import Classes.Television;
import interfaces.ITelevision;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ITelevision television=new Television();
        television.setHeight(50);
        television.setWidth(50);
        television.setScreenSize(57);
        television.setVolume(50);
        String durum=television.isPower()?"Açık":"Kapalı";
        //çok karışık olmaması için genişlik yüksekliği vb default olarak giriyorum.
        System.out.println("--Televizyon Bilgileri--");
        System.out.println("Yükseklik:"+television.getHeight());
        System.out.println("Genişlik:"+television.getWidth());
        System.out.println("Ekran Boyutu:"+television.getScreenSize());
        System.out.println("Şuanki Sesi:"+television.getVolume());
        System.out.println("Durum:"+durum);
        System.out.println("--------------------");
        System.out.println("1-)Televizyonu Aç / Kapat.");
        System.out.println("2-)Sesi Yükselt");
        System.out.println("3-)Sesi Azalt");
        System.out.print("Yapmak İstediğiniz İşlemi Yazınız(Rakam olarak):");
        Scanner reader=new Scanner(System.in);
        int chosen=reader.nextInt();
        switch (chosen){
            case 1:
                television.setPower();

                break;
            case 2:
                television.upVolume(5);
                /*default olarak volume 50 yaptım ve 5 5 arttırıyor
                eğer üst kutudaki 5 i silip 51 yaparsanız 100 üzeri ses olmayacağı için haya verir.*/
                break;
            case 3:
                television.upVolume(10);
                /*default olarak volume 50 yaptım ve 5 5 arttırıyor
                eğer üst kutudaki 5 i silip 51 yaparsanız 0 altı ses olmayacağı için haya verir.*/
                break;
        }
        television.getInfo();//bilgiler değiştirildikten sonra bilgileri tekrar getiriyor

    }
}
