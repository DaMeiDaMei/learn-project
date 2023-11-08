package com.chinalife.springboot.jpa.eo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table( name =  "employee")
public class EmployeeEO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;

    private String title;
    @Column(name = "birth_date")
    private String birthDate;

    private String salary;


}
