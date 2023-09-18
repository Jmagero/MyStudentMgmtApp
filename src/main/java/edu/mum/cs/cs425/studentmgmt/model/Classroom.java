package edu.mum.cs.cs425.studentmgmt.model;

import javax.persistence.*;
import java.util.List;

@Entity

public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long classroomId;

    private String buildingName;

    private int roomNumber;

    @OneToMany
    List<Student> students;

}
