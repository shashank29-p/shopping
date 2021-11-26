package com.example.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class maincontroller {
    List<products> list=new ArrayList<>();
    @GetMapping("/hello")
    public String example(){
        return "hello";
    }

    @PostMapping("/hii")
    public String addString(@RequestBody addition a){
        return "sum="+(a.a+a.b);
    }

    @GetMapping("add/{a}/{b}")
    public int sum(@PathVariable int a,@PathVariable int b){
        return(a+b);
    }
    
    
    
    @PostMapping("/addProducts")
    public response products(@RequestBody products p) {
            list.add(p);
            return new response("200","added",p);
    } 

    @GetMapping("/getProducts")
    public response getProducts() {
        return new response("200","fetched",list);
    }

    @GetMapping("/getProducts/{id}")
    public String getP(@PathVariable String id)
    {
        return "id:"+id;
    }

    @PutMapping("/getProducts")
    public response getProduct() {
        return new response("200","fetched",list);
    }
    @DeleteMapping("/{id}")
    public response removeProducts(@PathVariable String id)
    {
        for (products p : list) {
            if(p.getId()==id){
                list.remove(p);
            }
            
        }
        return null;
    }

}
