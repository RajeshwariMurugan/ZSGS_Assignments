package dto;
 class Student {
	private String name;
	private int rollNo;
	private int age;
	private int currentStd;

	public Student(String name, int rollNo, int age, int currentStd) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
		this.currentStd = currentStd;
	}
	
	 String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCurrentStd() {
		return currentStd;
	}

	public void setCurrentStd(int currentStd) {
		this.currentStd = currentStd;
	}

}
