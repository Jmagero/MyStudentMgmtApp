package edu.mum.cs.cs425.studentmgmt.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Transcript {
    @Id
    private Long transcriptId;
    private String degreeTitle;

    @OneToOne(mappedBy = "transcript")
    private Student student;

}
