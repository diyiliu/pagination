import com.diyiliu.plugin.PaginationHelper;
import com.diyiliu.web.dao.UserDao;
import com.diyiliu.web.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description: PaginationTest
 * Author: DIYILIU
 * Update: 2015-12-07 17:01
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class PaginationTest {

    @Resource
    private UserDao userDao;

    @Test
    public void testPage() {

        PaginationHelper.page(1, 3);
        List<User> list = userDao.findUserByPage("小明");

        for (User user : list) {

            System.out.println(user.get("ID") + ", " +  user.get("NAME") + ", " + user.get("AGE"));
        }

        System.out.println("总页数：" + PaginationHelper.getPage().getMaxPage());
    }
}
