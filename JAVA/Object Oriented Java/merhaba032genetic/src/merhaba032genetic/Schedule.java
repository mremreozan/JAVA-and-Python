package merhaba032genetic;

import java.util.ArrayList;

import merhaba032genetic.domain.Department;
import merhaba032genetic.domain.Class;

public class Schedule {
	private ArrayList<Class> classes;
	private boolean isFitnessChanged = true;
	private double fitness=-1;
	private int classNumb=0;
	private int numbOfConflicts = 0;
	private Data data;
	public Data getData() {return data;}
	
	public Schedule (Data data) {
		this.data=data;
		classes = new ArrayList<Class>(data.getNumberOfClasses());
	}
	
	public Schedule initialize() {
		new ArrayList<Department>(data.getDepts()).forEach(dept -> {
			dept.getCourses().forEach(course -> {
				Class newClass = new Class(classNumb++, dept, course);
				newClass.setMeetingTime(data.getMeetingTimes().get((int) (data.getMeetingTimes().size() * Math.random())));
				newClass.setRoom(data.getRooms().get((int) (data.getRooms().size() * Math.random())));	
				newClass.setInstructor(data.getInstructors().get((int) (data.getInstructors().size() * Math.random())));
				classes.add(newClass);
			});
		});
		return this;
	}
	
	public int getNumbOfConflicts() {return numbOfConflicts;}
	public ArrayList<Class> getClasses(){
		isFitnessChanged = true;
		return classes;
	}
	public double getFitness() {
		if (isFitnessChanged == true) {
			fitness = calculateFitness();
			isFitnessChanged = false;
		}
		return fitness;
	}
	private double calculateFitness() {
		numbOfConflicts = 0;
		classes.forEach(x ->{
			if (x.getRoom().getSeatingCapacity() < x.getCourse().getMaxNumbOfStudents()) numbOfConflicts++;
			classes.stream().filter(y -> classes.indexOf(y) >= classes.indexOf(x)).forEach(y -> {
				if (x.getMeetingT�me() == y.getMeetingT�me() && x.getId() != y.getId()) {	
					if (x.getRoom() == y.getRoom()) numbOfConflicts++;
					if (x.getInstructor() == y.getInstructor()) numbOfConflicts++;
			}
			});
		});
		return 1/(double)(numbOfConflicts + 1);
	}
	
	public String toString() {
		String returnValue = new String();
		for (int x=0; x < classes.size()-1; x++) returnValue += classes.get(x) + ",";
		returnValue += classes.get(classes.size()-1);
		return returnValue;
	}
}
