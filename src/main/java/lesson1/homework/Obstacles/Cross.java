package lesson1.homework.Obstacles;

import lesson1.homework.Participant;
import lesson1.homework.Animals.Animal;

public class Cross extends Obstacle {

    private int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant animal) {
        animal.run(length);
    }
}
