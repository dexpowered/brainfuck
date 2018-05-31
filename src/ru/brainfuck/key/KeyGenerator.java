package ru.brainfuck.key;

import java.util.Random;

/**
 * @author : smile10
 * @about: Генератор ключей для пользователей.
 */
public class KeyGenerator {

    public static String keyInfo(int keys, int to) {
        String key = "";
        Random r = new Random();
        int chars = keys + r.nextInt(to - keys + 1);
        for (int i = 0; i < chars; ++i) {
            char next = 0;
            int range = 10;

            switch(r.nextInt(3)) {
                case 0: {next = '0'; range = 10;} break;
                case 1: {next = 'a'; range = 26;} break;
                case 2: {next = 'A'; range = 26;} break;
                case 3: {next = '!'; range = 26;} break;
                case 4: {next = '.'; range = 26;} break;
            }

            key += (char)((r.nextInt(range)) + next);
        }
        return key;
    }

    public static void genKey() {
        String key = keyInfo(100,150);
        System.out.println(key);
    }
}
