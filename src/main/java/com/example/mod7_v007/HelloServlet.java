package com.example.mod7_v007;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "todoAdd", value = "/todoAdd")
public class HelloServlet extends HttpServlet {

    ToDoList mainList = new ToDoList();

    private String message;



    public void init() {
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        mainList.addTodo(request.getParameter("addTask"));
        System.out.println(mainList.toString());




    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    public void destroy() {
    }
}