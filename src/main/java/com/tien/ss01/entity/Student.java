package com.tien.ss01.entity;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {
    private String id;
    private String fullName;
    private Boolean gender;
    private Date bod;
    private String address;
}
