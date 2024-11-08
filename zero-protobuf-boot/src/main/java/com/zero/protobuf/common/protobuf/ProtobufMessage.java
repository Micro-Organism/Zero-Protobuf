package com.zero.protobuf.common.protobuf;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProtobufMessage {

    @Builder
    public class Student {
        private int id;
        private String firstName;
        private String lastName;
        private String email;
    }

}


