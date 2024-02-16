package com.example.demo.Service;

import com.example.demo.Model.booleann;
import com.example.demo.Repository.booleanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class booleanservice {
    @Autowired
    booleanRepository repo;
    public booleann adddata(@RequestBody booleann boll){
        return repo.save(boll);
    }
}
