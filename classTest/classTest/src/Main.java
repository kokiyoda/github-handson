import java.lang.reflect.Type;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pokemon pokemon1 = new Pokemon("Pikachu","Electric","");
        Pokemon pokemon2 = new Pokemon("Venusaur","Grass","Poison");
        System.out.println(pokemon1.getName());
        System.out.println(pokemon1.getType1() + " " +pokemon1.getType2());
        System.out.println(pokemon2.getName());
        System.out.println(pokemon2.getType1() + " " +pokemon2.getType2());
        System.out.println("\r\n");


        //for文
        List<Pokemon> pokemonList = List.of(new Pokemon("Pikachu","Electric",""),
                                           (new Pokemon("Venusaur","Grass","Poison")),
                                           (new Pokemon("Charizard","Fire","Frying")),
                                           (new Pokemon("Blastoise","Water","")),
                                           (new Pokemon("Lapras","Water","Ice")),
                                           (new Pokemon("Snorlax","Normal","")));


        for (Pokemon pokemon :pokemonList) {
            System.out.println("Name-" + pokemon.getName());
            System.out.println(" Type-" + pokemon.getType1() + " " +pokemon.getType2());
        }
        System.out.println("\r\n");


        //if文とfor文
        for (Pokemon pokemon : pokemonList) {
            if (pokemon.getType2().equals("")){
                System.out.println(pokemon.getName() + " is a single " + pokemon.getType1() + " type");
            }else {
                System.out.println(pokemon.getName() + " is a composite type of " + pokemon.getType1() + pokemon.getType2());
            }
        }
    }
}