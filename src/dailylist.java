import java.util.*;
public class dailylist {

		private static String[] tasks= new String[100];
		private static int counter=0;
		public static Scanner sc=new Scanner(System.in);
		public static void main(String[] args) {
			boolean r=true;
			while(r) {
				System.out.println("Daily List Aplication");
				System.out.println("1.Add new tasks ");
				System.out.println("2.View all the tasks ");
				System.out.println("3.Delete the tasks ");
				System.out.println("4.Exit");
				System.out.println("Choose one option");
				
				
				int n=sc.nextInt();
				sc.nextLine();
				
				switch(n) {
				case 1:
					addtask();
					break;
				case 2:
					viewtask();
					break;
				case 3:
					deletetask();
					break;
				case 4:
					r=false;
					System.out.println("exit the application");
					break;
				default:
				System.out.println("invalid operation");
				
				}
			}
		}
		private static void addtask(){
			if(counter<tasks.length) {
				System.out.println("enter the task ");
				String task=sc.nextLine();
				tasks[counter]=task;
				counter++;
				System.out.println("task added");
				}
			else {
				System.out.println("tasks are full");
				}
		}
			
		private static void viewtask(){
			if(counter==0) {
				System.out.println("tasks are empty");
			}
			else {
				for(int i=0;i<counter;i++) {
					System.out.println((i+1)+ " the tasks are "+ tasks[i]);
			}
		}
		}
		
		public static void deletetask() {
			viewtask();
			if(counter>0) {
				System.out.println("emter the number to delete ");
				int taskn=sc.nextInt();
				sc.nextLine();
				
				if (taskn > 0 && taskn <= counter) { 
	                for (int i = taskn - 1; i < counter - 1; i++) { 
	                    tasks[i] = tasks[i + 1];
	                }
	                tasks[counter - 1] = null; 
	                counter--; 
	                System.out.println("Task deleted.");
	            } else {
	                System.out.println("Invalid task number.");
	            }
	        }
	    			
		}

	}



