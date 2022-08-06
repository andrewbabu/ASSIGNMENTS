/*Design a class named Circle containing following attributes and behavior. 
• One double data field named radius. The default value is 1. 
• A no-argument constructor that creates a default circle. 
• A Single argument constructor that creates a Circle with the specified radius. 
• A method named getArea() that returns area of the Circle. 
• A method named getPerimeter() that returns perimeter of it.  
21CE002 - Andrew
*/
import javax.sound.sampled.SourceDataLine;

class Circle{
    private double radius;
    public Circle(){
        this.radius = 1;
    }
    public Circle(double r){
        this.radius = r;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
    public double getPerimeter(){
        return 2*3.14*radius;
    }
}
public class q1 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(10);
        System.out.println(c1.getArea());
        System.out.println(c2.getPerimeter()); 
    }
    
}
