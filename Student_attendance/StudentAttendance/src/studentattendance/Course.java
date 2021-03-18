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
public class Course {
        public int id;
        public String course_name;

        public Course(){
            id = 0;
            course_name = "";
        }
        public Course(int id, String course_name){
            this.id = id;
            this.course_name = course_name;

        }
        public int insertdulieu(){
            int kq = 0;
            String sql = "insert into Course2(course_name) values('" + course_name + "')";
            kq = DatabaseConnection.Insertdulieu(sql);
            return kq;
        }
        public static List<Course> ListCourse(){
            return DatabaseConnection.ListCourse();
        }
        public int Update(){
            int kq = 0;
            String sql = "update Course2 set course_name = '"+course_name+"' where id = "+id;
            kq = DatabaseConnection.Update(sql);
            return kq;
        }
        public int Delete(){
            int kq = 0;
            String sql = "delete from Course2 where id = "+id;
            kq = DatabaseConnection.Update(sql);
            return kq;
        }
    }
