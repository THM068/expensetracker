package com.expensetracker.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by tma24 on 11/08/2016.
 */
@Controller
class HomeController {


    @RequestMapping(value = '/')
    public String home() {
        println 'Hello index'
        return 'index'
    }
}
