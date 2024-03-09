package aa.alireza1381.webproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalculationController {

    @GetMapping("/sum/{x}/{y}")
    public String sum(@PathVariable int x, @PathVariable int y){
        return x + "+" + y + "=" + (x + y);
    }

    @GetMapping("/mul/{x}/{y}")
    public String mul(@PathVariable int x, @PathVariable int y){
        return x + "*" + y + "=" + (x * y);
    }

    @GetMapping("/div/{x}/{y}")
    public String div(@PathVariable int x, @PathVariable int y){
        return x + "/" + y + "=" + (x / y);
    }

    @GetMapping("/sub/{x}/{y}")
    public String subtract(@PathVariable int x, @PathVariable int y){
        return x + "-" + y + "=" + (x - y);
    }


}
