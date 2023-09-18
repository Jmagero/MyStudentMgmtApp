package edu.mum.cs.cs425.studentmgmt;

import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class StudentMgmtApp
{

    public static void main( String[] args )
    {

        Student s1 = new Student( 1L,
                "000-61-0001",
                "Anna","Lynn" ,
                "Smith", 3.45,
                LocalDate.of(2019,5,24));


    }


}
