package com.tis.mx;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@SpringBootApplication
@EnableConfigServer
public class AplicationStarter {

  public static void main(String[] args) {
    SpringApplication.run(AplicationStarter.class, args);

  }

}
