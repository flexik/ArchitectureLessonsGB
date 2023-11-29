package Task4;

public class Rectangle extends Shape{

    private int width;
    private int height;

    @Override
    public int area() {
        return this.width * this.height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
}
