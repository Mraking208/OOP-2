package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getMinRadioStation());
        Assertions.assertEquals(9, radio.getMaxRadioStation());
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldOnMoreMaxRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(13);
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetMaxRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldOffRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        radio.nextRadioStation();
        Assertions.assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void changeTheRadioStationFromZeroToNine() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        Assertions.assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetPrevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);
        radio.prevRadioStation();
        Assertions.assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(20);
        Assertions.assertEquals(20, radio.getCurrentVolume());
        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldOffCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(70);
        radio.decreaseVolume();
        Assertions.assertEquals(69, radio.getCurrentVolume());
    }

    @Test
    public void turningOffTheVolumeFromNegativeValues() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldOffMaxCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldOnCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(102);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(69);
        radio.increaseVolume();
        Assertions.assertEquals(70, radio.getCurrentVolume());
    }
}
