package com.example.my_ejb;

import javax.ejb.Remote;

@Remote
public interface Hello {
    String hello();
}
