package ru.netology.javaqa;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation <= 0) {
           return;
        }
        if (newCurrentRadioStation >= 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

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


    public void nextRadioStation(int newCurrentRadioStation) {
        currentRadioStation = newCurrentRadioStation;
        currentRadioStation = currentRadioStation >= 9 ? 0 : ++currentRadioStation;
    }

    public void prevRadioStation(int newCurrentRadioStation) {
        currentRadioStation = newCurrentRadioStation;
        currentRadioStation = currentRadioStation <= 0 ? 9 : --currentRadioStation;
    }


    public void increaseVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
        currentVolume = currentVolume >= 100 ? 100 : ++currentVolume;
    }

    public void decreaseVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
        currentVolume = currentVolume <= 0 ? 0 : --currentVolume;
    }
}
