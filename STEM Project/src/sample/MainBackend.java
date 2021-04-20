package sample;

import java.util.Random;

public class MainBackend implements MainBackendInterface{

    public int Descion;
    public String highScore;

    MainBackend(){
        Descion = 0;
        highScore = "new high score";
    }


    @Override
    public void WakeUpButton1() {

    }


    public void RandomEvent1A() {
        Random randomNum = new Random();
        WakeUpController WakeUpBackend = new WakeUpController();

        int RN = randomNum.nextInt(3)+1;

        if (RN == 1){
            highScore = ("You get to work but you are messy and your boss says this is your last chance");
        }
        else if (RN == 2){
            highScore = ("Your boss is mad at you for being late, but doesn't fire you.");
        }
        else if (RN == 3){
            highScore = ("Your boss is mad your late and he says this is your last chance.");
        }

    }

    public void RandomEvent2A() {
        Random randomNum = new Random();
        WorkSceneController workBackend = new WorkSceneController();

        int RN = randomNum.nextInt(3)+1;

        if (RN == 1){
            highScore = ("You get overworked, and work yourself to death. You end up being to tired to go to work and submit your final project. You did manage to turn it in though.");
        }
        else if (RN == 2){
            highScore = ("You get a lot of work done on it, and overall a very well done project. With the breaks between, you feel energetic enough to present it very well.");
        }
        else if (RN == 3){
            highScore = ("It ends up being very terrible Your boss is disappointed");
        }
    }

    public void RandomEvent3A() {
        Random randomNum = new Random();
        WorkSceneController workBackend = new WorkSceneController();

        int RN = randomNum.nextInt(3)+1;

        if (RN == 1){
            highScore = ("You fired him, and you kind of feel bad but nothing changes.");
        }
        else if (RN == 2){
            highScore = ("He does better from that point on, and you're proud of him");
        }
        else if (RN == 3){
            highScore = ("He continues to be late, and hurts the company's reputation.");
        }
    }

    public void RandomEvent4B() {
        Random randomNum = new Random();
        WorkSceneController workBackend = new WorkSceneController();

        int RN = randomNum.nextInt(2)+1;

        if (RN == 1){
            highScore = ("You feel super sick.");
        }
        else if (RN == 2){
            highScore = ("You're bummed out, but it's okay.");
        }

    }

    public void incermentdecion(int Decion) {
        Descion = Descion + Decion;
    }

    public int getDescion() {
        return Descion;
    }

    public void setHighScore(String highScore) {
        this.highScore = highScore;
    }

    public String getHighScore() {
        return highScore;
    }


}
