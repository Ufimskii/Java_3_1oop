package ru.netology;

public class Radio {
    private int maxValume;
    private int minValume;
    private int currentValume;
    private int maxStation;
    private int minStation;
    private int currentStation;

    // ГРОМКОСТЬ
// Максимальная громкость
    public int getMaxValume() {
        return maxValume;
    }

    public void setMaxValume(int maxValume) {
        this.maxValume = maxValume;
    }

    // Минимальная  громкость
    public int getMinValume() {
        return minValume;
    }

    public void setMinValume(int minValume) {
        this.minValume = minValume;
    }

    // Текущая громкость
    public int getCurrentValume() {
        return currentValume;
    }

    public void setCurrentValume(int currentValume) {
        this.currentValume = currentValume;
    }

    //Увеличение громкости
    public int upVolume() {
        if (currentValume < maxValume) {
            currentValume++;
        }
        if (currentValume == maxValume) {
            currentValume = currentValume + 0;
        }
        return currentValume;
    }

    //Уменьшение громкости -
    public int downVolume() {
        if (currentValume > minValume) {
            currentValume--;
        }
        if (currentValume == minValume) {
            currentValume = currentValume - 0;
        }
        return currentValume;
    }

// СТАНЦИИ

    // Максимальная станция
    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    // Минимальная  станция
    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    // Текущая станция
    public int getCurrentStation() {
        return currentStation;
    }
    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    //Увеличение станции
    public int upStation() {
        if (currentStation < maxStation) {
            currentStation++;
        }
        if (currentStation == maxStation) {
            currentStation = minStation;
        }
        return currentStation;
    }

    //Уменьшение станции
    public int downStation() {
        if (currentStation > minStation) {
            currentStation--;
        }
        if (currentStation == minStation) {
            currentStation = maxStation;
        }
        return currentStation;
    }


    //Установка текущей станции
//    public void setCurrentStation(int currentStation) {
//        if (currentStation > maxStation) {
//            return;
//            }
//        if (currentStation < minStation) {
//            return;
//        }
//        this.currentStation = currentStation;
//    }

}
