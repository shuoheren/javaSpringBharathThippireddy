package com.example.studentdal.repoTest;
import com.example.studentdal.entities.Project;
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
    void testCreateResource() {
        Resource resource=new Resource();
        resource.setResourceName("John's resource1907");
        repo.save(resource);
    }

    @Test
    void testFindResourceById(){
        Resource resource=repo.findById(2l).get();
        System.out.println(resource);
    }

    @Test
    void testDeleteResource(){
        Resource resource =repo.findById(2l).get();
        System.out.println(resource);
        repo.delete(resource);
    }


}

