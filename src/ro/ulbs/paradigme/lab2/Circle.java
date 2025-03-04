package ro.ulbs.paradigme.lab2;

public class Circle extends Form {
    private float radius;
    public Circle(float radius) {
        super();
        this.radius = 1;
    }
    public Circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }
    @Override
    public float getArea() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }
    @Override
    public String toString() {
        return super.toString() + "Cercul cu raza" + radius;
    }

}
