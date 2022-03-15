import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferences02 {

    public static void main(String[] args) {
        //Suplier clase
        Supplier<AnimeComparators> newAnimeComparators =  AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();

        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Zorro", 32), new Anime("Dragon Ball", 50000), new Anime("Bersek", 1000)));
        animeList.sort(animeComparators::compareByTitleNonStatic);
        System.out.println(animeList);

        BiFunction<String,Integer,Anime> animeBiFunction = (title,episodes) -> new Anime(title,episodes);
        System.out.println(animeBiFunction.apply("A caverna do dragão",36));
    }
}
