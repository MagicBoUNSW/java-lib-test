package com.example.javalib.Product;

public class Database {

  private Integer databaseId;
  private String databaseName;
  private String databaseImage;

  public Database(Integer databaseId, String databaseName, String databaseImage) {
    super();
    this.databaseId = databaseId;
    this.databaseName = databaseName;
    this.databaseImage = databaseImage;
  }

//  @Override
//  public String toString() {
//    return "Database [databaseId=" + databaseId + ", databaseName=" + databaseName + ", databaseImage=" + databaseImage ;
//  }

  public Integer getDatabaseId() {
    return databaseId;
  }

  public String getDatabaseName() {
    return databaseName;
  }

  public String getDatabaseImage() {
    return databaseImage;
  }
}
