package lesson1.homework;

public interface Participant {
    String getName();
    boolean isOnDistance();
    void run(int distance);
    void jump(int height);
    void swim(int distance);
}
