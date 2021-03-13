/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentattendance;

import java.util.List;

/**
 *
 * @author tthuo
 */
public class Login {
    public int id = 0;
    public String username = "";
    public String pass = "";
    public int role = 0;
    
     public Login()
    {
        id = 0;
        username = "";
        pass = "";
       role = 0;
    }
      public Login( String username, String password)
    {
        this.id = 0;
        this.username = username;
        this.pass = password;
       role = 0;
    }
     @Override
    public String toString() {
        return this.username;
    }
    public int inserdata()
    {
        int kq = 0;
        String sql = " insert login(username,pass) values('" + username +"','" + pass
                + "' )";
        
        kq = DatabaseConnection.Insertdulieu(sql);
        return kq;
    }
     public int checklogin()
    { int kq = 0;
        Login lg = DatabaseConnection.checkLogin(username, pass);
        if(lg != null)
        {
            kq = 1;
            role = lg.role;
        }
        return kq;
    }
    
}
