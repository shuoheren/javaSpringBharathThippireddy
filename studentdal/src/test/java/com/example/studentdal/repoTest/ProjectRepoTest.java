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
        project.setProjectName("John's thrid shot");
        repo.save(project);
    }
    @Test
	void testFindProjectById(){
		Project project=repo.findById(4l).get();
		System.out.println(project);
	}

    @Test
    void testDeleteProject(){
		Project project =repo.findById(4l).get();
        System.out.println(project);
		repo.delete(project);
	}

}
