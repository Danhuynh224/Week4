/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.chuong4;
import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String doB;
    private String hearAboutMe;
    private String receive;
    private String contact;


    public User(){
        firstName= "";
        lastName= "";
        email = "";
        doB="";
        hearAboutMe="";
        receive="";
//        contact="";
    }
    public User(String firstName, String lastName, String email, String doB){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.doB=doB;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getdoB(){
        return doB;
    }
    public void setdoB(String doB){
        this.doB = doB;
    }
    public String getHearAboutMe(){
        return hearAboutMe;
    }
    public void setHearAboutMe(String hearAboutMe){
        this.hearAboutMe = hearAboutMe;
    }
    public String getReceive(){
        return receive;
    }
    public void setReceive(String receive1,String receive2){
        if(receive1==null){
            receive1="";
        }
        if(receive2==null){
            receive2="";
        }
        this.receive= receive1+" "+receive2;
    }
    public String getContact(){
        return contact;
    }
    public void setContact(String contact){
        this.contact = contact;
    }
}
