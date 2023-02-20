
class Animal{
    private String name;

    Animal(String name){
        this.name = name;
    }

    public void Say(){
        System.out.println("Animal Say");
    }
}

class Dog extends Animal{
    Dog(){
        super("dog");
    }
    public void Say(){
        System.out.println("Dog Say");
    }
}

abstract class Man{
    
    int GetData(){
        return 0;
    }
    
    public abstract void Say();
}

class Woman extends Man{
    public void Say(){
        System.out.println("Woman Say");
    }
}



public class MulState {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.Say();
        Man m = new Woman();
        m.Say();
        m.GetData();
    }

}
