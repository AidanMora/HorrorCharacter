import java.util.Arrays;
import java.util.List;


/**
 * Date: 9/22/25
 * Main to show how I used polymorphism, inheritance, and the interface
 * Organized to show both separately
 * @author Aidan Mora
 */

public class HorrorCharacterApp {
    /**
     * Main character app which shows the functionality of the different questions
     * about polymorphism and inheritance
     * @param args name, health, vulnerabilities
     */
    public static void main(String[] args) {
        System.out.println("<--Transforming Features: Vampire / Werewolf-->\n");
        List<Transformable> canTransform = Arrays.asList(
                new Vampire("Brian", 100, null),
                new Werewolf("Garry", 100, null));

        for (Transformable t : canTransform){
            t.transform(); // loops through the vampire and werewolf transform features
        }

        System.out.println("------------------------------------------ \n");

        System.out.println("<--Attack() / Flee() Features: All 3 Characters-->\n");
        List<HorrorCharacter> horrorCharacters = Arrays.asList(
                new Zombie("Steve", 40, null),
                new Vampire("Brian", 100, null),
                new Werewolf("Garry", 100, null));

        for (HorrorCharacter hc : horrorCharacters){
            hc.attack(); // loops through horror characters to show each of there attack and flee features
            hc.flee();
        }

    }
}
