package it.develhope.primi_passi_first.API_03;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/concatenation")
public class StringController {
    @GetMapping("/strings")
    public String concateStrings(@RequestParam String string1, @RequestParam(required = false) String string2){
        return string1 + " " + string2;
    }
}
