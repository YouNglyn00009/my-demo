package template;

import com.lyn.common.json.FastJsonUtil;
import com.lyn.common.json.JsonUtil;
import com.lyn.demo.design.pattern.annonation.analizer.ExcutorAnalizer;
import com.lyn.demo.design.pattern.template.enums.ModuleEnum;
import com.lyn.demo.design.pattern.template.param.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @Description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-main.xml"})
public class TemplateTest {

    @Resource
    private ExcutorAnalizer excutorAnalizer;


    @Test
    public void templateTest() {
        User user = new User();
        excutorAnalizer.excute(ModuleEnum.MOUDLE_AGE, user);
        excutorAnalizer.excute(ModuleEnum.MOUDLE_NAME, user);
        excutorAnalizer.excute(ModuleEnum.MOUDLE_SEX, user);
        System.out.println(user);
    }

    @Test
    public void timeTest() {
        User user = new User();
        System.out.println(JsonUtil.toJson(user));
    }

}
