package johnbryce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan("johnbryce")
@PropertySource("classpath:application.properties")
public class SpringConfiguration {

	@Autowired
	private Environment env;	

	@Bean("globals")
	public Globals getGlobals() {
		Globals g = new Globals();
		g.setServerAddress(env.getProperty("server-address"));
		g.setNumOfDiamonds((int)Integer.parseInt(env.getProperty("daimonds-capacity")));
		return g;
	}
}
