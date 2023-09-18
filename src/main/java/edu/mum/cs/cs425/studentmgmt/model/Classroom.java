package edu.mum.cs.cs425.studentmgmt.model;

import javax.persistence.*;
import java.util.List;

@Entity

public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classroomId;

    private String buildingName;

    private String roomNumber;

    public Classroom(String buildingName, String roomNumber) {
        this.buildingName = buildingName;
        this.roomNumber = roomNumber;
    }
}
