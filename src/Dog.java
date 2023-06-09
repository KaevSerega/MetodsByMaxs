public class Dog extends Animal {
    public Dog(String name, int age, int weight) {
        super(name, age, weight);
    }

    public void bark() {
        if (weight > 10 ) {
            System.out.println("Wooooooooof!!!");
        }else if (weight<10){
            System.out.println("Wooof");
        }else{
            System.out.println("Что я такое");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}