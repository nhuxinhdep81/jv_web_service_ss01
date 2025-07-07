package com.tien.ss01.repo;

import com.tien.ss01.entity.Student;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    private static List<Student> studentList = new ArrayList<>();

    static {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Student student1 = new Student("SV01", "Nguyễn Văn A", true, sdf.parse("2000-01-01"), "Hà Nội");
            Student student2 = new Student("SV02", "Trần Thị B", false, sdf.parse("2001-05-20"), "TP. HCM");
            Student student3 = new Student("SV03", "Lê Văn C", true, sdf.parse("1999-12-15"), "Đà Nẵng");
            Student student4 = new Student("SV04", "Phạm Thị D", false, sdf.parse("2002-03-10"), "Cần Thơ");
            Student student5 = new Student("SV05", "Hoàng Văn E", true, sdf.parse("2003-07-30"), "Huế");

            studentList.add(student1);
            studentList.add(student2);
            studentList.add(student3);
            studentList.add(student4);
            studentList.add(student5);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }

    public static List<Student> getStudentList() {
        return studentList;
    }

    private static boolean addStudent(Student student) {
        return studentList.add(student);
    }

    private static boolean updateStudent(Student student) {
        boolean b = studentList.stream().anyMatch(s -> s.getId().equals(student.getId()));
        if (!b)
            return false;
        for (Student s: studentList){
            if (s.getId().equals(student.getId())){
                studentList.remove(s);
                studentList.add(student);
                break;
            }
        }
        return true;
    }
    public static Student findStudentById(int id) {
        return studentList.stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);
    }
}
