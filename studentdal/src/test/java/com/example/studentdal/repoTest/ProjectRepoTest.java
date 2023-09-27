package com.example.studentdal.repoTest;
import com.example.studentdal.entities.Project;
import com.example.studentdal.repos.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProjectRepoTest {

    @Autowired
    private ProjectRepository repo;


    @Test
    void testCreateProject() {
        Project project =new Project();
        project.setProjectName("John's second shot");
        repo.save(project);
    }


}
