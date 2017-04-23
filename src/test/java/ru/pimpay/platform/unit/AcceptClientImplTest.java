package ru.pimpay.platform.unit;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.pimpay.platform.client.AcceptClientParams;
import ru.pimpay.platform.service.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by ermolaev on 23/04/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/META-INF/spring/cxf-client.xml" })
public class AcceptClientImplTest {

    private static String ENDPOINT_ADDRESS = "http://localhost:9091/cnf/services/pimpay";

    @Autowired
    private AcceptClientImpl acceptClientBean;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        /* create a server endpoint for the Accept Client service */
        // create a JaxWsServerFactoryBean
        JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
        // set the mock implementation of the Accept Client service
        jaxWsServerFactoryBean.setServiceBean(new AcceptServerImplMock());
        // set the address at which the Accept Client endpoint will be exposed
        jaxWsServerFactoryBean.setAddress(ENDPOINT_ADDRESS);
        // create the server endpoint
        jaxWsServerFactoryBean.create();
    }

    @Test
    public void testAccept() {
        AcceptClientParams client = new AcceptClientParams();
        client.setTin("Tin-Tin");

        assertEquals("Tin-Tin",
            acceptClientBean.acceptClient("token", client));
    }
}
