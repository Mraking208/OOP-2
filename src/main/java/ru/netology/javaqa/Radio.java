package ru.netology.javaqa;

public class Radio {
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int currentRadioStation = minRadioStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    public Radio(int size) {
        maxRadioStation = minRadioStation + (size - 1);
    }

    public Radio() {
        currentRadioStation = maxRadioStation;
        currentVolume = maxVolume;
    }


    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }


    public void nextRadioStation() {
        currentRadioStation = currentRadioStation >= maxRadioStation ? minRadioStation : ++currentRadioStation;
        setCurrentRadioStation(currentRadioStation);
    }

    public void prevRadioStation() {
        currentRadioStation = currentRadioStation <= minRadioStation ? maxRadioStation : --currentRadioStation;
        setCurrentRadioStation(currentRadioStation);
    }


    public void increaseVolume() {
        currentVolume = currentVolume >= maxVolume ? maxVolume : ++currentVolume;
        setCurrentVolume(currentVolume);
    }

    public void decreaseVolume() {
        currentVolume = currentVolume >= maxVolume ? minVolume : --currentVolume;
        setCurrentVolume(currentVolume);
    }
}
