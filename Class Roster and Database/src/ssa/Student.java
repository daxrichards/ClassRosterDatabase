package ssa;

import java.util.*;

public class Student implements Comparable<Student>{
	
	String id;
	String firstName;
	String lastName;
	String eyeColor;   //("blue", "brown", or "other")
	String monthsEmployed; // (number of MONTHS at the SSA)
	
    //Declaring ArrayList of type Student
	ArrayList<Student> students= new ArrayList<>();

	
	//Two dimensional array created to hold data to be loaded into ArrayList
	
	String[][]  student = {{"001122", "Michael", "Clair", "other", "12"},
			 {"001212", "Stephen", "Brown", "bown", "11"},
	 		{"474143", "Jonathan", "Stafford", "brown", "13"},
			{"004400", "Kyle", "Deen", "blue", "2"},
			{"004400", "Kevin", "Tran", "other", "12"},
			{"306700", "Li", "Lui", "brown", "12"},
			{"215296", "Joshua", "Franey", "other", "27"},
			{"523420", "Gabriel", "Hamilton", "other", "10"},
			{"004014", "Aisha", "Covington", "brown", "10"},
			{"006789", "Arun", "Soma", "brown", "2"},
			{"009999", "Steve", "Ellwood", "other", "12"},
			{"001449", "Karen", "Reiter", "brown", "10"},
			{"267252", "Dax", "Richards", "brown", "12"},
			{"229949", "Michael", "Sykes", "brown", "12"},
			{"772223", "Daniel", "Kiros", "brown", "3"},
			{"004444", "Peter", "Choi", "brown", "2"},
			{"005255", "Joe", "Hill", "brown", "13"},
			{"008888", "Evan", "Tizard", "brown", "12"},
			{"132617", "Reuben", "Turner", "blue", "12"},
			{"343769", "Shaquil", "Timmons", "brown", "11"}};
	

		
	//printClassRoster will print the class roster and append hashMap data to the end.
	public void printClassRoster(){
		
		
		//"for loop" to load the ArrayList with student data
	for(String[] aStudent: student ){
		
		Student newStudent = new Student();
		
		newStudent.setId( aStudent[0]);
		newStudent.setFirstName( aStudent[1]);
		newStudent.setLastName(aStudent[2]);
		newStudent.setEyeColor(aStudent[3]);
		newStudent.setMonthsEmployed( aStudent[4]);
		
		students.add(newStudent);
	}
		
		System.out.println("Student Class Roster");
		System.out.println("\nEmpl Id     " + "\t\t" + "First name     " + "\t" +"         Last name       " + "\t" + "Eye color       " + "\t" + "Months at SSA   ");
		System.out.println("================"    +  "\t" + "================" + "\t" +"================" + "\t" + "================" + "\t" + "================");		
		
				
		//ArrayList containing student information is sorted by name and displayed
		
	   Collections.sort(students);
		for(Student pupil: students){
		
		System.out.printf("\n %5s  %23s %25s %20s %25s", pupil.id , pupil.firstName, pupil.lastName,  pupil.eyeColor, pupil.monthsEmployed);
		}
		//This method is called to create a HashMap of student data retrievable by student id
		createHash();
	    }
		
		public  void createHash(){
			
			System.out.println("\n");
			System.out.println("\nEmpl Id     " + "\t\t" + "First name     " + "\t" +"         Last name       " + "\t" + "Eye color       " + "\t" + "Months at SSA   ");
			System.out.println("================"    +  "\t" + "================" + "\t" +"================" + "\t" + "================" + "\t" + "================");		
			

		     //
			HashMap<String, Student> studentMap = new HashMap<String, Student>();
		
			for(Student pupil: students){
				
				studentMap.put(pupil.getId(), pupil);
		
								
			}
		//Create ArrayList to hold all of the keys in the HashMap
			ArrayList<String> keyHolder = new ArrayList<String>();
			
			
             //Load the ArrayList with each individual key
			for(String key: studentMap.keySet()){
				
				keyHolder.add(key);
							
			}
			
			//Sort the ArrayList in ascending order by key
	Collections.sort(keyHolder);
	        
	//Determine the key before and after the target value 
			String preKey = keyHolder.get((keyHolder.indexOf("267252")) - 1);
			String myKey = keyHolder.get((keyHolder.indexOf("267252")));
			String postKey = keyHolder.get((keyHolder.indexOf("267252")) + 1);
			

			
		//Print the data associated with the before target after target and target keys  	
			Student s1 = studentMap.get(preKey);
			System.out.printf("\n %5s  %23s %25s %20s %25s", s1.id , s1.firstName, s1.lastName,  s1.eyeColor, s1.monthsEmployed);
			Student s2= studentMap.get(myKey);
			System.out.printf("\n %5s  %23s %25s %20s %25s", s2.id , s2.firstName, s2.lastName,  s2.eyeColor, s2.monthsEmployed);
			Student s3 = studentMap.get(postKey);
			System.out.printf("\n %5s  %23s %25s %20s %25s", s3.id , s3.firstName, s3.lastName,  s3.eyeColor, s3.monthsEmployed);
	}
		
		//CompareTo method needed to sort the ArrayList by a particular field/variable
	
	@Override
	public int compareTo(Student student){
		
		return this.firstName.compareTo(student.firstName);
				
		
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}


	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the eyeColor
	 */
	public String getEyeColor() {
		return eyeColor;
	}


	/**
	 * @param eyeColor the eyeColor to set
	 */
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}


	/**
	 * @return the monthsEmployed
	 */
	public String getMonthsEmployed() {
		return monthsEmployed;
	}


	/**
	 * @param monthsEmployed the monthsEmployed to set
	 */
	public void setMonthsEmployed(String monthsEmployed) {
		this.monthsEmployed = monthsEmployed;
	}

}
