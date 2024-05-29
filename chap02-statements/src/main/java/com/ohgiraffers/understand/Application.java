package com.ohgiraffers.understand;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;


import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application {
    public static void main(String[] args) {
        //1. 급여 가장 많이 받는 사원의 정보 모두 출력
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        System.out.println("급여 가장 많이 받는 사원의 정보 출력");
        Properties prop = new Properties();
        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/mapper/employee-query.xml"));
            pstmt = con.prepareStatement(prop.getProperty("selectMaxfunction"));
            rset = pstmt.executeQuery();

            if(rset.next()){
                System.out.println("아이디 : "+rset.getString(1)+ " 이름 : " + rset.getString(2) + " 연락처 : "
                + rset.getString(3)+ " 급여 : " + rset.getString(4));
            }

            System.out.println("-------------------------------");

            System.out.println("선동일 사원의 정보");
            pstmt = con.prepareStatement(prop.getProperty("selectSunDongil"));
            rset = pstmt.executeQuery();

            if(rset.next()){
                System.out.println("아이디 : "+rset.getString(1)+ " 이름 : " + rset.getString(2) + " 연락처 : "
                        + rset.getString(3)+ " 직급 : " + rset.getString(4));
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            close(con);
            close(pstmt);
            close(rset);
        }


    }
}
