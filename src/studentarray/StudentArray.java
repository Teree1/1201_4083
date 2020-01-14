/*
 * Teree Williams
 * 991575595
 * Computer Systems Technician - Software Engineering
 */
package studentarray;

import java.util.Scanner;

/**
 * soz m8
 * @author Teree
 */
public class StudentArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        student[] s1 = new student[5];
//        student s1 = new student();
//        student s2 = new student();
//        student s3 = new student();
//        student s4 = new student();
//        student s5 = new student();
//        String m = in.nextLine();
//        s1.setName(m);
//        String n = in.nextLine();
//        s2.setName(n);
//        String o = in.nextLine();
//        s3.setName(o);
//        String p = in.nextLine();
//        s4.setName(p);
//        String q = in.nextLine();
//        s5.setName(q);
        for(int i = 0; i < s1.length; i++){
            s1[i] = new student();
            System.out.println("Enter Name ");
            s1[i].setName(in.next());
        }
        for (student item : s1){
        System.out.println("Name: " + item.getName());

        }
            
//        System.out.println("Student 1: " + s1.getName());
//        System.out.println("Student 2: " + s2.getName());
//        System.out.println("Student 3: " + s3.getName());
//        System.out.println("Student 4: " + s4.getName());
//        System.out.println("Student 5: " + s5.getName());
    
    }
}
