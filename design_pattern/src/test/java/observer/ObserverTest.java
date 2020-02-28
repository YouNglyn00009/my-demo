package observer;

import com.lyn.demo.design.pattern.enums.MarkEnum;
import com.lyn.demo.design.pattern.observer.abstracts.Student;
import com.lyn.demo.design.pattern.observer.abstracts.Teacher;
import com.lyn.demo.design.pattern.observer.impl.MathTeacher;
import com.lyn.demo.design.pattern.observer.impl.StudentImpl;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description
 */
public class ObserverTest {


    @Test
    public void observerTest() {

        Student studentA = new StudentImpl("StudentA");
        Student studentB = new StudentImpl("StudentB");

        Set<Student> students = new HashSet<Student>();
        students.add(studentA);
        students.add(studentB);

        Teacher mathTeacher = new MathTeacher();
        mathTeacher.setTeacherName("数学老师");
        mathTeacher.setObserverSet(students);

        mathTeacher.sendMsg("考试结束！");
    }

    @Test
    public void byteTest() {
        System.out.println(Byte.valueOf(String.valueOf(MarkEnum.IS_RELIEVED_SEND_2.getKey())));
    }

}
