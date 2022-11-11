package lesson1.homework.Animals;

import lesson1.homework.Animals.Animal;

public class Tiger extends Animal {

    public Tiger(String name, int maxRunDistance,
               int maxJumpHeight, int maxSwimDistance) {
        super(name, maxRunDistance, maxJumpHeight, maxSwimDistance);
    }

    @Override
    public void voice() {
        System.out.println("Ррр");
    }
}