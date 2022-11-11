package lesson1.homework.Obstacles;

import lesson1.homework.Participant;
import lesson1.homework.Team;

public class Course {
    private Obstacle obstacles[];

    public Course(Obstacle ... obstacles) {
        this.obstacles = obstacles;
    }
    public void doIt(Team team){
        for (Obstacle obstacle : obstacles) {
            team.doIt(obstacle);
            //obstacle.doIt(team);
        }
    }
}
