package hospital;
import java.util.ArrayList;
import java.util.Scanner;


interface abc{
	void bp();
	void temp();
}

class details{
	
	details(){} // constructor
	
Scanner sc=new Scanner(System.in);
String name;
int age;
String gender;
String p_name;
String bld_grp;
String adrs;

void Accept() {
	System.out.println("\n*********************************************************************\n");
	System.out.println("WELCOME TO CITY HOSPITAL");
	System.out.println("Enter the name of the patient");
	name=sc.nextLine();
	System.out.println("Enter the age of the patient");
	age=sc.nextInt();
	}


void display() {
	System.out.println("The Details of patient are:");
	System.out.println("Name:"+name+"\nAge:"+age);
}
}


class patient extends details implements abc{
	
//inheritance//
	public void bp() {
		System.out.println("BASIC TESTS REQUIRED : BP ");
		System.out.println("BP"); 
	
		int bp = sc.nextInt();
		System.out.println("The blood pressure of patient is:" +bp);
	}
	
	public void temp() {
		System.out.println("BASIC TESTS REQUIRED : TEMPERATURE");
		System.out.println("TEMP");

		int temp = sc.nextInt();
		System.out.println("The temperature of patient is:" +temp);
	}
	

	void Accept() {
	
	super.Accept();
	System.out.println("Enter the gender of the patient");
	gender=sc.next();
	
	System.out.println("Enter the parentage of the patient");
	p_name=sc.next();
	
	System.out.println("Enter the blood group of patient ");
	bld_grp=sc.next();
	
	System.out.println("Enter the address of patient");
	adrs=sc.nextLine();
}

	void display() {
	
	//overriding//
	System.out.println("\n----------------- Patient Details -----------------\n");
	System.out.println("Name:"+name+"\nAge:"+age+"\nGender:"+gender+"\nParentage:"+p_name+"\nBlood Group:"+bld_grp+"\nAddress:"+adrs);
}

	void select() {
		int ch;
		
		Scanner sc= new Scanner(System.in);
		//System.out.println("Enter your medical condition  ");
		do{
			
			System.out.println("\n*********************************************************************\n");
			System.out.println("\n----------------- Medical problems -----------------\n");
			System.out.println("1. Orthopedics \n 2. Cardiology \n 3. Gynaecology \n 4. ENT \n 5. Dentistry \n 6. Press 6 to generate bill");
		
		ch = sc.nextInt();
		
		switch(ch) {
		case 1:
			System.out.println("ORTHOPEDICS ");
			System.out.println("Enter your choice for doctor");
			System.out.println("1. Dr. Naveenchandra Alva \n MBBS, M.S.(Ortho)\n");
			System.out.println("2. Dr. Bhagath L.S  \n MBBS, D'Ortho \n");
			int a = sc.nextInt();
			System.out.println("Enter the region of pain");
			String m = sc.nextLine();
			String pain=sc.nextLine();
			System.out.println(pain);
			System.out.println("The recommended test are:\n1.X-Ray\n2.MRI\n3.Ultrasound\n4.Computed tomography");
			System.out.println("The imp supplies required are 1. Calcium \n 2. Vit D tablets \n 3. Bio jointartho \n 4. Boonac-Plus");
			
			break;
			
		case 2:
			System.out.println("CARDIOLOGY ");
			System.out.println("Enter your choice for doctor");
			System.out.println("1. Dr. Yusuf A Kumble \n MBBS, M.D.(Cardiology-AIIMS) \n");
			System.out.println("2. Dr. M.K. Moosa Kunhi  \n MBBS, MS, M.Ch \n");
			System.out.println("3. Dr. Sandhya Rani PN \n MD(Medicine), DM(Cardiology)\n ");
			int b = sc.nextInt();
			System.out.println("Mention your problem");
			String o = sc.nextLine();
			String pain1=sc.nextLine();
			System.out.println(pain1);
			System.out.println("The recommended test are:\n1.ECG\n2.MRI\n3.Ultrasound\n4.Coronary Computed tomography angiogram");
			System.out.println("Medicines: 1. Cardiolip \n 2. Aspirin\n 3. cardicheck");
			System.out.println("recommended: Physical exercise");
			break;
			
		case 3:
			System.out.println("GYANECOLOGY ");
			System.out.println("Enter your choice for doctor");
			System.out.println("1. Prof. Dr. Bhavana Sherigar \n MBBS, M.D.,FICOG \n");
			System.out.println("2. Dr. Zulfiya Shabnam  \n MBBS, DNB \n");
			int c = sc.nextInt();
			System.out.println("Mention your problem");
			String k = sc.nextLine();
			String pain2=sc.nextLine();
			System.out.println(pain2);
			System.out.println("The recommended test are:\n1.Ultrasonography\n2.Biopsy\n3.Screening test\n4Pap test");
			System.out.println("Medicines:1. Cefoxitin\n 2. Ketoprofen\n 3. Oxytocin");
			break;
			
		case 4:
			System.out.println("ENT");
			System.out.println("Enter your choice for doctor");
			System.out.println("1. Dr. Pallavi Pavithran \n MBBS, MS(ENT),DNB(ENT)\n");
			int d = sc.nextInt();
			System.out.println("Mention your problem");
			String l = sc.nextLine();
			String pain3 = sc.nextLine();
			System.out.println(pain3);
			System.out.println("The recommended test are:\n1.Auditory Brainstem Response\n2.Pure tone test\n3.Ultrasound\n4.Test of the middle ear");
			System.out.println("Medicines:\n 1.Gentamicin \n 2. Mometasone nasal spray\n 3. Nystan");
			break;
			
		case 5:
			System.out.println("DENTISTRY");
			System.out.println("Enter your choice for doctor");
			System.out.println("1. Dr. Meghana S Kumar \n BDS, MDS\n");
			int e = sc.nextInt();
			System.out.println("Mention your problem");
			String f = sc.nextLine();
			String pain4 =sc.nextLine();
			System.out.println(pain4);
			System.out.println("The recommended test are:\n1.X-ray\n2.Palpation\n3.Aspiration");
			System.out.println("recommended:\n 1. Fluoride treatment\n 2. Root canals\n 3. Crowns\n 4. Fillings");
			break;
			
			
		default:
			System.out.println("Enter a valid choice ");
		}
		
	}while(ch!=6);
		
}
	void generateBill() {
	
		// Define charges for different medical services
		double bpCharge = 100.0; // Charge for blood pressure test
		double tempCharge = 100.0; // Charge for temperature test
		
		// Define charges for appointment and medicines
		double appointmentCharge = 500.0; // Charge for appointment
		double medicineCharge = 1000.0; // Charge for medicines

		// Calculate total charges
		double totalCharges = bpCharge + tempCharge + appointmentCharge + medicineCharge; // Add charges for all services

		// Display the bill

		System.out.println("\n----------------- Charges -----------------\n");
		System.out.println("Blood Pressure Test: Rs." + bpCharge);
		System.out.println("Temperature Test: Rs. " + tempCharge);
		System.out.println("Appointment Charge: Rs. " + appointmentCharge);
		System.out.println("Medicine Charge: Rs. " + medicineCharge);
		System.out.println("\nTotal Charges: Rs. " + totalCharges);
		System.out.println("\n----------------- End of Bill -----------------\n");
		
}

}

public class hosp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of patients");
		int n=sc.nextInt();
		
		patient s[]=new patient[10];
		for(int i=0;i<n;i++) {
			s[i]=new patient();
		 
			s[i].Accept();
			s[i].bp();
			s[i].temp();
		 	s[i].select();
		 	s[i].display();
		 	s[i].generateBill();
		}
}
}