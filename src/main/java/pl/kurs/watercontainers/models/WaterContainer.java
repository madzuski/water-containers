package pl.kurs.watercontainers.models;

public class WaterContainer {
    private String name;
    private double maxCapacity;
    private double currentWaterLevel;

    public WaterContainer(String name, double maxCapacity, double currentWaterLevel) {
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.currentWaterLevel = currentWaterLevel;
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
    public String toString() {
        return "WaterContainer{" +
                "name='" + name + '\'' +
                ", maxCapacity=" + maxCapacity +
                ", currentWaterLevel=" + currentWaterLevel +
                '}';
    }


}
