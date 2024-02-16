package com.example.demo.Controller;

import com.example.demo.Model.booleann;
import com.example.demo.Service.booleanservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/homepage")

public class booleanController {
    @Autowired
    booleanservice bol;
    @PostMapping("/addvalue")
    public booleann addvalue(@RequestBody booleann boll){

        return bol.adddata(boll);
    }
}
