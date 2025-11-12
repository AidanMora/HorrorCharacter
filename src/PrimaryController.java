import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.util.StringConverter;

public class PrimaryController {
    @FXML private ListView<HorrorCharacter> listView;
    //inject any info into this variable

    //my default data / list
    private final ObservableList<HorrorCharacter> characters = FXCollections.observableArrayList(
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
    @FXML
    private void initialize() {
        listView.setItems(characters); //auto initialize the ObservableList to ListView (binds)
        listView.setEditable(true); //inline editable in listView

        //the formatting for each field
        //need to transform object into string so it can be displayed
        listView.setCellFactory(TextFieldListCell.forListView(
                new StringConverter<HorrorCharacter>() {
                    @Override
                    public String toString(HorrorCharacter horrorCharacter) { //convert obj to str
                        if (horrorCharacter == null) return "its null";
                        return horrorCharacter.name + " [" + horrorCharacter.health + "]";
                    }
                    @Override //str to obj [NOT IMPLEMENTED]
                    public HorrorCharacter fromString(String string) {
                        return null;
                    }
                }
        ));
    }
}
