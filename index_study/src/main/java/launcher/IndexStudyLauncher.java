package launcher;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
 * @Description
 */
public class IndexStudyLauncher {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-main.xml");

        System.out.println("=======IndexStudyLauncher start successfully=======");

        CountDownLatch latch = new CountDownLatch(1);

        try {
            latch.await();
        } catch (InterruptedException e) {
            System.out.println("===========error======" + e.getMessage());
        }

    }

}
