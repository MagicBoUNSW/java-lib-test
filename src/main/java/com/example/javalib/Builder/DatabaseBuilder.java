package com.example.javalib.Builder;

import com.example.javalib.Product.Database;

public interface DatabaseBuilder {
  DatabaseBuilder databaseId(Integer databaseId);
  DatabaseBuilder databaseName(String databaseName);
  DatabaseBuilder databaseImage(String databaseImage);

  Database build();
}
