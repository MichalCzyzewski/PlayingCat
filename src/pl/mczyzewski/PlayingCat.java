package pl.mczyzewski;

public class PlayingCat
{

    public static boolean isCatPlaying(boolean summer, int temperature)
    {
        if((summer == true) && ( temperature >= 25 && temperature <= 45))
        {
            return true;
        }
        if((summer == false)&& ( temperature >= 25 && temperature <= 35))
        {
            return true;
        }return false;
    }

}
