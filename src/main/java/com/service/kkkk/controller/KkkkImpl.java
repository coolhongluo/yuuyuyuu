package com.service.kkkk.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-04-10T02:41:41.105Z")

@RestSchema(schemaId = "kkkk")
@RequestMapping(path = "/kkkk", produces = MediaType.APPLICATION_JSON)
public class KkkkImpl {

    @Autowired
    private KkkkDelegate userKkkkDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userKkkkDelegate.helloworld(name);
    }

}
