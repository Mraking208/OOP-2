package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

//    @Test
//    public void shouldSetRadioStation() {
//        Radio radio = new Radio();
//        radio.setCurrentRadioStation(4);
//        int expected = 4;
//        int actual = radio.getCurrentRadioStation();
//        Assertions.assertEquals(expected, actual);
//    }
//    @Test
//    public void shouldOnRadioStation() {
//        Radio radio = new Radio();
//        radio.setCurrentRadioStation(-1);
//        int expected = 0;
//        int actual = radio.getCurrentRadioStation();
//        Assertions.assertEquals(expected, actual);
//    }
    @Test
    public void shouldOnMoreMaxRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(13);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetMaxRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldOffRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        radio.nextRadioStation();
        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void changeTheRadioStationFromZeroToNine() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);
        radio.prevRadioStation();
        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
//    @Test
//    public void shouldSetCurrentVolume() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(40);
//        int expected = 40;
//        int actual = radio.getCurrentVolume();
//        Assertions.assertEquals(expected, actual);
//    }
//    @Test
//    public void shouldOffCurrentVolume() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(0);
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//        Assertions.assertEquals(expected, actual);
//    }
    @Test
    public void turningOffTheVolumeFromNegativeValues() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldOffMaxCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldOnCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(102);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(69);
        radio.increaseVolume();
        int expected = 70;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
