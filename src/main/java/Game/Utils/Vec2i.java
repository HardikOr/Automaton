package Game.Utils;

import java.util.Objects;

public class Vec2i {

    int x,y;

    public Vec2i(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vec2i vec2i = (Vec2i) o;
        return x == vec2i.x &&
                y == vec2i.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
