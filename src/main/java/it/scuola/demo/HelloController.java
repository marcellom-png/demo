package it.scuola.demo;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @GetMapping("/api/hello")
    public Map<String,Object>hello() {
        return Map.of(
            "messagge","Hello dalla api Spring!",
            "ok" , true
        );

    }

    @GetMapping("/richiamohell0")
    public Map<String,Object>richiamo(){
        return 
            hello();
            
        

}
} 