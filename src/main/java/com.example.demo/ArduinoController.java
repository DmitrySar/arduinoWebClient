package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ArduinoController {

    List<String> list = new ArrayList<>();

    @GetMapping("arduino")
    public List<String> getSensor() {
        return list;
    }

    @GetMapping("/{val}")
    public void addValue(@PathVariable String val) {
        list.add(val);
    }
}
