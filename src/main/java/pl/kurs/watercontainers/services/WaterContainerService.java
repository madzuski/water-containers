package pl.kurs.watercontainers.services;

import pl.kurs.watercontainers.models.WaterContainer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class WaterContainerService {

    public static Optional<WaterContainer> getWaterContainerWithTheBiggestWaterAmount(List<WaterContainer> list) {
        return list.stream()
                .filter(x -> x != null)
                .max(Comparator.naturalOrder());
    }
}
