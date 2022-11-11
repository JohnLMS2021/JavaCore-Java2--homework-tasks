package lesson1.homework;

import lesson1.homework.Animals.Dog;
import lesson1.homework.Animals.Tiger;
import lesson1.homework.Obstacles.*;


public class Application {

    public static void main(String[] args) {

        Course c = new Course(new Obstacle[]{
                new Cross(5),
                new Wall(3),
                new Water(7)
        });
        Team team = new Team("Дружба",
                new Tiger("Арнольд", 10, 12, 0),
                new Tiger("Леон", 20, 5, 15),
                new Tiger("Рокки", 9, 14, 0),
                new Dog("Шарик", 15, 17, 10),
                new Dog("Донни", 13, 10, 8),
                new Dog("Псих", 5, 20, 14),
                new Robot("Бмв", 50, 50, 50),
                new Robot("Форд", 40, 60, 50),
                new Robot("Ауди", 30, 60, 60)
        );
        team.getTeamInfo();

        c.doIt(team);
        team.showResults();

    }
}
