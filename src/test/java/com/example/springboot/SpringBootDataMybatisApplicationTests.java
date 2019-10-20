package com.example.springboot;


import com.example.springboot.mapper.UserMapper;
import com.example.springboot.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



import java.util.List;

@SpringBootTest
class SpringBootDataMybatisApplicationTests {

   /* @Autowired
    DataSource dataSource;
    @Test
    void contextLoads() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println(dataSource.getClass());
        System.out.println(connection);
    }
*/
   @Autowired
    UserMapper userMapper;
   @Test
    void test(){
       List<User> userList = userMapper.getUserList();
       userList.forEach(user -> System.out.println(user));
   }
}
