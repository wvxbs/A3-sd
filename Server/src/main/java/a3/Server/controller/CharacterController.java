package a3.Server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharacterController {

    @RequestMapping(value = "/status", method = RequestMethod.GET)
    public String GetStatus () {
        return "Hello World!";
    }

    public void Attack () {

    }
}
