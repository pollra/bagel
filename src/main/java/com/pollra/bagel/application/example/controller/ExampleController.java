package com.pollra.bagel.application.example.controller;

import com.pollra.bagel.application.example.entity.Example;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @since       2021.07.21
 * @author      pollra
 * @description example controller
 **********************************************************************************************************************/
@Slf4j
@RestController
@RequestMapping("${property.api.end-point}")
public class ExampleController {

    @PostMapping("/examples")
    public String example(HttpRequest httpRequest, @RequestBody String body) {
        log.info("http: "+httpRequest.toString());
        log.info("body: "+ body);
        return "";
    }
}
