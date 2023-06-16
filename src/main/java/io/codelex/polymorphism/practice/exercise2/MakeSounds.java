package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {

        //am i missing something? is it supposed to be this simple?
        Sound firework = new Firework(), parrot = new Parrot(), radio = new Radio();
        List<Sound> sounds = new ArrayList<>(List.of(firework, parrot, radio));
        for (int i = 0; i < 4; i++) {
            sounds.forEach(Sound::playSound);
        }

    }
}
