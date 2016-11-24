package chapter10;

/**
 * Created by God of Chris on 2016/11/22 0022.
 */
public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getRadius(){
        return radius;
    }

    public Circle2D(){
        this.radius=1;
    }

    public Circle2D(double x,double y,double radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    public boolean contains(double x,double y){
        double distance=Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
        if(distance<=radius)
            return true;
        else
            return false;
    }

    public boolean contains(Circle2D circle){
        double distance=Math.sqrt((circle.getX()-x)*(circle.getX()-x)+(circle.getY()-y)*(circle.getY()-y));
        if(distance+circle.getRadius()<this.radius)
            return true;
        return false;
    }

    public boolean overlaps(Circle2D circle){
        double distance=Math.sqrt((circle.getX()-x)*(circle.getX()-x)+(circle.getY()-y)*(circle.getY()-y));

        if((distance-circle.getRadius())<this.radius&&(distance+circle.getRadius())>this.radius)

            return true;

        return false;
    }
}
