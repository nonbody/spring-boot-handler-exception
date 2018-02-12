package com.exhler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestfulController {

    @GetMapping("hello")
    public ResMessage resource() {
        return new ResMessage("01", "success.");
    }

    @GetMapping("throw")
    public ResMessage throwExp() throws Exception {

        if (true)
            throw new Exception("internal failed");

        return new ResMessage("01", "success.");
    }

    @GetMapping("null")
    public ResMessage throwNull() throws Exception {

        if (true)
            throw new NullPointerException("null pointer");

        return new ResMessage("01", "success.");
    }

}
