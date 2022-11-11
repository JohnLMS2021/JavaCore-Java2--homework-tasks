package lesson1.homework;

import lesson1.homework.Animals.Animal;
import lesson1.homework.Animals.Tiger;
import lesson1.homework.Animals.Dog;
import lesson1.homework.Obstacles.Obstacle;

public class Team {
    private String name;// название команды
    private Participant participants[] ;    // участники

    public Team(String name) {
        this.name = name;
    }

    public Team(String name,Participant ... participantsGiven ) {
        this.name = name;
        this.participants = participantsGiven;
    }

    public void getTeamInfo() {
        System.out.println("Команда: " + this.name );
        for (Participant participant : participants) {
            if (participant instanceof Dog) {
                System.out.println("Собака " + participant.getName());
            }
            if (participant instanceof Tiger) {
                System.out.println("Тигр " + participant.getName());
            }
            if (participant instanceof Robot) {
                System.out.println("Робот " + participant.getName());
            }
        }
    }

    public void showResults(){
        for (Participant participant : participants) {
            //obstacle.doIt(participant);
            if (!participant.isOnDistance()) {
                break;
            }
        }
    }
    public void doIt(Obstacle obstacle){
        for (Participant participant : participants) {
            obstacle.doIt(participant);
            /*if (!participant.isOnDistance()) {
                break;
            }*/
        }
    }



}