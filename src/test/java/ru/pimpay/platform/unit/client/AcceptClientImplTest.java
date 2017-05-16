package ru.pimpay.platform.unit.client;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.pimpay.platform.client.AcceptClientParams;
import ru.pimpay.platform.service.*;
import ru.pimpay.platform.unit.server.AcceptServerImplMock;

import static org.junit.Assert.assertEquals;

/**
 * Created by ermolaev on 23/04/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/META-INF/spring/cxf-client-unit.xml" })
public class AcceptClientImplTest {

    private static String ENDPOINT_ADDRESS = "http://localhost:9091/cnf/services/pimpay";

    @Autowired
    private AcceptClientImpl acceptClientBean;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
        jaxWsServerFactoryBean.setServiceBean(new AcceptServerImplMock());
        jaxWsServerFactoryBean.setAddress(ENDPOINT_ADDRESS);
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
