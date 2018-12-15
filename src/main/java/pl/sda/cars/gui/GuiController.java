package pl.sda.cars.gui;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class GuiController {

    private CarServiceFacade carServiceFacade;

    @RequestMapping("/autos")
    public String getAutos(Model model) {
        List<Car> cars = carServiceFacade.getCars();
        model.addAttribute("autos", cars);
        return "autos";
    }

}
