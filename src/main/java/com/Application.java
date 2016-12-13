package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
//http://localhost:8080/article/add?price=10.3&stock=123&shoppingPrice=8.9&name=DDR4-RAM&description=DDR4-RAM-RiegelCL-9

//http://localhost:8080/validateWSDL?wsdl_url=https://svn.apache.org/repos/asf/airavata/sandbox/xbaya-web/test/Calculator.wsdl