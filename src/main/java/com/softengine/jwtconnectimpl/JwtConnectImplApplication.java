package com.softengine.jwtconnectimpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.softengine.jwttest")
public class JwtConnectImplApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtConnectImplApplication.class, args);
    }

}
