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
            highScore = ("good");
        }
        else if (RN == 2){
            highScore = ("meh");
        }
        else if (RN == 3){
            highScore = ("bad");
        }

    }

    public void RandomEvent2A() {
        Random randomNum = new Random();
        WorkSceneController workBackend = new WorkSceneController();

        int RN = randomNum.nextInt(3)+1;

        if (RN == 1){
            highScore = ("good");
        }
        else if (RN == 2){
            highScore = ("meh");
        }
        else if (RN == 3){
            highScore = ("bad");
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

    public void score(){

        if (getDescion() <= 20){
            setHighScore("NEW HIGH SCORE");
        }
    }
}
