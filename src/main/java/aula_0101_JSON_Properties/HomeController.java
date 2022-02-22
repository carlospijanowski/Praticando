package aula_0101_JSON_Properties;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product/")
public class HomeController {

    @GetMapping("/")
    public String retorno(){
        return "oi";
    }

}
