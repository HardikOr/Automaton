package Game.Logic;

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
    public boolean hasCollision(int x, int y) {
        if (x >= loc.x && x < loc.x + dim.w &&
                y >= loc.y && y < loc.y + dim.h)
            return true;
        else
            return false;

    }

    public boolean hasCollision(Building b) {
        if (hasCollision(b.loc.x, b.loc.y) || b.hasCollision(loc.x, loc.y))
            return true;
        else
            return false;
    }

}
