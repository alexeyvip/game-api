package ru.klepekov.game.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.klepekov.game.model.JustJson;

/**
 * Created by alexey on 20.03.16.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public JustJson index() {
        JustJson a = new JustJson();
        a.setAge(12);
        a.setName("Vasya");
        return a;
    }

}
