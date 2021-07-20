package com.employee.leave.managment;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@SpringBootTest

public class TestWebApp extends EmployeeleavemanagmentApplicationTests {

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Before
    public void setup() {

        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }
    public void TestEmployee() throws Exception {
        mockMvc.perform(get("/employee")).andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.FirstName").value("dinesh"))
                .andExpect(jsonPath("$.LastName").value("sawake"))
                .andExpect(jsonPath("$.salary").value(3000));
        //.andExpect(jsonPath("$.mobileNumber").value(9657476))
        //.andExpect(jsonPath("$.currentAddress").value("pune"))
        //.andExpect(jsonPath("$.permanentAddress").value("washim"))
        //.andExpect(jsonPath("$.aaddharNumber").value("123"))
        //.andExpect(jsonPath("$.bankAccountNumber").value("301"))
        //.andExpect(jsonPath("$.bloodGroup").value("o"))
        //.andExpect(jsonPath("$.emailId").value("dineshsawake@gmail.com"));


    }

}
