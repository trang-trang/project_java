/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentattendance;

import java.util.List;

/**
 *
 * @author Admin
 */
public class Subject {
        public int id;
        public String subject_name;

        public Subject(){
            id = 0;
            subject_name = "";
        }
        public Subject(int id, String subject_name){
            this.id = id;
            this.subject_name = subject_name;

        }
        public int insertdulieu(){
            int kq = 0;
            String sql = "insert into Subject(subject_name) values('" + subject_name + "')";
            kq = DatabaseConnection.Insertdulieu(sql);
            return kq;
        }
        public static List<Subject> ListSubject(){
            return DatabaseConnection.ListSubject();
        }
        public int Update(){
            int kq = 0;
            String sql = "update Subject set subject_name = '"+subject_name+"' where id = "+id;
            kq = DatabaseConnection.Update(sql);
            return kq;
        }
        public int Delete(){
            int kq = 0;
            String sql = "delete from Subject where id = "+id;
            kq = DatabaseConnection.Update(sql);
            return kq;
        }
    }
