
public class Calling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi I am calling you");
        Called object = new Called();
        object.phone();
        System.out.println(object.telephone());  //2 is displayed via this SOP
        System.out.println(object.mobile()); //pass is displayed via this SOP
        
	}

}
