package com.example.studentdal.repoTest;
import com.example.studentdal.entities.User;
import com.example.studentdal.repos.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserRepoTest {

    @Autowired
    private UserRepository repo;


    @Test
    void testCreateProject() {
        User user=new User();
        user.setUserName("JohnS");
        user.setEmail("abcde@gmail.com");
        user.setPassword("1234");
        repo.save(user);
    }


}

