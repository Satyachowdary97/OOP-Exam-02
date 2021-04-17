/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

import java.util.Date;

/**
 *
 * @author Sai Satyanarayana Gullapalli
 */
public class MainDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date d = new Date();
        Person personDetail = new Person("Satya", "Hyderabad",
                989898989, "satya@gmail.com");
        Student studentDetail = new Student(8.5, "Surya", "Vijayawada",
                123456789, "surya@gmail.com");
        Employee employeeDetail = new Employee("Vignan", 10000, d, "Vishnu",
                "Guntur", 654321, "vishnu@gmail.com");
        Staff staffDetail = new Staff("Professor", "Department", 10000, d,
                "Vishal", "JNTU", 12345678, "r@gmail.com");
        Faculty facultyDetail = new Faculty(10, 8, "Class Room", 100000, d,
                "Satish", "Vignan", 987654321, "GSS@gmail.com");

        System.out.println(personDetail);
        System.out.println(studentDetail);
        System.out.println(employeeDetail);
        System.out.println(staffDetail);
        System.out.println(facultyDetail);
    }

}
