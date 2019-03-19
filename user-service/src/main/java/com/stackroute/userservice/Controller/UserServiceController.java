package com.stackroute.userservice.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceController {
    @Value("${testCloudConfig}")
    String test;

    @GetMapping("/getUsers")
    public ResponseEntity<String> getUsers() {

        System.out.println(this.test);
        return new  ResponseEntity<String>("this is user Controller",HttpStatus.OK);
    }
}
