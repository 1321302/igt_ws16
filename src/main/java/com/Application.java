package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
//Artikel Hinzufügen:     http://localhost:8080/article/add?price=10.3&stock=123&shoppingPrice=8.9&name=DDR4-RAM&description=DDR4-RAM-RiegelCL-9

// Kunde Hinzufügen:      http://localhost:8080/customer/add?lastName=Mustermann&firstName=Max&birthDate=1000-01-01

// Peergroup abfragen:   ???  /customer/peer   oder /peer ?id   ????

// Discount abfragen:    ???   /discount/calculate? "customer id"  ????

// Turnover hinzufügen   ???  /turnover/add?amount=###&customer= "customer object" ????



//WASDL Überprüfen:        http://localhost:8080/validateWSDL?wsdl_url=https://svn.apache.org/repos/asf/airavata/sandbox/xbaya-web/test/Calculator.wsdl

