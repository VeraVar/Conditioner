package ru.netology;

public class Conditioner {
    private String name;
    private int minTemperature = 15;
    private int maxTemperature = 25;
    private int currentTemperature;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }
    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature < minTemperature) {
            this.currentTemperature = minTemperature;
            return;
        }
        if (currentTemperature > maxTemperature) {
            this.currentTemperature = maxTemperature;
            return;
        }
        this.currentTemperature = currentTemperature;
    }

    public void decreaseCurrentTemperature() {
        if (currentTemperature > minTemperature) {
            currentTemperature--;
        }
    }

    public void increaseCurrentTemperature() {
        if (currentTemperature < maxTemperature) {
            currentTemperature++;
        }
    }

    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
}