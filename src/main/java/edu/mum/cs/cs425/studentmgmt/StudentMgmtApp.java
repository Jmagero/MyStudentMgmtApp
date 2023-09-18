package edu.mum.cs.cs425.studentmgmt;

import edu.mum.cs.cs425.studentmgmt.model.Classroom;
import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.model.Transcript;
import edu.mum.cs.cs425.studentmgmt.repository.IClassroomRepository;
import edu.mum.cs.cs425.studentmgmt.repository.IStudentRepository;
import edu.mum.cs.cs425.studentmgmt.repository.ITranscriptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class StudentMgmtApp implements CommandLineRunner
{
    @Autowired
    private IStudentRepository studentRepository;

    @Autowired
    private ITranscriptRepository transcriptRepository;

    @Autowired

    private IClassroomRepository classroomRepository;
    public static void main( String[] args )
    {
      SpringApplication.run(StudentMgmtApp.class,args);
    }


    @Override
    public void run(String... args) throws Exception {

        System.out.println("Welcome to StudentMgmtApp version 1.0");

        Student s1 = new Student(
                "000-61-0001",
                "Anna","Lynn" ,
                "Smith", 3.45,
                LocalDate.of(2019,5,24));

        Student savedStudent = studentRepository.save(s1);

        Transcript transcript = new Transcript("BS Computer Science");
        Transcript savedTrans = transcriptRepository.save(transcript);
        System.out.println(savedStudent);
        System.out.println("**********************");
        System.out.println(savedTrans);
        System.out.println("**********************");

        Classroom classroom = new Classroom("McLaughlin building", "M105");


        Classroom savedClassroom = classroomRepository.save(classroom);

        System.out.println(savedClassroom);

    }
}
