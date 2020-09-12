import dto.Animal;
import dto.Cat;

public class Lesson2HW2 {
    public static void main(String[] args) {
        Cat cat = Cat.builder()
                .age(5)
                .color("black")
                .sex(true)
                .name("Korjik")
                .build();
        cat.makeSound();
        System.out.println(cat);




    }
}
