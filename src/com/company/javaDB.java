package com.company;

import java.sql.*;


public class javaDB {
    public static void main(String[] args) {
        // config of the database driver
        String JDBC_Driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

        // components
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        PreparedStatement ps = null;

        // config of our database
        String url = "jdbc:sqlserver://10.119.31.82;database=mb65471";
        String username = "mb65471";
        String password = "mb65471";


        try {
            try {
                Class.forName(JDBC_Driver);
            } catch (ClassNotFoundException e) {
                System.out.println("Load engine failed");
                System.exit(0);
            }
            //2. Get the connection of database
            conn = DriverManager.getConnection(url, username, password);
            //See if the connection is successful or not.
            if (conn != null) {
                System.out.println("Connet the database sucessfully.");
            } else {
                System.out.println("Cannot connect to the databse");
            }
            //3.Create the object of statements
            String insert_sql = "INSERT INTO TABLE Product VALUES(?,?,?,?,?,?)";
            String select_sql = "select * from Product";
            ps = conn.prepareStatement(insert_sql);
            stmt = conn.createStatement();


            rs = stmt.executeQuery(select_sql);
            while (rs.next()) {
                System.out.print(rs.getString(1) + ' ');
                System.out.print(rs.getString(2) + ' ');
                System.out.print(rs.getString(3) + ' ');
                System.out.print(rs.getString(4) + ' ');
                System.out.print(rs.getString(5) + ' ');
                System.out.print(rs.getDate(6) + " \n");

            }
//            ps.executeUpdate();


        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                    ps = null;
                }
                if (rs != null) {
                    rs.close();
                    rs = null;
                }
                if (stmt != null) {
                    stmt.close();
                    stmt = null;
                }
                if (conn != null) {
                    conn.close();
                    conn = null;
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
