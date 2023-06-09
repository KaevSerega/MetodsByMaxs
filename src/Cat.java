public class Cat extends Animal {
    public Cat(String name, int age,int weight) {
        super(name, age,weight);
    }

    public void meow() {
        if(weight <5){
            System.out.println("Meow");
        }
        else if(weight>5){
            System.out.println("Ебать я здоровая кошка");
        }

    }
}
