package org.antwalk;

import org.antwalk.account.Current;
import org.antwalk.account.Savings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.antwalk") //where to scan to get components i.e org.antwalk has everything about our package
public class AppConfig {
//	@Bean("savings")
//	public Savings getSavings() {
//		return new Savings();
//	}
//	
//	@Bean("current")
//	public Current getCurrent() {
//		return new Current();
//	}
}
