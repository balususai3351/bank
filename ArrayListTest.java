import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("creating object ");
		PhoneLog pl1=new PhoneLog("you got missed call",LocalDate.of(2022, 07, 20),"missed","mohan");
		PhoneLog pl2=new PhoneLog("you dailed call",LocalDate.of(2012, 07, 20),"dailed","sai");
		PhoneLog pl3=new PhoneLog("you received call",LocalDate.of(2012, 07, 20),"received","john");
		PhoneLog pl4=new PhoneLog("you dailed call",LocalDate.of(2012, 07, 20),"dailed","rock");
		PhoneLog pl5=new PhoneLog("you received call",LocalDate.of(2012, 07, 20),"received","ben");
		
		
		ArrayList<PhoneLog> al=new ArrayList<PhoneLog>();
		   al.add(pl1);
		   al.add(pl2);
		   al.add(pl3);
		   al.add(pl4);
		   al.add(pl5);
		   
		   java.util.Iterator<PhoneLog> it =al.iterator();
		   while(it.hasNext()) {
			   PhoneLog pl=it.next();
			   pl.setLogMessage("abc");
			   System.out.println(pl);
			   
		   }

	}

}
          
class Log{
	String logMessage;
	LocalDate logtime;
	public Log(String logMessage, LocalDate logtime) {
		super();
		this.logMessage = logMessage;
		this.logtime = logtime;
	}
	@Override
	public String toString() {
		return "Log [logMessage=" + logMessage + ", logtime=" + logtime + "]";
	}
	public void setLogMessage(String logMessage) {
		this.logMessage = logMessage;
	}
	
	
}
class PhoneLog extends Log{

	String phoneLogType;
	String name;
	public PhoneLog(String logMessage, LocalDate logtime, String phoneLogType, String name) {
		super(logMessage, logtime);
		this.phoneLogType = phoneLogType;
		this.name = name;
	}
	@Override
	public String toString() {
		return "PhoneLog [phoneLogType=" + phoneLogType + ", name=" + name + ", logMessage=" + logMessage + ", logtime="
				+ logtime + "]";
	}
	
	
	
}
