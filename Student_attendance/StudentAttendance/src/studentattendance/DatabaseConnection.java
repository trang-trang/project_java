/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentattendance;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Admin
 */
public class DatabaseConnection {
    static String ketnoi = "jdbc:sqlserver://localhost;databaseName=Student_attendance;user=sa;password=sa";
  
    
     static int Insertdulieu( String sqlquery)
    {
        int kq = 0;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
  
        try (Connection conn = DriverManager.getConnection(
                ketnoi);
            ) {
              System.out.println("---insert du lieu-----");
              System.out.println(sqlquery);
             Statement stmt = conn.createStatement();
             kq = stmt.executeUpdate(sqlquery);

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }
     
     
    static int Update( String sqlquery)
    {
        int kq = 0;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
  
        try (Connection conn = DriverManager.getConnection(
                ketnoi);
            ) {
              System.out.println("---insert du lieu-----");
              System.out.println(sqlquery);
             Statement stmt = conn.createStatement();
             kq = stmt.executeUpdate(sqlquery);

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }
      //
       public static List<Course> ListCourse()
    {
        List<Course> result = new ArrayList<>();
        String sql = "select * from Course2";
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
           
        }
        ResultSet res ;
         try (Connection conn = DriverManager.getConnection(
                ketnoi);) {
             System.out.println("---ketnoi ok-----");
           Statement stmt = conn.createStatement();
             res = (ResultSet) stmt.executeQuery(sql);
               if(res != null)
            {
                while (res.next()) {

                    int id = res.getInt("id");
                    String name = res.getString("course_name");
                    System.out.println("id:" + id);
                    System.out.println("name:");
                    Course newitem = new Course(id,name);
                    result.add(newitem);
                }
            }
           
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
       
         return result;
        
    }
       
        public static List<Subject> ListSubject()
    {
        List<Subject> result = new ArrayList<>();
        String sql = "select * from Subject";
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
           
        }
        ResultSet res ;
         try (Connection conn = DriverManager.getConnection(
                ketnoi);) {
             System.out.println("---ketnoi ok-----");
           Statement stmt = conn.createStatement();
             res = (ResultSet) stmt.executeQuery(sql);
               if(res != null)
            {
                while (res.next()) {

                    int id = res.getInt("id");
                    String name = res.getString("subject_name");
                    System.out.println("id:" + id);
                    System.out.println("name:");
                    Subject newitem = new Subject(id,name);
                    result.add(newitem);
                }
            }
           
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
       
         return result;
        
    }
       
       
       
       public static Login checkLogin( String username, String password)
    {
        System.out.println("---bat dau ket noi-----");
       Login kq = null;
        String sql = "select * from login where username = '"+username+"' and pass = '" + password +"'";
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
           
        }
        ResultSet res ;
         try (Connection conn = DriverManager.getConnection(
                ketnoi);) {
             System.out.println("---ketnoi ok-----");
           Statement stmt = conn.createStatement();
             res = stmt.executeQuery(sql);
               if(res != null)
            {
                while (res.next()) {

                    int id = res.getInt("ID");
                    String ten = res.getString("username");
                     String pass = res.getString("pass");
                   int role = res.getInt("role");
                     kq = new Login(ten,pass);
                     kq.id = id;
                     kq.role = role;
                     
                    
                  
                }
            }
           
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
       
         return kq;
        
    }  
}
//      public static List<Noidung> laydsthu()
//    {
//        List<Noidung> result = new ArrayList<>();
//        String sql = "select * from noidung where thuchi = 1";
//         try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        } catch (ClassNotFoundException ex) {
//           
//        }
//        ResultSet res ;
//         try (Connection conn = DriverManager.getConnection(
//                ketnoi, username, password);) {
//             System.out.println("---ketnoi ok-----");
//           Statement stmt = conn.createStatement();
//             res = stmt.executeQuery(sql);
//               if(res != null)
//            {
//                while (res.next()) {
//
//                    int id = res.getInt("ID");
//                    String ten = res.getString("ten");
//                    int thuchi = res.getInt("thuchi");
//                  
//                    System.out.println("id:" + id);
//                    System.out.println("ten:" + ten);
//                    Noidung newitem = new Noidung(id,ten,thuchi);
//                    result.add(newitem);
//                }
//            }
//           
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//       
//         return result;
//        
//    }  
//    public static List<Noidung> laydsnoidung()
//    {
//        List<Noidung> result = new ArrayList<>();
//        String sql = "select * from noidung";
//         try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        } catch (ClassNotFoundException ex) {
//           
//        }
//        ResultSet res ;
//         try (Connection conn = DriverManager.getConnection(
//                ketnoi, username, password);) {
//             System.out.println("---ketnoi ok-----");
//           Statement stmt = conn.createStatement();
//             res = stmt.executeQuery(sql);
//               if(res != null)
//            {
//                while (res.next()) {
//
//                    int id = res.getInt("ID");
//                    String ten = res.getString("ten");
//                    int thuchi = res.getInt("thuchi");
//                  
//                    System.out.println("id:" + id);
//                    System.out.println("ten:" + ten);
//                    Noidung newitem = new Noidung(id,ten,thuchi);
//                    result.add(newitem);
//                }
//            }
//           
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//       
//         return result;
//        
//    }
//      public static List<Loaitien> laydsloaitien()
//    {
//        List<Loaitien> result = new ArrayList<>();
//        String sql = "select * from loaitien";
//         try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        } catch (ClassNotFoundException ex) {
//           
//        }
//        ResultSet res ;
//         try (Connection conn = DriverManager.getConnection(
//                ketnoi, username, password);) {
//             System.out.println("---ketnoi ok-----");
//           Statement stmt = conn.createStatement();
//             res = stmt.executeQuery(sql);
//               if(res != null)
//            {
//                while (res.next()) {
//
//                    int id = res.getInt("ID");
//                    String ten = res.getString("ten");
//                    String sotk = res.getString("sotk");
//                    String tentk = res.getString("tentk");
//                    System.out.println("id:" + id);
//                    System.out.println("ten:" + ten);
//                    Loaitien newitem = new Loaitien(id,ten,sotk,tentk);
//                    result.add(newitem);
//                }
//            }
//           
//        } catch (SQLException e) {
//            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//       
//         return result;
//        
//    }