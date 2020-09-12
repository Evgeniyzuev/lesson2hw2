package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Cat extends Animal{
    private final String name;
    public String color;
    @ToString.Exclude
    public Integer age;
    @ToString.Exclude
    public boolean sex;

    public void makeSound(){
        for (int i = 0; i < age ; i++) {
            if (sex)  System.out.print("Mau ");
            else System.out.println("mew");

        }
        System.out.println();
    }

}
