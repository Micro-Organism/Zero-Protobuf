package com.zero.protobuf.controller;

import com.zero.protobuf.common.protobuf.PhoneNumJson;
import com.zero.protobuf.common.protobuf.ProtobufMessage;
import com.zero.protobuf.common.protobuf.StudentBuilder;
import com.zero.protobuf.common.protobuf.StudentJson;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProtobufController {
    @RequestMapping("/json/{id}")
    public StudentJson showHelloWorld(@PathVariable Integer id){
        StudentJson  studentJson = new StudentJson();
        studentJson.setId(id);
        studentJson.setFirstName("maxsm");
        studentJson.setLastName("sdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdfsdf");
        studentJson.setEmail("1224sdfsfsdf344552@163.com");
        PhoneNumJson phoneNumJson =  new PhoneNumJson();
        phoneNumJson.setNumber("12345sdfsdfsd6566666");
        phoneNumJson.setType(1);
        List<PhoneNumJson> list = new ArrayList<>();
        list.add(phoneNumJson);
        studentJson.setPhoneNumList(list);
        return studentJson;
    }

    @RequestMapping("/protobuf/{id}")
    ProtobufMessage.Student protobuf(@PathVariable Integer id) {
        return ProtobufMessage.Student.newBuilder().setId(id).setFirstName("maxsm")
                .setLastName("sdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdfsdf")
                .setEmail("1224sdfsfsdf344552@163.com")
                .addPhone(ProtobufMessage.Student.PhoneNumber.newBuilder().setNumber("12345sdfsdfsd6566666").setType(
                        ProtobufMessage.Student.PhoneType.MOBILE).build()).build();
    }

    @RequestMapping("/protobuf/{id}")
    StudentBuilder protobuf2(@PathVariable Integer id) {
        return StudentBuilder.builder().id(id).firstName("maxsm")
                .lastName("sdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdfsdf")
                .email("1224sdfsfsdf344552@163.com")
                .addPhone(StudentBuilder.PhoneNumber.builder().setNumber("12345sdfsdfsd6566666").setType(
                        StudentBuilder.PhoneType.MOBILE).build()).build();
    }


}