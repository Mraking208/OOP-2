package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio(10);

    @Test
    public void shouldSetRadioStation() {
        Assertions.assertEquals(0, radio.getMinRadioStation());
        Assertions.assertEquals(9, radio.getMaxRadioStation());
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldOnMoreMaxRadioStation() {
        radio.setCurrentRadioStation(13);
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetMaxRadioStation() {
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldOffRadioStation() {
        radio.setCurrentRadioStation(-1);
        radio.nextRadioStation();
        Assertions.assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void changeTheRadioStationFromZeroToNine() {
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        Assertions.assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetPrevRadioStation() {
        radio.setCurrentRadioStation(7);
        radio.prevRadioStation();
        Assertions.assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentVolume() {
        radio.setCurrentVolume(20);
        Assertions.assertEquals(20, radio.getCurrentVolume());
        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldOffCurrentVolume() {
        radio.setCurrentVolume(70);
        radio.decreaseVolume();
        Assertions.assertEquals(69, radio.getCurrentVolume());
    }

    @Test
    public void turningOffTheVolumeFromNegativeValues() {
        radio.setCurrentVolume(-1);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldOffMaxCurrentVolume() {
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldOnCurrentVolume() {
        radio.setCurrentVolume(102);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setCurrentVolume(69);
        radio.increaseVolume();
        Assertions.assertEquals(70, radio.getCurrentVolume());
    }
}
