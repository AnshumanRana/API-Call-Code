package com.apipractice.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
@RequestMapping("/check")
public class ApiCall {



    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/result")
public String result(@RequestParam String city){
    String key="Key";
    String  api="API"+ key+"&query="+city;
    return restTemplate.getForObject(api,String.class);

}

}
