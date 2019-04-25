package Game.Logic;

import Utils.Dimension2i;
import Utils.Vec2i;

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

}
