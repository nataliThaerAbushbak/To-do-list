/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolistdemo;

/**
 *
 * @author msi
 */
public class ToDoListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ToDoList<String> list= new ToDoList<>();
     list.addTask("walk for a 15 min");
     list.addTask("take a shower");
     list.addTask("drink my coffee");
     list.addTask("go to work");
      
      list.changeStat(3,false);
      list.search(3);
      list.completedTasks();
      list.uncompletedTasks();
    }
    
}
