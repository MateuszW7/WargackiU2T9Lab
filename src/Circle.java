public class Circle {
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    /* Returns the area of the circle with given radius
       Area of a circle = pi * r ^ 2
     */
    public double area()
    {return Math.pow(radius,2)*Math.PI;}


    /* Returns the circumference of the circle with given radius
       Circumference of a circle = pi * 2 * r
     */
    public double circumference()
    {return radius * 2 * Math.PI;}


    /* Setter method to update the radius of the circle to newRadius
     */
    public void setRadius(double newRadius)
    {radius = newRadius;}


    /* Returns a String that includes info about the circle,
       including its radius, area, and circumference on separate lines;
     */
    public String getInfo()
    {return "Circle Stats:\nRadius: " + radius + "\nArea: " + area() + "\nCircumference: " + circumference();}
}
