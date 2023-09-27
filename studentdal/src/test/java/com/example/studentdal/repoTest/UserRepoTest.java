package com.example.studentdal.repoTest;
import com.example.studentdal.entities.Resource;
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
    void testCreateUser() {
        User user=new User();
        user.setUserName("SH");
        user.setEmail("abcde@outlook.com");
        user.setPassword("1234");
        repo.save(user);
    }

    @Test
    void testFindUserById(){
        User user=repo.findById("SH").get();
        System.out.println(user);
    }

    @Test
    void testDeleteUser(){
        User user =repo.findById("SH").get();
        System.out.println(user);
        repo.delete(user);
    }

}

