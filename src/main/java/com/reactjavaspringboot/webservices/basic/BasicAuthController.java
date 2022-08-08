package com.reactjavaspringboot.webservices.basic;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true", allowedHeaders = "*")
public class BasicAuthController {

    // @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    @CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true", allowedHeaders = "*")
    @GetMapping(path = "/basicauth")
    public AuthenticationBean basicAuth() {
        return new AuthenticationBean("Logged in succesfully");
    }

    // @RequestMapping(method = RequestMethod.GET, path = "/hello-world-bean")
    // @CrossOrigin(origins = "http://localhost:4200")
    // @GetMapping(path = "/hello-world-bean")
    // public HelloWorldBean helloWorldBean() {
    // return new HelloWorldBean("Hello World");
    // }

    // @CrossOrigin(origins = "http://localhost:4200")
    // @GetMapping(path = "/hello-world/path-variable/{name}")
    // public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
    // return new HelloWorldBean(String.format("Hello World, %s", name));
    // }
}
