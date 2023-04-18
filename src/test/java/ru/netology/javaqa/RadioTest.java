package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(4);
        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetOffRadioStation() {
        Radio radio = new Radio();
        radio.setNextRadioStation(11);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldOffRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-2);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchTheRadioStationToTheMinimum() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextRadioStation() {
        Radio radio = new Radio();
        radio.setNextRadioStation(0);
        int expected = 1;
        int actual = radio.getNextRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetAboveNextMaxRadioStation() {
        Radio radio = new Radio();
        radio.setNextRadioStation(11);
        int expected = 0;
        int actual = radio.getNextRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void changeTheRadioStationFromZeroToNine() {
        Radio radio = new Radio();
        radio.setPrevRadioStation(0);
        int expected = 9;
        int actual = radio.getPrevRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevRadioStation() {
        Radio radio = new Radio();
        radio.setPrevRadioStation(7);
        int expected = 6;
        int actual = radio.getPrevRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void turningOffTheVolumeFromNegativeValues() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void turnTheVolumeFromBeyondTheMaximum() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldOffCurrentVolume() {
        Radio radio = new Radio();
        radio.setDecreaseVolume(0);
        int expected = 0;
        int actual = radio.getDecreaseVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setDecreaseVolume(100);
        int expected = 99;
        int actual = radio.getDecreaseVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldOnCurrentVolume() {
        Radio radio = new Radio();
        radio.setIncreaseVolume(100);
        int expected = 100;
        int actual = radio.getIncreaseVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setIncreaseVolume(69);
        int expected = 70;
        int actual = radio.getIncreaseVolume();
        Assertions.assertEquals(expected, actual);
    }
}
