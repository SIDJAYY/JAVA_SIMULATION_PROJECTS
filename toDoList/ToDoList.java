package any;

import java.util.ArrayList;

public class ToDoList {
	
	private ArrayList<String> ToDoTask;
	public ToDoList(){
		ToDoTask = new ArrayList<String>();
	}
	public void addTask(String task) {
		ToDoTask.add(task);
	}
	public void removeTask(int index) {
		ToDoTask.remove(index);
	}
	public void getTask() {
		System.out.println("Tasks");
		for(int i = 0; i  < ToDoTask.size();i++) {
			System.out.println(i+"."+ToDoTask.get(i));
		}
	}
	
}
