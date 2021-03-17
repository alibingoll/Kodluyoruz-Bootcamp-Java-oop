package Classes;
import interfaces.ITelevision;
import interfaces.ITelevisionDal;

public class Television implements ITelevision {
    ITelevisionDal televisionVal=new TelevisionVal();
    private int width;
    private int height;
    private int screenSize;
    private int maxVolume;
    private int volume;
    private boolean power=false;//default olarak televizyon kapalı.


    public void getInfo(){
        System.out.println("---------------");
        System.out.println("--Televizyon Bilgileri--");
        System.out.println("Yükseklik:"+this.height);
        System.out.println("Genişlik:"+this.width);
        System.out.println("Ekran Boyutu:"+this.screenSize);
        System.out.println("Şuanki Sesi:"+this.volume);
        System.out.println("Durum:"+this.power);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getMaxVolume() {
        return maxVolume;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isPower() {
        return power;
    }
    public void setPower(){
        if (this.power==true) power=false;
        else power=true;
    }
    /************************************************/
    public void turnTelevision(){
        this.power=true;
    }
    public void closeTelevision(){
        this.power=false;
    }

    public void upVolume(int volume){//default olarak mainden 5 arttırıyorum kullanıcıdanda veri alabilirdim ama böyle daha okunabilir kod olur diye yaptım.
        int volumeCheck=this.volume+volume;
        boolean volumeControl=televisionVal.volumeCheck(volumeCheck);
        if (volumeControl){
            this.volume+=volume;
            System.out.println("Televizyon Sesiniz:"+this.volume);
        }else {
            System.out.println("Televizyon sesiniz:"+this.volume+" sesiniz 100'ün üzeri veya 0'ın altı olamaz.");
        }


    }
    public void downVolume(int volume){//aynı şekil default olarak mainden 5 azaltıyorum.
        int volumeCheck=this.volume+volume;
        boolean volumeControl=televisionVal.volumeCheck(volumeCheck);
        if (volumeControl){
            this.volume-=volume;
            System.out.println("Televizyon Sesiniz:"+this.volume);
        }else {
            System.out.println("Televizyon sesiniz:"+this.volume+" sesiniz 100'ün üzeri veya 0'ın altı olamaz.");
        }
    }

}
