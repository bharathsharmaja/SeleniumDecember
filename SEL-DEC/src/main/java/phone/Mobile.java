package phone;

import java.util.List;

import smartphone.Samsung;

public class Mobile {

	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		Samsung galaxy = new Samsung();
		//System.out.println("The model of the phone: "+galaxy.getModel());
		int answer = 2;
		List<String> allModels = galaxy.getMobileModel();
		System.out.println("The Complete List: "+allModels);
		for (String eachModel : allModels) {
			System.out.println("The Model is: "+eachModel);
		}
		
		
		
		
		
		
		
		
		
		
		/*if(answer==1){
			m1.makeCall();
		}else{
			m1.sendSms();
		}*/
		
		/*switch (answer) {
		case 0:
			m1.sendSms();
			break;
		
		case 1:
			m1.makeCall();
			break;
			
		default:
			m1.ignoreCall();
			break;
		}*/
		
		//Intialization|condition|Incrementation
		/*for (int i = 0; i < 5; i++) {
			m1.makeCall();
			System.out.println("The value of I: "+i);
		}
		
		int i=0;
		while(i<5){
			m1.makeCall();
			i++;
		}*/
		
		Mobile.recieveCall();

	}
	
	public void ignoreCall(){
		System.out.println("Call Ignored");
	}
	
	public void makeCall(){
		System.out.println("Make the call");
	}
	
	public void sendSms(){
		System.out.println("Sending an SMS");
	}
	
	public static void recieveCall(){
		System.out.println("Call Recieved");
		/*Mobile m2 = null;
		m2.sendSms();*/
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
