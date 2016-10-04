package fatih;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import javax.inject.Named;

@Named("myProcessor")
public class MyProcessor implements Processor {
  public void process(Exchange exchange) throws Exception {
    System.out.println("asdsad");
  }
}