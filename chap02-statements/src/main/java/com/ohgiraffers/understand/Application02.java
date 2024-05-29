package com.ohgiraffers.understand;

import com.ohgiraffers.understand.dto.EmployeeDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application02 {
    public static void main(String[] args) {
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        List<EmployeeDTO> empList = new ArrayList<>();;
        EmployeeDTO empDTO ;


        try {
            Properties prop = new Properties();
            prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/mapper/employee-query.xml"));
            pstmt = con.prepareStatement(prop.getProperty("selectEmpTop4Salary"));
            rset= pstmt.executeQuery();
            while (rset.next()){
                empDTO = new EmployeeDTO();
                empDTO.setEmpId(rset.getString(1));
                empDTO.setEmpName(rset.getString(2));
                empDTO.setPhone(rset.getString(3));
                empDTO.setSalary(rset.getInt(4));

                empList.add(empDTO);


            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        for(EmployeeDTO employeeDTO:empList){
            System.out.println(employeeDTO);
        }

    }
}
