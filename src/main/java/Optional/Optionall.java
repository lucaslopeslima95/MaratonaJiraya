package Optional;

import java.util.List;
import java.util.Optional;

public class Optionall {
    public static void main(String[] args) {
        //Tenta Evitar NullPointer Introduzida No java 8
        Optional<String> a1 = Optional.ofNullable(findName("Mauricio"));
        String empty = a1.orElse("EMPTY");
        System.out.println(empty);

    }
    private static String findName(String name){
        List<String> listNome = List.of("Marcio", "Mauricio", "Adalberto");
        int i = listNome.indexOf(name);
        if (i!=0){
            return listNome.get(i);
        }
        return null;
    }
}
