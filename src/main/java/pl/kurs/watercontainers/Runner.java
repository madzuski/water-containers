package pl.kurs.watercontainers;

import pl.kurs.watercontainers.models.WaterContainer;

public class Runner {

    public static void main(String[] args) {

        WaterContainer beczka = WaterContainer.create("Beczka",150,50);
        WaterContainer mauzer = WaterContainer.create("Mauzer", 1000, 500);

        mauzer.subtractWater(2000);


    }
}
