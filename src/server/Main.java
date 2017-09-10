package server;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws Exception {
		
		
		ClockProxy proxy = new ClockProxy();
		Clock service = proxy.getClock();
		
		 long  T0 = System.currentTimeMillis();
		 long clientTimeP = 1505056224356l;
//		  set 10,2017 12:10:24
		 SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy HH:mm:ss");    
		 Date resultdate = new Date(clientTimeP);
		 System.out.println(sdf.format(resultdate));
		long T1 = service.enviarMensagem(clientTimeP, "SHIT!");
		 
		 long d = (T1 - T0)/2;
		 
		 resultdate = new Date(clientTimeP + d);
		 System.out.println(sdf.format(resultdate));

	
		 

	}
}
