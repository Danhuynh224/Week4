/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package com.example.chuong4;

import java.io.*;
import java.time.LocalDate;


import com.example.chuong4.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
public class SurveyListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/index.html";

        String action = request.getParameter("action");
        if(action == null){
            action = "join";
        }

        if(action.equals("join")){
            url = "/index.html";
        }
        else if(action.equals("add")){
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String doBStr = request.getParameter("doB");
            LocalDate doB=null;
            if (doBStr != null && !doBStr.isEmpty()) {
                doB = LocalDate.parse(doBStr); // Chuyển đổi chuỗi thành LocalDate
            }
            String hearAboutMe = request.getParameter("hearAboutMe");
            System.out.println(hearAboutMe);
            String checkBox1 = request.getParameter("check1") != null ? "Yes I'd like that." : null;
            String checkBox2 = request.getParameter("check2") != null ? "Yes, please send me email announcements" : null;
            String contactMethod = request.getParameter("contact");
            User user = new User(firstName, lastName, email,doB);
            user.setHearAboutMe(hearAboutMe);
            user.setReceive(checkBox1,checkBox2);
            user.setContact(contactMethod);
            request.setAttribute("user", user);
            // Check for checkboxes


            url = "/thanks.jsp";
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
