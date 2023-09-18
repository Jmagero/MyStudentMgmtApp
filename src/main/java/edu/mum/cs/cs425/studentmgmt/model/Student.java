package edu.mum.cs.cs425.studentmgmt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Required;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long studentId;

    @Basic(optional = false)
    private String studentNumber;

    @Basic(optional = false)
    private String firstName;
    @Basic
    private String middleName;
    @Basic(optional = false)
    private String lastName;


    private double cgpa;

    @Temporal(TemporalType.DATE)
    private  LocalDate dateOfEnrollment;

//    @OneToOne
//    @JoinColumn(name = "transcript_id")
//    private  Transcript transcript;
}
