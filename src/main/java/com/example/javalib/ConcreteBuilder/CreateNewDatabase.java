package com.example.javalib.ConcreteBuilder;

import com.example.javalib.Builder.DatabaseBuilder;
import com.example.javalib.Product.Database;

public class CreateNewDatabase implements DatabaseBuilder {

  private Integer databaseId;
  private String databaseName;
  private String databaseImage;

  @Override
  public DatabaseBuilder databaseId(Integer databaseId) {
    this.databaseId = databaseId;
    return this;
  }

  @Override
  public DatabaseBuilder databaseName(String databaseName) {
    this.databaseName = databaseName;
    return this;
  }

  @Override
  public DatabaseBuilder databaseImage(String databaseImage) {
    this.databaseImage = databaseImage;
    return this;
  }

  @Override
  public Database build() {
    return new Database(databaseId, databaseName, databaseImage);
  }
}
