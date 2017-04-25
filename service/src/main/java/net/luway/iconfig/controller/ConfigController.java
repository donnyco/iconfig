package net.luway.iconfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Copyright (c) 2017-2020 luway.net (Lu Way AI C. Ltd.) All rights reserved.
 * Created by jihan on 2017/4/25.
 */
@Controller
public class ConfigController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

}
