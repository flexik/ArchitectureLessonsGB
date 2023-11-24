import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Fabrics.*;
import Interfaces.iGameItem;
import Products.ItemReward;

public class App {
    public static void main(String[] args) throws Exception {

        // List<ItemGenerator> generators = new ArrayList<>();

        // generators.add(new GoldGenerator());
        // generators.add(new GemGenerator());

        // Random random = ThreadLocalRandom.current();
        // for (int i = 0; i < 10; i++) {
        //     int index = random.nextInt(1);
        //     generators.get(index).openReward();
        // }

        List<ItemGenerator> rewards = new ArrayList<>();

        //Добавляем награды с указанным соотношением 10:10:10:10:10:10:3:1
        for (int i = 0; i < 10; i++) {
            rewards.add(new EmeraldGenerator());
            rewards.add(new RubyGenerator());
            rewards.add(new SapphireGenerator());
            rewards.add(new SilverGenerator());
            rewards.add(new TopazGenerator());
        }
        for (int i = 0; i < 3; i++) {
            rewards.add(new GoldGenerator());
        }
        rewards.add(new GemGenerator());

        // Перемешиваем список наград
        Collections.shuffle(rewards); 

        // Выводим награды на экран
        for (ItemGenerator reward:rewards){
            reward.openReward();
        }
    }
}
