package org.example._02springweb_;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class Hello {
    @GetMapping()
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/{name}")
    public String sayHelloJohn(@PathVariable String name) {
        return "Hello,  "+ name+"!";
    }
}
