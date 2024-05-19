package com.biblioteka.arti;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.sql.*;

@Controller
public class WebController {
    @RequestMapping(value = "/index.html")
    public String index() {
        return "index";
    }
}

