package lt.test.webtest;

class Square extends Shape{
    private int side;

    public Square() {
    }

    public Square(String name, String color, int side) {
        super(name, color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side){
        this.side = side;
    }

    @Override
    public void getArea(){
        System.out.println("Area of " + this.getName() + " is " + this.side * this.side);
    }
}
