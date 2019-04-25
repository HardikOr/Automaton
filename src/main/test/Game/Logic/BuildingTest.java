package Game.Logic;

import Game.Logic.Building;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildingTest {

    @Test
    void hasCollision() {
        Building a = new Building(1, 1, 2, 2);
        Building b = new Building(3, 3, 2, 2);
        Building c = new Building(2,2 ,2,2);

        assertFalse(a.hasCollision(b) || b.hasCollision(a));
        assertTrue(a.hasCollision(c) && c.hasCollision(a));
    }
}