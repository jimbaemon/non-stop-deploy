package tripko.nonstopdeploy.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class InitializingBeanSampleBean implements InitializingBean {
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("각종빈 주입중");
		Thread.sleep(30000);
	}
}
