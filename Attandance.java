
public class Attandance {

	public static void main(String[] args) throws DoorNotEvenClosedException, InterruptedException {
		Attend a=new Attend(9);
		//Attend a1=new Attend(9);
		
		try {
			a.scanCard(9);
		} catch (OnTimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*try {
			a1.scanCard(9);
		} catch (OnTimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}8?
		
		// TODO Auto-generated method stub
		/*for(int i=0;i<20;i++) {
			System.out.println(Math.random());}*/
			
		}

	}


 class OnTimeException extends Exception{
	 
	  OnTimeException(String msg) {
		super(msg);
		//System.out.println(msg);

	}
}
	 
class DoorNotEvenClosedException extends RuntimeException{
	
	DoorNotEvenClosedException(String msg){
		super(msg);
	}
	
}
class DoorClosedException extends RuntimeException{
	DoorClosedException(String msg){
		super(msg);
	}
}
	  
	  

 
class Attend{
	int actualTime;//time in hrs
	static boolean doorOpen;
	
      public Attend(int actualTime) {
		super();
		this.actualTime = actualTime;
	}
	void scanCard(int time) throws OnTimeException,DoorNotEvenClosedException, InterruptedException {// time in hrs
    	  if(time!=actualTime) {
    		  OnTimeException e=new OnTimeException("sorry u enter in wrong time");
               throw e;
    	  }else {
    		  if(doorOpen) {
    			  DoorNotEvenClosedException e=new DoorNotEvenClosedException("just wait until door closed");
    			  throw e;
    			  
    		  }else {
    			  doorOpen=true;
    		      System.out.println("please get in");
    		      Thread.sleep(5000);
    		      close();
    		  }
    		  
    	  }
    	  
      }
      void checkCredentials() {
    	  System.out.println("ur credentials are right and ur attendance is noted just go in");
    	  
      }
      void getin(int time) {
    	  if(time>5) {
    		  DoorClosedException e=new DoorClosedException("Door closed please scan the card again");
    		  throw e;
    		  
    	  }
    	  
      }
      void enter() {
    	  System.out.println("you are entered ");
      }
      void close() {
    	  doorOpen =false;
    	  System.out.println("door is closed");
      }
}
