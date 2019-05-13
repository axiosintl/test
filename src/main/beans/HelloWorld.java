package beans;

import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;

@ManagedBean(name = "helloWorld", eager = true)
@RequestScoped
public class HelloWorld {
    
   public HelloWorld() {
      System.out.println("*** Please work!");
   }
	
   public String getMessage() {
      return "*** Please work!!";
   }
}
