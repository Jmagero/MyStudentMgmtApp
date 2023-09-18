package edu.mum.cs.cs425.studentmgmt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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

    private  LocalDate dateOfEnrollment;

    public Student(String studentNumber, String firstName, String middleName, String lastName, double cgpa, LocalDate dateOfEnrollment) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.dateOfEnrollment = dateOfEnrollment;
    }

    @OneToOne
    @JoinColumn(name = "transcript_id")
    private  Transcript transcript;

    @ManyToOne
    @JoinTable(name = "classroom_id")
    private  Classroom classroom;
}
