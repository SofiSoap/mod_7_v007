<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.example.mod7_v007.ToDoList" %>
<%@ page import = "java.io.*" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link href="style01.css" rel="stylesheet" type="text/css">
</head>




<body>



<%
 com.example.mod7_v007.ToDoList list = new com.example.mod7_v007.ToDoList();


%>
    <br>
    <h1>To Do List</h1>

    <p> Add item Below</p>
    <div class = "addTask">

        <form name = "myForm" action = "todoAdd.jsp" method = "post">
            <table>
                <tbody>

                <tr>
                    <td>Add Task</td>
                    <td><input type = "text" name = "addTask" value = "" size = "50" /> </td>
                </tr>
                </tbody>
            </table>

            <input type = "reset" value="Clear" name = "Clear"/>
            <input type = "submit" value="Submit" name = "Submit"/>

        </form>
    </div>

    <br>
    <br>

    <p> Delete item Below</p>
    <div class = "delTask">

        <form name = "myForm2" action = "delTask.jsp" method = "post">
            <table>
                <tbody>

                <tr>
                    <td>Delete Task</td>
                    <td><input type = "text" name = "delTask" value = "" size = "50" /> </td>
                </tr>
                </tbody>
            </table>

            <input type = "reset" value="Clear" name = "Clear2"/>
            <input type = "submit" value="Submit" name = "Submit2"/>

        </form>
    </div>

    <br>
    <br>
    <br>

<div class = "delTask">

    <form name = "myForm2" action = "showTable.jsp" method = "post">

        <input type = "submit" value="Show Table" name = "Submit3"/>

    </form>
</div>


</body>
</html>