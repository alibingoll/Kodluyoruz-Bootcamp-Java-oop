package Classes;
import interfaces.ITelevisionDal;

public class TelevisionVal implements ITelevisionDal {

    public boolean volumeCheck(int volume){
        if (volume>100 || volume<0)
        {
            return false;
        }else {
            return true;
        }

    }

}
