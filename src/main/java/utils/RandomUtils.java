package utils;

import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {

    //Todo Рандомное время для клика по хомяку
    public static int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}