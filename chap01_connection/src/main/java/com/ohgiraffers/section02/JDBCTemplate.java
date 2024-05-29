package com.ohgiraffers.section02;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCTemplate {
    public static Connection getConnection(){
        Connection con = null;
        Properties prop = new Properties();

        try {
            // 어디서 찾을지 경로 정해주기
            prop.load(new FileReader("src/main/java/com/ohgiraffers/config/connection-info.properties"));

            String url = prop.getProperty("url");
            // 오버로딩 되어있어서 prop만 넣어도 됨
            con = DriverManager.getConnection(url,prop);



        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return con;
    }


    public static void close(Connection con){
        try {
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
