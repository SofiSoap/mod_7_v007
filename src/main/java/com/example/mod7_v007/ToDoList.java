package com.example.mod7_v007;

import java.util.ArrayList;

public class ToDoList {
    private ArrayList<String> todoListArray = new ArrayList();
    private String title;
    private String action;

    public void TodoList() {


    }

    public   void addTodo(String action) {
        this.action = action;
        this.todoListArray.add(this.action);
    }

    public void delTodo(int numToDel) {
        if (0 < numToDel && numToDel <= this.todoListArray.size()) {
            this.todoListArray.remove(numToDel - 1);
        } else {
            System.out.println("Invalid Input");
        }

    }

    void clear() {
        this.todoListArray.clear();
    }

    public String toString() {
        String temp = null;
        String list = "<" + this.title + ">\n";

        for(int i = 0; i < this.todoListArray.size(); ++i) {
            int j = i + 1;
            this.todoListArray.get(i);
            temp = list.concat("\t" + j + "-" + (String)this.todoListArray.get(i) + "\n");
            list = temp;
        }

        return temp;
    }
}
