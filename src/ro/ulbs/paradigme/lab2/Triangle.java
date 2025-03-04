package ro.ulbs.paradigme.lab2;

public class Triangle extends Form {
    private float base, height;
    public Triangle(float base, float height, String red) {
        super();
        this.base = 1;
        this.height = 1;
    }
    public Triangle(String color, float base, float height) {
        super(color);
        this.base = base;
        this.height = height;
    }
    @Override
    public float getArea() {
        return (base * height) / 2;
    }
    @Override
    public String toString() {
        return super.toString() + "Triunghi cu baza" + base;
    }
public boolean equals(Object obj){
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Triangle triangle = (Triangle) obj;
    return Float.compare(triangle.height, height) == 0 && Float.compare(triangle.base, base) == 0;
}
}

