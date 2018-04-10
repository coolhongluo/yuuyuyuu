package com.service.kkkk.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestKkkk {

        KkkkDelegate kkkkDelegate = new KkkkDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = kkkkDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}