package com.example.student.course.Entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "student")
public class Student {




        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private  int studentid;

        @Column(length = 20 )
        private  String studentname;

        @Column
        private  int studentage ;

            public int getStudentid() {
                return studentid;
            }

            public void setStudentid(int studentid) {
                this.studentid = studentid;
            }

            public String getStudentname() {
                return studentname;
            }

            public void setStudentname(String studentname) {
                this.studentname = studentname;
            }

            public int getStudentage() {
                return studentage;
            }

            public void setStudentage(int studentage) {
                this.studentage = studentage;
            }




            @Override
            public String toString() {
                return "Student{" +
                        "studentid=" + studentid +
                        ", studentname='" + studentname + '\'' +
                        ", studentage=" + studentage +
                        '}';
    }

}
