package com.example.mod7_v007;

import entity.Todo;

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

        int i = 0;
        mainList.addTodo(request.getParameter("addTask"));
        System.out.println(mainList.toString());

        {
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            EntityTransaction transaction = entityManager.getTransaction();



            try {
                transaction.begin();


                mainList.setTask(task);
                mainList.setId(i);
                entityManager.persist(mainList);

                transaction.commit();

            } finally {
                if(transaction.isActive()) {
                    transaction.rollback();
                }
                entityManager.close();
                entityManagerFactory.close();
            }
            i++;
        }


    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    public void destroy() {
    }
}