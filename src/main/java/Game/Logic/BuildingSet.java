package Game.Logic;

import java.util.Set;

public class BuildingSet {
    //maybe need some constructors
    //getters and setters
    private Set<Building> buildings;

    public boolean containsBuilding(Building b) {
        return buildings.contains(b);
    }

    //checks that new building have no collisions with already existing
    //(*)this is not sufficient condition. For example trees and other objects are not
    //stored here.
    public boolean canPlace(Building b) {
        return buildings.stream().allMatch(building -> building != b && !building.hasCollision(b));
    }

    //place the building if it is possible
    //see (*) above canPlace method
    public boolean place(Building b) {
        if (canPlace(b)) {
            buildings.add(b);
            return true;
        } else {
            return false;
        }
    }

}
