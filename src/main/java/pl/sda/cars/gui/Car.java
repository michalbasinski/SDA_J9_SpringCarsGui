package pl.sda.cars.gui;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Car {
    private String brand;
    private String model;
    private String vin;
    private String plateNumber;
}
