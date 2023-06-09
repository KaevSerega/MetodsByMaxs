public class Animal {
    protected String name;
    protected int age;
    protected int weight;

    public Animal(String name,int age,int weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
    public void speak(){
        System.out.println("Я животное, какое нафиг говорить то!!!");
    }
}

