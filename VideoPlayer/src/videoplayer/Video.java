package videoplayer;

/**
 *
 * @author Mahmoud
 */
public class Video implements Comparable<Object>{
    public String VidName,Path,Action,PlayerName,Team1,Team2;
    public Video(String VN,String PT,String AC,String PL,String T1,String T2)
    {
        VidName = VN; Path = PT; Action = AC; PlayerName = PL; Team1 = T1; Team2 = T2;
    }

    @Override
    public int compareTo(Object o) {
        Video vid = (Video) o;
        return (this.VidName.compareTo(vid.VidName));
    }
}


