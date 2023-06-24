public class MyFood {
    public static void main(String[] args) {
        Food biriyani= new Biriyani();
        biriyani.cookFood();
        Food khicuri= new Khicuri();
        khicuri.cookFood();

    }


}

abstract  class Food{
    abstract void cookFood();
}

class Biriyani extends Food{
    @Override
    void cookFood() {
        System.out.println("biriyani is cooking");
    }
}
class Khicuri extends Food{
    @Override
    void cookFood() {
        System.out.println("Khicuri is cooking");
    }
}
