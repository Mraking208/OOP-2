package ru.netology.javaqa;

public class Radio {
    private int currentRadioStation;
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
           return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }
    public int getNextRadioStation() {
        return currentRadioStation;
    }
    public void setNextRadioStation(int newCurrentRadioStation) {
        currentRadioStation = newCurrentRadioStation;
        currentRadioStation = currentRadioStation >= 9 ? 0 : ++currentRadioStation;
    }
    public int getPrevRadioStation() {
        return currentRadioStation;
    }
    public void setPrevRadioStation(int newCurrentRadioStation) {
        currentRadioStation = newCurrentRadioStation;
        currentRadioStation = currentRadioStation <= 0 ? 9 : --currentRadioStation;
    }

    private int currentVolume;
    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume <= 0) {
            return;
        }
        if (newCurrentVolume >= 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }
    public int getIncreaseVolume() {
        return currentVolume;
    }
    public void setIncreaseVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
        currentVolume = currentVolume >= 100 ? 100 : ++currentVolume;
    }
    public int getDecreaseVolume() {
        return currentVolume;
    }
    public void setDecreaseVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
        currentVolume = currentVolume <= 0 ? 0 : --currentVolume;
    }
}
