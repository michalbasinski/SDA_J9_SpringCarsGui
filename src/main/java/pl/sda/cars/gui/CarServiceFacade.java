package pl.sda.cars.gui;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@AllArgsConstructor
public class CarServiceFacade {
    private RestTemplate restTemplate;
    private String url;

    public List<Car> getCars() {
        ResponseEntity<CarServiceResponse> cars =
                restTemplate.getForEntity(url, CarServiceResponse.class);

        return cars.getBody().getCars();
    }
}
