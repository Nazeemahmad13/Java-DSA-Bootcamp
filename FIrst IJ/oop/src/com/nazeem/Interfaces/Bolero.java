package com.nazeem.Interfaces;

import javax.sound.midi.Soundbank;

public class Bolero implements Engine,Brakes,Media {
    @Override
    public void Hydraulic() {
        System.out.println("Does not have Hydraulic Brakes");
    }

    @Override
    public void Drum() {
        System.out.println("Uses Drum Brakes");
    }

    @Override
    public void Disc() {
        System.out.println("Does not have Disc Brakes");
    }

    @Override
    public void start() {
        System.out.println("Engine starts");
    }

    @Override
    public void Stop() {
        System.out.println("Engine Stops");
    }

    @Override
    public void accelerates() {
        System.out.println("Engine accelerates ");
    }

    @Override
    public void play() {
        System.out.println("Infotainment system Plays");
    }

    @Override
    public void pause() {
        System.out.println("Infotainment system pause");
    }

    @Override
    public void radio() {
        System.out.println("Infotainment system supports Radio");
    }

    @Override
    public void bluetooth() {
        System.out.println("Infotainment system don't have bluetooth connectivity");
    }
}
