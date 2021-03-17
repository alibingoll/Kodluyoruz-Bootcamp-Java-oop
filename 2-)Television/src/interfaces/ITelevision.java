package interfaces;

public interface ITelevision {
   int getWidth();
   void setWidth(int width);
   int getHeight();
   void setHeight(int height);
   int getScreenSize();
   void setScreenSize(int screenSize);
   int getMaxVolume();
   int getVolume();
   void setVolume(int volume);
   boolean isPower();
   void setPower();
   void getInfo();
   //void setPower(boolean power);
   void turnTelevision();
   void closeTelevision();
   void upVolume(int volume);
   void downVolume(int volume);
}
