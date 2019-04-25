package Game.Logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildingSetTest {

    @Test
    void canPlace() {
        Building a = new Building(1, 1, 2, 2);
        Building b = new Building(3, 3, 2, 2);
        Building c = new Building(2,2 ,2,2);

        BuildingSet bs = new BuildingSet();
        bs.place(a);
        assertTrue(bs.place(b));
        assertFalse(bs.place(c));
    }
}