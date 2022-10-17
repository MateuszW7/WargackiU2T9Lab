public class CircleRunner {
    public static void main(String[] args){
        Circle cir1 = new Circle(7.0);
        System.out.println(cir1.getInfo());
        cir1.setRadius(9.6);
        cir1.setRadius(4.8);
        System.out.println(cir1.getInfo());
    }
}
