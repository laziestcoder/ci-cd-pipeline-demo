package com.towfiq.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TOWFIQUL ISLAM
 * @email towfiq.106@gmail.com
 * @since 2/22/22 10:15 PM
 */

@RestController
public class HomeRestController {

    @RequestMapping("")
    public Object home() {
        return "Hello User!";
    }
}
