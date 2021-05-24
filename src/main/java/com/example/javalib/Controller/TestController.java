package com.example.javalib.Controller;

import com.example.javalib.Director.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "/database")
public class TestController {

  @Autowired
  private Client client;


  @GetMapping(value = "/get_database")
  public void testDatabase() {
    this.client.showDatabase();
  }
}
