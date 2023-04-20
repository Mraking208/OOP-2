package ru.netology.javaqa;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;


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

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }


    public void nextRadioStation() {
        currentRadioStation = currentRadioStation >= 9 ? 0 : ++currentRadioStation;
        setCurrentRadioStation(currentRadioStation);
    }

    public void prevRadioStation() {
        currentRadioStation = currentRadioStation <= 0 ? 9 : --currentRadioStation;
        setCurrentRadioStation(currentRadioStation);
    }


    public void increaseVolume() {
        currentVolume = currentVolume <= 0 ? 100 : ++currentVolume;
        setCurrentVolume(currentVolume);
    }

    public void decreaseVolume() {
        currentVolume = currentVolume <= 0 ? 100 : --currentVolume;
        setCurrentVolume(currentVolume);
    }
}
