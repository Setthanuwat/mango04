public class Main {
    public static void main(String[] args) {

        Interval r1 = new BoundaryInterval(4, 7);
        Interval r2 = new ArrayInterval(new int[]{2, 5});
        Interval r3 = r1.intersect(r2);
        Interval r4 = r2.intersect(r1);

        System.out.print(r3.getSmallestElement()+" "+ r3.getLargestElement()+"\n");
        System.out.print(r4.getSmallestElement()+" "+r4.getLargestElement());
    }
}
