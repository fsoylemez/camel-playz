package fatih;

import org.apache.camel.Endpoint;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.cdi.Uri;

import javax.inject.Inject;

/**
 * Created by fatihmehmetsoylemez on 01/10/16.
 */
public class FileToActivemqRoute extends RouteBuilder{

    @Inject
    @Uri("file:src/data?noop=true")
    Endpoint fileEndpoint;

    @Inject
    @Uri("activemq:personnel.records")
    Endpoint activemqEndpoint;

    @Override
    public void configure() throws Exception {
        from(fileEndpoint)
                .log("Sending message [${body}] to JMS...")
                .to(activemqEndpoint);

/*        from(activemqEndpoint)
                .log("Sending message [${body}] to JMS...")
                .to(fileEndpoint);*/
    }
}
