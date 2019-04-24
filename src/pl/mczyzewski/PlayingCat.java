package pl.mczyzewski;

public class PlayingCat
{

    public static boolean isCatPlaying(boolean summer,int temperature)
    {
        if(!summer)
        {
            return false;
        }if(temperature >=25 || temperature <= 35)
    {
        return true;
    }return false;
    }

}
