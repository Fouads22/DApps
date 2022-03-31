package com.example.my_ejb;

import javax.ejb.Stateless;

@Stateless
public class HelloResource implements Hello {
    public String hello() {
        return "Hello, Fouad Saba";
    }
}
