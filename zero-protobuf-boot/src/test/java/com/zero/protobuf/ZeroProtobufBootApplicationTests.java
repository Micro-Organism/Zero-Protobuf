package com.zero.protobuf;

import com.zero.protobuf.common.protobuf.ProtobufMessage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class ZeroProtobufBootApplicationTests {

    // Other declarations
    private static final String COURSE1_URL = "http://localhost:8080/protobuf/1";

    @Autowired
    private RestTemplate restTemplate ;

    @Test
    public void whenUsingRestTemplate_thenSucceed() {

        ResponseEntity<ProtobufMessage.Student> student = restTemplate.getForEntity(COURSE1_URL, ProtobufMessage.Student.class);
        System.out.println(student.toString());
    }

}
