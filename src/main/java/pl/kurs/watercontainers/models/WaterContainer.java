package pl.kurs.watercontainers.models;

import java.io.Serializable;
import java.util.Objects;

public class WaterContainer implements Serializable {
    private static final long serialVersionUID = 42L;

    private String name;
    private double maxCapacity;
    private double currentWaterLevel;

    private WaterContainer(String name, double maxCapacity, double currentWaterLevel) {
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.currentWaterLevel = currentWaterLevel;
    }

    public static WaterContainer create(String name, double maxCapacity, double currentWaterLevel) {
        if (maxCapacity <= 0) {
            throw new RuntimeException("Maksymalna pojemność musi być powyżej 0");
        }
        if (currentWaterLevel < 0) {
            throw new RuntimeException("Aktualny stan wody nie może być poniżej 0");
        }
        if (maxCapacity < currentWaterLevel) {
            throw new RuntimeException("Aktualna ilość wody nie moze być większa, niż maksymalna pojemność");
        }
        return new WaterContainer(name,maxCapacity,currentWaterLevel);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public double getCurrentWaterLevel() {
        return currentWaterLevel;
    }

    public void setCurrentWaterLevel(double currentWaterLevel) {
        this.currentWaterLevel = currentWaterLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WaterContainer that = (WaterContainer) o;
        return Double.compare(maxCapacity, that.maxCapacity) == 0 && Double.compare(currentWaterLevel, that.currentWaterLevel) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, maxCapacity, currentWaterLevel);
    }

    @Override
    public String toString() {
        return "WaterContainer{" +
                "name='" + name + '\'' +
                ", maxCapacity=" + maxCapacity +
                ", currentWaterLevel=" + currentWaterLevel +
                '}';
    }


}
