public class MyInheritance {
    public static void main(String[] args) {
Bird bird=new mithu();
        bird.canFly();
        bird.canTalk();
    }
}

class Bird{
   public void canFly(){
       System.out.println("My bird can fly");
   }

    public void canTalk(){
        System.out.println("My bird can talk");
    }


}
class parrot extends Bird{
    public void canTalk(){
        System.out.println("parrot can talk");
    }


    }

class mithu extends parrot {
    public void canTalk(){
        System.out.println("mithu can talk");
    }
}

