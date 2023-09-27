package com.example.studentdal.repoTest;

import com.example.studentdal.entities.Project;
import com.example.studentdal.entities.User;
import com.example.studentdal.entities.UserProject;
import com.example.studentdal.repos.ProjectRepository;
import com.example.studentdal.repos.UserProjectRepository;
import com.example.studentdal.repos.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserProjectRepoTest {

    @Autowired
    private UserProjectRepository repo;


    // Assuming you have userRepo and projectRepo autowired in your test
    @Autowired
    private UserRepository userRepo;

    @Autowired
    private ProjectRepository projectRepo;

    @Test
    void testCreateUserProject() {
//        User user = new User();
//        user.setUserName("hello123");
//        user.setEmail("1234@1234.com");
//        user.setPassword("6789");
//        user = userRepo.save(user);  // user now has an ID from the database
//
//        // Create and save Project
//        Project project = new Project();
//        project.setProjectName("huihiuiuihj");
//        // ... set any required fields on project here ...
//        project = projectRepo.save(project);  // project now has an ID from the database
//
//        // Now, create UserProject and set User and Project on it
//        UserProject userProject = new UserProject();
//        userProject.setUserProjectId(1234l);
//        userProject.setProject(project);
//        userProject.setUser(user);
//        repo.save(userProject);
    }



}
