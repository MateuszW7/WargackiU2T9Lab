public class RightTriangleRunner {
    public static void main(String[] args){
        RightTriangle tri1 = new RightTriangle(9,12);
        RightTriangle tri2 = new RightTriangle(3.0/5,4.0/5);
        double tri1hyp = tri1.Hypotenuse();
        double tri2hyp = tri2.Hypotenuse();
        System.out.println(tri1hyp);
        System.out.println(tri2hyp);
    }
}
