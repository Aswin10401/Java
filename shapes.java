package week2;

public class shapes {
    private double radius;
    private double length;
    private double width;
    private double base;
    private double height;  



    public class circle {
    

    public circle(double radius){
        this.radius = radius;
    }

    public double getradius(){
        return radius;
    }

    public void setradius(double radius) {
        this.radius = radius;
    }

}


    public class rectangle {
    

    public rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    public double getlength(){
        return length;
    }

    public double getwidth(){
        return width;
    }

    public void setlength(double length){
        this.length = length;
    }

    public void setwidth(double width){
        this.width = width;
    }

}

    public class triangle{

    public triangle(double base,double height){
        this.base = base;
        this.height = height;
    }   

    public double getbase(){
        return base;
    }

    public double getheight(){
        return height;
    }

    public void setbase(double base){
        this.base = base;
    }

    public void setheight(double height){
        this.height = height;
    }

}

public static void main (String[] args){
    circle c = new circle(5);
    rectangle r = new rectangle(5,10);
    triangle t = new triangle(5,10);

    System.out.println("Circle radius: " + c.getradius());
    System.out.println("Rectangle length: " + r.getlength());
    System.out.println("Rectangle width: " + r.getwidth());
    System.out.println("Triangle base: " + t.getbase());
    System.out.println("Triangle height: " + t.getheight());
}
}