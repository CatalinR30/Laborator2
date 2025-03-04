package ro.ulbs.paradigme.lab2;

public class Square extends Form {
    private float side;
    public Square(float side){
        super();
        this.side = 1;
    }
    public Square(String color, float side){
        super(color);
        this.side = side;
    }
    @Override
    public float getArea() {
        return side * side;
    }
    @Override
    public String toString() {
        return super.toString() + "Patrat cu latura" + side;
    }
}
