package com.stackroute.MovieService.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class MovieServiceController {

    @Value("${testCloudConfig}")
    String a;
    @GetMapping("/getMovie")
    public ResponseEntity<?> movieServiceController() {

        System.out.println("Config :" + this.a);
        return new ResponseEntity<String>("this is movie controller", HttpStatus.OK);
    }
}
