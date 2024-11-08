package com.zero.protobuf.common.protobuf;

import lombok.Data;

import java.util.List;

@Data
public class StudentJson {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private List<PhoneNumJson> phoneNumList;
}
