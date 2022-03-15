import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceTest01 {


    public static void main(String[] args) {
        //ordena por numerio
       List<Anime> animeList = new ArrayList<>(List.of(new Anime("Bersek",32),new Anime("Dragon Ball",50000),new Anime("Zorro",1000)));
        Collections.sort(animeList,AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
        //ordena por ordem alfabetica com metodo nao estatico
        AnimeComparators animeComparators = new AnimeComparators();
        animeList.sort(animeComparators::compareByTitleNonStatic);
        System.out.println(animeList);

        ArrayList<String> list2 = new ArrayList<>(List.of("Zoilton","Zyekarosviky","Astrogildo","Perestroico","Sanderson"));
        list2.sort(String::compareTo);
        System.out.println(list2);
        //converte string em int
        Function<String,Integer> numStringToInteger = Integer::parseInt;
        System.out.println(numStringToInteger.apply("10"));
        //Busca por um item na lista
        BiPredicate<List<String>,String>checkName = List::contains;
        System.out.println(checkName.test(list2,"Zoilton"));


    }
}
