package com.techreturners.apilab1.controller;

import com.techreturners.apilab1.model.Tea;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class TeaController {
    public final AtomicLong counter =new AtomicLong();

    @GetMapping(value= "/teaLover")
    public String teaLover() {
        return "I love my tea";

    }

    @GetMapping(value="/tea")
    public Tea tea(@RequestParam(value="teaName",defaultValue = "gingerTea") String teaName){
        Tea tea=new Tea(counter.incrementAndGet(),teaName);
        return tea;
    }
}
