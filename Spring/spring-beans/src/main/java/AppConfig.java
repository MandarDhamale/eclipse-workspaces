import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mandar.cars.GLE;
import com.mandar.cars.Swift;
import com.mandar.interfaces.Engine;
import com.mandar.specs.V6;
import com.mandar.specs.V8;

@Configuration
@ComponentScan("com.mandar")
public class AppConfig {
	
	@Bean("gle")
	public GLE gle() {
		return new GLE();
	}
	
	@Bean("swift")
	public Swift swift() {
		return new Swift();
	}
	
	@Bean("v6")
	public V6 v6() {
		return new V6();
	}
	
	@Bean("v8")
	public V8 v8() {
		return new V8();
	}
	
	@Bean("engine")
	public Engine engine() {
		return new Engine() {
			
			@Override
			public String specs() {
				return "new enginee";
		};
	};
	

}
}
