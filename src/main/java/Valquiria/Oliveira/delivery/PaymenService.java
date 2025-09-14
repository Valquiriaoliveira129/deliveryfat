import org.hibernart.annotations.TimeZaneStaorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.service;

import jakarta.transaction.transactional;

@service
pubic void processPayment{long orderid}{


}
@Autowired
private PaymentService paymentService;


@SpringoBootService
public class PaymenService{
 @Autowired
 private PaymentService PaymentService;

 @Test
 vold testConcurrentPayment()  throws InterruptedException{
    Runnable task = -> paymentService .processPayment (1L); 

    Thread t1 = new Thread(task);
    Thread t2 = new Thread(task);

    t1 start();
    t2 start();
    t1.join();
    t2.join();


 }

}