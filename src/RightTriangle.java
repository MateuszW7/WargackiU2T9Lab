public class RightTriangle {
    //instance variables
    private double base, height;

    //constructor
    public RightTriangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    //method that calculates hypotenuse using pythagorean theorem
    public double Hypotenuse(){
        return Math.sqrt(Math.pow(base,2)+Math.pow(height,2));
    }

}
