package com.themuku.lecrew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.sql.*;


//This is for the database

class MysqlCon{
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://dbadmin.one.com",
                    "themuku_com_crew",
                    "SackofShit1");
//This will connect to the database on themuku.com LMAOOOO Hopefully
            //themuku_com_crew (Database name)
        Statement stmt = con.createStatement();
        ResultSet rs=stmt.executeQuery("Select * from Users ");
        while (rs.next())
            System.out.println(rs.getInt(1)+ " "+rs.getString(2)+ " "+rs.getString(3));
        con.close();
        } catch (Exception e){
            System.out.println(e); }


    }
}


//This is for the open page or you can see the loading page when you open the app.

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        string Password = txtPassword.getText();
        string Username = txtUsername.getText();






    }
}
