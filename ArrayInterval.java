import static java.lang.Math.max;
import static java.lang.Math.min;

public class ArrayInterval implements Interval {
    private int[] boundary;

    public ArrayInterval (int[] boundary) {
        this.boundary = new int[]{boundary[0], boundary[1]};
    }

    public int getSmallestElement()
    {
        return boundary[0];
    }
    public int getLargestElement()
    {
        return boundary[1];
    }

    public Interval intersect(Interval r) {
        int x = max(boundary[0], r.getSmallestElement());
        int y = min(boundary[1], r.getLargestElement());
        if (x <= y) return new ArrayInterval(new int[]{max(boundary[0], r.getSmallestElement()), min(boundary[1], r.getLargestElement())});
        else return new ArrayInterval(new int[]{0, 0});
    }
}
