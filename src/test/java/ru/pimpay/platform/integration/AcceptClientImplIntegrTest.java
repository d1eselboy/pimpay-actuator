package ru.pimpay.platform.integration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.pimpay.platform.client.AcceptClientParams;
import ru.pimpay.platform.service.AcceptClientImpl;

import static org.junit.Assert.assertEquals;

/**
 * Created by ermolaev on 23/04/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/META-INF/spring/cxf-client-integration.xml"})
public class AcceptClientImplIntegrTest {

    @Autowired
    private AcceptClientImpl acceptClientBean;

    @Test
    public void testAccept() {
        AcceptClientParams client = new AcceptClientParams();
        client.setLegalEntityName("OOO Test");
        client.setTin("1234567890");
        client.setShopName("Shop name");
        client.setEmail("asdasd@asd.ru");
        client.setMobile("89161234567");

        assertEquals("Tin-Tin",
            acceptClientBean.acceptClient("48115414881b3f9c91f2de2d296752c9d2f570d3bf703bd879c73a7343a140bf50d6e640", client));
    }
}