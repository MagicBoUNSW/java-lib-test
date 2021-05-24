package com.example.javalib.Director;

import com.example.javalib.ConcreteBuilder.CreateNewDatabase;
import com.example.javalib.Product.Database;
import org.springframework.stereotype.Service;

@Service
public class Client {

  public void showDatabase() {
    Database database = new CreateNewDatabase().databaseId(123).databaseName("sadas").databaseImage("Image").build();

    System.out.println(database);
  }

}
