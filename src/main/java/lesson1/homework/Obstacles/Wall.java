package lesson1.homework.Obstacles;

import lesson1.homework.Participant;
import lesson1.homework.Animals.Animal;

public class Wall extends Obstacle {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Participant participant) {
        participant.jump(height);
    }
}