package Game.Utils;

import java.util.Objects;

public class Dimension2i {

    int h,w;

    public Dimension2i(int h, int w) {
        this.h = h;
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public int getW() {
        return w;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setW(int w) {
        this.w = w;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dimension2i that = (Dimension2i) o;
        return h == that.h &&
                w == that.w;
    }

    @Override
    public int hashCode() {
        return Objects.hash(h, w);
    }
}
