package com.example.unittesting;

import static org.junit.Assert.assertNotNull;

import java.util.LinkedHashMap;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.websystique.springboot.controller.RestApiController;
import com.websystique.springboot.service.UserService;
import com.websystique.springboot.service.UserServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RestApiController.class)
@ContextConfiguration(classes={UserServiceImpl.class})
public class UnittestingApplicationTests {
	public static final String REST_SERVICE_URI = "http://localhost:8080/api";
	@Autowired 
	UserService userService;
	   /* GET */
    @Test
    public void listAllUsers(){
        System.out.println("Testing listAllUsers API-----------");
         
        RestTemplate restTemplate = new RestTemplate();
        List<LinkedHashMap<String, Object>> usersMap = restTemplate.getForObject(REST_SERVICE_URI+"/user/", List.class);
         
        if(usersMap!=null){
            for(LinkedHashMap<String, Object> map : usersMap){
                System.out.println("User : id="+map.get("id")+", Name="+map.get("name")+", Age="+map.get("age")+", Salary="+map.get("salary"));;
            }
        }else{
            System.out.println("No user exist----------");
        }
    }
    //@Test
    public void listUsers() {
    	userService.findAllUsers();
    	assertNotNull(userService.findAllUsers());
    }

}
