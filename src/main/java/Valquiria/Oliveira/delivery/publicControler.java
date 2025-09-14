package com.oliveiradelivery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sprinframwork.b.bind.annotation.RstController;

@RestController
@RequestMapping ("/api/public")
public class PublicControler{
     @GetMapping("/info")
    public String publString(){
         return "Informaçoes publicas";
    }

}