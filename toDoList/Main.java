package any;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	ToDoList list = new ToDoList();
	
	while(true) {
		
		System.out.println("enter a command ~> (add/remove/task/exit)");
		String command = scan.nextLine();
		
		if(command.equals("add")) {
			System.out.println("enter a task.");
			String task = scan.nextLine();
			list.addTask(task);
			
		}else if(command.equals("remove")) {
			list.getTask();
			System.out.println("enter the number you want to remove");
			int index = scan.nextInt();
			list.removeTask(index);
			
		}else if(command.equals("task")) {
			list.getTask();
			
		}else if(command.equals("exit")) {
			break;
			
		}else {
			System.out.println("Invalid Command");
		}
	}
			
	}

}
