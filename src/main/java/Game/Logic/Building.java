package Game.Logic;

import Game.Utils.Dimension2i;
import Game.Utils.Vec2i;

import java.util.Objects;

public class Building {

    Vec2i loc;
    Dimension2i dim;
    //location is in format:         (x, y) -coordinates of bottom left corner and
    // h, w  is it dimensions in this way
    //                               ^
    //                             h |
    //                               0--->
    //                                 w

    public Building(Vec2i loc, Dimension2i dim) {
        this.loc = loc;
        this.dim = dim;
    }

    public Building(int x, int y, int h, int w) {
        loc = new Vec2i(x, y);
        dim = new Dimension2i(h, w);
    }

    //true if building stands on block (x, y)
    private boolean hasCollision(int x, int y) {
        if (x >= loc.getX() && x < loc.getX() + dim.getW() &&
                y >= loc.getY() && y < loc.getY() + dim.getH())
            return true;
        else
            return false;

    }

    public boolean hasCollision(Building b) {
        if (hasCollision(b.loc.getX(), b.loc.getY()) || b.hasCollision(loc.getX(), loc.getY()))
            return true;
        else
            return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return loc.equals(building.loc) &&
                dim.equals(building.dim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loc, dim);
    }
}
