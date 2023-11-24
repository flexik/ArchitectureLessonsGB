package Fabrics;

import java.util.Random;

import Interfaces.iGameItem;

public abstract class ItemGenerator {   // фабричный метод генерации награды
    public abstract iGameItem createItem();
    
    public void openReward(){
        createItem().open();
    }

    public static ItemGenerator getRandomItem(){
        Random random = new Random();
        int randomNumber = random.nextInt(54);

        if(randomNumber < 10){
            return new RubyGenerator();
        }
        if (randomNumber < 20) {
            return new EmeraldGenerator();
        }
        if (randomNumber < 30) {
            return new SilverGenerator();
        }
        if (randomNumber < 40) {
            return new SapphireGenerator();
        }
        if (randomNumber < 50) {
            return new TopazGenerator();
        }
        if (randomNumber < 53) {
            return new GoldGenerator();
        }
        return new GemGenerator();
    }
}
