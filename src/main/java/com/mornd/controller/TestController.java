package com.mornd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mornd
 * @date 2026/6/20 12:08
 */

@RestController
public class TestController {
    private final String VERSION = "v1.1";

    @GetMapping("/version")
    public Object version() {
        return VERSION;
    }
}
