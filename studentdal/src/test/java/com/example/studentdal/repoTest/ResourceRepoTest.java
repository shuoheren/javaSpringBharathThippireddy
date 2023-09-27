package com.example.studentdal.repoTest;
import com.example.studentdal.entities.Resource;
import com.example.studentdal.repos.ResourceRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ResourceRepoTest {

    @Autowired
    private ResourceRepository repo;


    @Test
    void testCreateProject() {
        Resource resource=new Resource();
        resource.setResourceName("John's first shot");
        repo.save(resource);
    }


}

