package com.vecmty.firstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Greeting {
    @GetMapping("/")
    public String home(){
        return ("<h1>Welcome</h1>");
    }
    @GetMapping("/user")
    public String user(){
        return ("<h1>user </h1>"+ user());
    }
    @GetMapping("/admin")
    public String admin(){
        return ("<h1>admin </h1>" + user());
    }
}
