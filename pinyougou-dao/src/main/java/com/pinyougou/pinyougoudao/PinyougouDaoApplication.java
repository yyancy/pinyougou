package com.pinyougou.pinyougoudao;

import dao.A.A;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PinyougouDaoApplication {

  public static void main(String[] args) {
    A a = new A();
    SpringApplication.run(PinyougouDaoApplication.class, args);
  }
}
