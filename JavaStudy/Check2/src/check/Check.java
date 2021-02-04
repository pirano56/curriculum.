package check;

import constants.Constants;

public class Check {



	private String firstName="hirano";
	private String lastName="masaru";

	public static void main(String[] args) {



	Pet pet1=new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
	pet1.introduce();

	RobotPet pet2=new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
	pet2.introduce();


	}

	Check(String firstName,String lastName) {

		this.firstName=firstName;
		this.lastName=lastName;

	}



	private String printName() {
		return this.firstName + " " + this.lastName;

	}

	public void printData() {
		System.out.println("printNameメソッド　→　"+printName());

	}

}
