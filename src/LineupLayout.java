import java.util.ArrayList;

public class LineupLayout implements Droppable{
    private ArrayList<Person> teamLineup;
    private TeamsLayout teamLayout;

    public LineupLayout(TeamsLayout teamLayout) {
        this.teamLayout = teamLayout;
    }

    /*
    Pseudocode:
    for each batsman in teamlayout
    - call populateBatsman
    for each all rounder in teamlayout
    - call populateAllRounder
    for each bowler in teamlayout
    - call populateBowler

    populateBatsman:
    - Create a hashset for 3 different Rarities : offerRarities()
    - for each rarity:
        First Rarity:
        - select 1 wicket keeper of associated rarity from pool (selectKeeper(Rarity, Pool))
        - remove selected player from pool (removeFromPool(Player, Pool))
        Second to 3rd Rarity:
        - select 1 batsman of associated rarity selectBatsman(Rarity, Pool))
        - remove selected player from pool (removeFromPool(Player, Pool))
     */

    @Override
    public void drop() {

    }
}
