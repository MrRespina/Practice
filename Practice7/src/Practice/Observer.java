package Practice;

public class Observer {

	String check;

	public Observer(String s) {
		
		check=s;
		if((check!=null)||check!=""){
			
			Controller c = new Controller("작동했음!");

		}else {
			
			Controller c = new Controller("작동하지 않음!");
			
		}
		
	}
	

}
