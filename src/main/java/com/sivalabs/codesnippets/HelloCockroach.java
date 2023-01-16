package com.sivalabs.codesnippets;

import java.sql.Connection;
import java.sql.DriverManager;

public class HelloCockroach {
    public static void main(String[] args) {
        String url = System.getenv("JDBC_DATABASE_URL");
        try(Connection conn = DriverManager.getConnection(url);){
            System.out.println("Successful Connection");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
