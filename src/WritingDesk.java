
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Getter
@Setter
public class WritingDesk {
    private int numberOfDrawers;
    private boolean hasKeyboardTray;
    private int maxWeightCapacity;
    private int currentHeight;
    private int maxHeight;

    public void adjustHeight(int centimeters) {
        int newHeight = currentHeight + centimeters;
        if (newHeight <= maxHeight) {
            currentHeight = newHeight;
            System.out.println("Desk height adjusted to " + currentHeight + " cm.");
        } else {
            System.out.println("Cannot adjust desk height beyond maximum height of " + maxHeight + " cm.");
        }
    }


    public void moveDown(int centimeters) {
        int newHeight = currentHeight - centimeters;
        if (newHeight >= 0) {
            currentHeight = newHeight;
            System.out.println("Desk height adjusted to " + currentHeight + " cm.");
        } else {
            System.out.println("Cannot move desk lower than ground level.");
        }
    }

}


