import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mandar.cars.GLE;
import com.mandar.cars.Swift;
import com.mandar.interfaces.Engine;
import com.mandar.specs.EngineType;

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

	@Bean("enginetype")
	public EngineType engineType() {
		return new EngineType();
	}

}
