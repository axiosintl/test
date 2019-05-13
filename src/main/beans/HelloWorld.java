package beans;

import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;

@ManagedBean(name = "helloWorld", eager = true)
@RequestScoped
public class HelloWorld {
   
   public static String helloMessage = "HCD - Welcome to JSF 2.x ";
   public HelloWorld() {
      System.out.println(helloMessage);
   }
	
   public String getMessage() {
      return helloMessage;
   }
}
