package br.com.Hollow.Hollow_Knight.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/api/v1/aaa")
public class HollowController {

    @RequestMapping("/findByName")
    public String getHollow (@RequestParam String name) {
        return "O " + name;
    }

    @GetMapping("/get/{id}")
    public String getById (@PathParam(value = "id") String param){
    return "ID pra pegar o usuario foi " + 
    param;
}
}
