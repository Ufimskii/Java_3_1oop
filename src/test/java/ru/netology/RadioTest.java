package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    //Тесты установки станции
//    @Test
//    public void shouldCurrentStation15() {
//        Radio radio = new Radio();
//        radio.setMaxStation(9);
//        radio.setMinStation(0);
//        radio.setCurrentStation(15);
//        assertEquals(15, 15);
//
//    }
//    @Test
//    public void shouldCurrentStationMinus2() {
//        Radio radio = new Radio();
//        radio.setMaxStation(9);
//        radio.setMinStation(0);
//        radio.setCurrentStation(-2);
//        assertEquals(-2, -2);

//    }

    @Test
    public void shouldUpCurrentStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(7);
        assertEquals(8, radio.upStation());

    }

    @Test
    public void shouldDownCurrentStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(7);
        assertEquals(6, radio.downStation());

    }

    @Test
    public void shouldUpMaxStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(9);
        assertEquals(0, radio.upStation());

    }

    @Test
    public void shouldDownMinStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(0);
        assertEquals(9, radio.downStation());

    }

    //Тесты смены громкости
    @Test
    public void shouldUpCurrentValume() {
        Radio radio = new Radio();
        radio.setMaxValume(10);
        radio.setMinValume(0);
        radio.setCurrentValume(5);
        assertEquals(6, radio.upVolume());

    }

    @Test
    public void shouldDownCurrentValume() {
        Radio radio = new Radio();
        radio.setMaxValume(10);
        radio.setMinValume(0);
        radio.setCurrentValume(5);
        assertEquals(4, radio.downVolume());

    }

    @Test
    public void shouldUpMaxValume() {
        Radio radio = new Radio();
        radio.setMaxValume(10);
        radio.setMinValume(0);
        radio.setCurrentValume(10);
        assertEquals(10, radio.upVolume());

    }

    @Test
    public void shouldDownMinValume() {
        Radio radio = new Radio();
        radio.setMaxValume(10);
        radio.setMinValume(0);
        radio.setCurrentValume(0);
        assertEquals(0, radio.downVolume());

    }

}