public interface MyInterface {


    void drawshape();

}

class Rectangle implements MyInterface{

    public void drawshape() {
        System.out.println("rectangle is creative");

    }
}
class Circle implements MyInterface{

    public void drawshape() {
        System.out.println("Circle is creative");

    }
}
class MyTestClass{
    public static void main(String[] args) {

        Rectangle rectangle=new Rectangle();
        rectangle.drawshape();

    }
}