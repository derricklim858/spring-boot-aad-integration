package com.example.demo;

import com.azure.spring.cloud.autoconfigure.implementation.aad.configuration.properties.AadAuthenticationProperties;
import com.azure.spring.cloud.autoconfigure.implementation.aad.configuration.properties.AadResourceServerProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RequestMapping("/api")
@RestController
public class Controller {
    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping
    public ResponseEntity<String> getMsg() {
        System.out.println("Into Controller");
        return ResponseEntity.ok("Hello World");
    }

//    @PostConstruct
//    public void init() {
//        String[] beanNames = applicationContext.getBeanDefinitionNames();
//        Arrays.sort(beanNames);
//
//        for (String beanName : beanNames) {
//            System.out.println(beanName);
//        }
//    }
}
