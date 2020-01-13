package observer;

import com.lyn.demo.design.pattern.observer.abstracts.Teacher;
import com.lyn.demo.design.pattern.observer.annonation.InitObserver;
import com.lyn.demo.design.pattern.observer.impl.MathTeacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-main.xml"})
public class ObserverTest {

    @Resource
    private InitObserver initObserver;

    @Test
    public void observerTest() {
        Teacher mathTeacher = new MathTeacher(initObserver);
        mathTeacher.setTeacherName("数学老师");
        mathTeacher.sendMsg("考试结束！");
    }

}
