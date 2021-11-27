package com.mit.travelmanagementsystembe.entity;

import com.mit.travelmanagementsystembe.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String staffId;
    private String name;
    private Integer age;
    private String mobileNo;
    private String sex;
    private String email;
    private String department;
    private String grade;
    private String supervisor;
    private String branch;

}
