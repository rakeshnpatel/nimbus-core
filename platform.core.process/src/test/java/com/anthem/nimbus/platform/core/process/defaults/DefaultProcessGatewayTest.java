/**
 * 
 */
package com.anthem.nimbus.platform.core.process.defaults;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.anthem.oss.nimbus.core.domain.command.execution.DefaultCommandExecutorGateway;

/**
 * @author Soham Chakravarti
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = {BPMEngineConfig.class})
@ActiveProfiles("local")
public class DefaultProcessGatewayTest {

	@Autowired @Qualifier("default.processGateway")
	DefaultCommandExecutorGateway processGateway;
	
	
	@Test
	public void t_() {
		assertNotNull(processGateway);
		assertNotNull(processGateway.getDelegates());
	}
}
