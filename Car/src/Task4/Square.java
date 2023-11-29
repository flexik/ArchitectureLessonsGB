package Task4;

public class Square extends Shape{

    private int side;

    @Override
    public int area() {
        return this.side * this.side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    
}
