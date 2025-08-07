/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolistdimo;

import java.util.Iterator;
/**
 *
 * @author msi
 */
public class ToDoList <String>  {
    
    
  private static class Task<String>{
   
   private Task<String> next;
   private String taskName;
   private  int id  ;
   private  boolean status;
               
                
		public Task(int id,String taskName,Task<String> next) {
                        this.id=id;
			this.taskName=taskName;
			this.next=next;
                        this.status= true;
		}
		
		public Task getNext() {
			return this.next;
		}
		public void setNext(Task<String> next) {
			 this.next=next;
		}
                	                
                public String getTaskName() {
                           return taskName;
                }
                public void setTaskName(String name) {
                          this.taskName=name;
                }
                
                public int getId() {
                return id;
                }
               private  void setId(int id) {
                 this.id=id;
                }
                public boolean getStatus() {
                return status;
                }
            public void setStatus(boolean status) {
                 this.status=status;
               }
  }//the end of defining our node ..
		

//the list atrr
	private Task<String> head;
	private Task<String> tail;
	private int size;
        private  int idIncrement=1;//i put this atrr to count the id
        
	 public ToDoList() {
		head=null;
		tail=null;
		size=0;
	}
         // i may use this method to help me 
	private int size() {
	return this.size;
	}
        //and this one too
	private boolean isEmpty() {
	 return this.size==0;
	}
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  ADD TASK METHOD  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
       //i want the id to increase once every time i add a task by default//
	public void addTask(String taskName) {
	Task<String> newNode=new Task<>(idIncrement++,taskName, null);
	if(isEmpty()){
        head=newNode;
	tail= newNode;}
	 else {
	tail.setNext(newNode);
	tail=newNode;
        }
	size++;
        
         
	}
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>  Search by id method  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
       
	public void search(int id){
           Task<String> current =head;
           while(current!=null){
               if(current.getId()==id){
                   System.out.println("TASK YOU SEARCHED FOR IS :"+current.getTaskName());
                   System.out.println("TASK YOU SEARCHED FOR IS Done ? :"+(current.getStatus()?"yes":"no"));
                    return;
               }
               //this statment equals i++ //learnt this from lec 4** 
               current=current.getNext();
           }
                   
            System.out.println("No task with such an id ");

        }
        //>>>>>>>>>>>>>>>>>>>>>>>>>>> deleting task by its id  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	
	public void clear() {
		this.head.setNext(null);
		this.head=null;
		this.tail=null;
		size=0;
	}
	
 
      public void deleteTask(int id) {
    // if list is empty
    if (head == null)
        return;
    // if task is at the head
    if (head.getId() == id) {
        String task = head.getTaskName();
        head = head.getNext();
        if (head == null)
            tail = null;
        size--;
        return;
    }

    // if task is in the middle or at the end
    Task<String> currentTask = head;
    while (currentTask.getNext() != null) {
        if (currentTask.getNext().getId() == id) {
            //  deleting the last element on the to do list
            if (currentTask.getNext() == tail) {
                tail = currentTask;}
            currentTask.setNext(currentTask.getNext().getNext());
            size--;
            return;
        }
        currentTask = currentTask.getNext();
    }
    // If id not found
    System.out.println("id not found");
}
      //to get uncompleted tasks
      public void uncompletedTasks(){
          //if the todo list is empty
          if(isEmpty()){
              System.out.println("the list is empty");
              return;
          }
          
           //count a variable which i made.. to make sure that the pointer point to all of the uncompleted tasks
        
         int count =0;
          Task<String> current =head;
         //if the current became null that means the lest is finished
          while(current!=null){
              //a condition to get tasks with a false status
              if(current.getStatus()==false){
                  //the pointer point to it succefuly its uncomleted so we increment the count its not zero any more
                 System.out.println("the uncompleted task is :"+current.getTaskName());
                 count++;
                   
              }
             
            
              //i++ equevient statment
               current=current.getNext();
          } 
             //that means the loop finished without any increment soo all tasks are completed >>>>>
            if (count==0){
               System.out.println("you complete all tasks you are awoseme");
            
            }
                
         
             
}
            //to get completed tasks
      public void completedTasks(){
          //if the todo list is empty
          if(isEmpty()){
              System.out.println("the list is empty");
              return;
          }
          
           //count a variable which i made.. to make sure that the pointer point to all of the uncompleted tasks
        
         int count =0;
          Task<String> current =head;
         //if the current became null that means the lest is finished
          while(current!=null){
              //a condition to get tasks with a true status that means it is done
              if(current.getStatus()==true){
                //the pointer point to it succefuly its comleted so we increment the count its not zero any more
                 System.out.println("the completed task is :"+current.getTaskName());
                 count++;
                   
              }
             
            
              //i++ equevient statment
               current=current.getNext();
          } 
             //that means the loop finished without any increment soo no ask is completed >>>>>
            if (count==0){
               System.out.println("you  didnt complete any task ,its ok you are going to make tommorow");}}
     //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> to change status method >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
            public void changeStat(int id ,boolean stat){
                Task< String> current = head;
               while(current!=null){
               if(current.getId()== id){
                   //changing the status
                current.setStatus(stat);
                //early end of loop if we find the id
                return;
            }
               //i++
               current=current.getNext();
             }
               //loop is finished with no such an id
           System.out.println("no task with such an Id");
}
}
    

