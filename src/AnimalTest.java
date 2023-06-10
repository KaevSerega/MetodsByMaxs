import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimalTest {
    public static void main(String[] args) throws IOException {
        File file =new File("test.txt");
        if(!file.exists()){
            file.createNewFile();
        }

        Dog dog1 = new Dog("Песик", 43, 43);
        System.out.println("Это имя " + dog1.name);
        System.out.println("Это возраст " + dog1.age);
        dog1.bark();
        dog1.speak();
        Cat cat = new Cat("Мурзик", 3, 23);
        System.out.println("Это имя " + cat.name);
        System.out.println("Это возраст " + cat.age);
        cat.meow();
        cat.speak();
        ArrayList<Dog> dogs = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Scanner str = new Scanner(System.in);
            String name = str.next();
            int age = str.nextInt();
            int weight = str.nextInt();
            Dog dog2 = new Dog(name, age, weight);
            dogs.add(dog2);
            dogs.get(dogs.size() - 1).bark();
            dogs.get(dogs.size() - 1).weight = dog2.weight;
            dogs.get(dogs.size() - 1).name = dog2.name;
            dogs.get(dogs.size() - 1).age = dog2.age;
            System.out.println(dogs.get(dogs.size() - 1).name+" Это имя");
            System.out.println(dogs.get(dogs.size() - 1).age+" Это возраст");
            System.out.println(dogs.get(dogs.size() - 1).weight+" Это вес");

        }
        int x =1;
        for (Dog dog:dogs
             ) {

            System.out.println(x+" "+dog.name+" "+dog.age+" "+dog.weight);
            x++;
        }
        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter("test.txt",true));
            for (Dog dog : dogs) {
                writer.write(dog.name+" ");
                writer.write(String.valueOf(dog.age+" "));
                writer.write(String.valueOf(dog.weight));
                writer.newLine(); // добавляем перевод строки между элементами
            }
            writer.close();
            System.out.println("Содержимое ArrayList записано в файл test.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
