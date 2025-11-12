import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class AppState {
    private static final AppState instance = new AppState();
    public static AppState getInstance() { //fetch current instance
        return instance;
    }
    private final ObservableList<HorrorCharacter> characters = FXCollections.observableArrayList(); //my list of character objects
    //best for the ListView javafx stuff
    private HorrorCharacter currCharacter; //current character that can be edited or removed
    private AppState(){
        //fake "Read" data or just default data
        characters.addAll(
                new Zombie("Bob", 200, new Vulnerability[]{
                        Vulnerability.BLUNT_DAMAGE,
                        Vulnerability.BULLET
                }),
                new Werewolf("Dave", 300, new Vulnerability[]{
                        Vulnerability.WOLFSBANE
                }, true),
                new Vampire("Eric", 400, new Vulnerability[]{
                        Vulnerability.SUNLIGHT
                }, false)
        );
    }

    //getters and setters so my primary controllers can get or set data
    public ObservableList<HorrorCharacter> getCharacters(){
        return characters;
    }

    public HorrorCharacter getCurrCharacter(){
        return currCharacter;
    }

    public void setCurrCharacter(HorrorCharacter currCharacter){
        this.currCharacter = currCharacter;
    }
}
