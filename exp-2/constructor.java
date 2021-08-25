class Circle{
    Circle(double radius){
        this.radius=radius;
    }
    double radius;

    double getArea(){
        return 3.14*this.radius*this.radius;
    }
}

class Main{
    public static void main(String [] arg){
        Circle obj = new Circle(4);
        System.out.println("Radius of Circle is " + obj.getArea());
    }
}