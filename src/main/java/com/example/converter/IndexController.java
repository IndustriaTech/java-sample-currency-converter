package com.example.converter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Model model) {
        List<String> currencies = new ArrayList();
        currencies.add("BGN");
        currencies.add("EUR");
        currencies.add("USD");
        model.addAttribute("currencies", currencies);
        return "index";
    }
}
