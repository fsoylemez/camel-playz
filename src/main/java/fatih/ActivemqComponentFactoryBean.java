package fatih;

import org.apache.activemq.camel.component.ActiveMQComponent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

/**
 * Created by fatihmehmetsoylemez on 01/10/16.
 */
public class ActivemqComponentFactoryBean {

    @Produces
    @ApplicationScoped
    @Named("activemq")
    public ActiveMQComponent createActiveMQComponent() {
        ActiveMQComponent answer = new ActiveMQComponent();
        answer.setBrokerURL("tcp://localhost:61616");
        return answer;
    }
}
