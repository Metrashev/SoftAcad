package less.lesson08;

public class AllWork {
//	private static final int SIZE = 20;
	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTask;
	
	
	public AllWork(int size) {
		freePlacesForTasks = size;
		tasks = new Task[freePlacesForTasks];
		currentUnassignedTask = 0;
	}
	
	public void addTask(Task task) {
		if(task != null) {
			if(freePlacesForTasks > 0) {
				tasks[tasks.length - freePlacesForTasks] = task;
				freePlacesForTasks--;
			} else {
				System.out.println("Cannot add task " + task.getName() + ". No free places left.");
			}
		} else {
			System.out.println("Invalid task");
		}
	}
	
	public Task getNextTask() {
		Task task = null;
		if(currentUnassignedTask < tasks.length) {
			task = tasks[currentUnassignedTask];
			currentUnassignedTask++;
		} else {
			System.out.println("No more tasks left");
		}
		
		return task;
	}
	
	public boolean isAllWorkDone() {
		for (Task task : tasks) {
			if(task != null && task.getWorkingHours() != 0) {
				return false;
			}
		}
		return true;
	}
}
