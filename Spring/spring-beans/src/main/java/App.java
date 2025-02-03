import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mandar.cars.GLE;
import com.mandar.cars.Swift;
import com.mandar.interfaces.Car;

public class App {

	public static void main(String[] args) {
		
//		Car swift = new Swift();
//		swift.specs();
//		
//		Car gle = new GLE();
//		gle.specs();
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car myCar = context.getBean("swift", Car.class);
		myCar.specs();
		
		
		
	}
	
}
