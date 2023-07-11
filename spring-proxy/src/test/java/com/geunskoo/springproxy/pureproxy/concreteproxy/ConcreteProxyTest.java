package com.geunskoo.springproxy.pureproxy.concreteproxy;

import com.geunskoo.springproxy.pureproxy.concreteproxy.code.ConcreteClient;
import com.geunskoo.springproxy.pureproxy.concreteproxy.code.ConcreteLogic;
import com.geunskoo.springproxy.pureproxy.concreteproxy.code.TimeProxy;
import org.junit.jupiter.api.Test;

public class ConcreteProxyTest {

    @Test
    void noProxy() {
        ConcreteLogic concreteLogic = new ConcreteLogic();
        ConcreteClient client = new ConcreteClient(concreteLogic);
        client.execute();
    }

    @Test
    void addProxy() {
        ConcreteLogic concreteLogic = new ConcreteLogic();
        TimeProxy timeProxy = new TimeProxy(concreteLogic);
        ConcreteClient client = new ConcreteClient(timeProxy);
        client.execute();
    }
}
