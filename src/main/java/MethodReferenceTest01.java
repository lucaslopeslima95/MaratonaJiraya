import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {


    public static void main(String[] args) {
       List<Anime> animeList = new ArrayList<>(List.of(new Anime("Bersek",32),new Anime("Dragon Ball",50000),new Anime("Zorro",1000)));
        Collections.sort(animeList,AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}
