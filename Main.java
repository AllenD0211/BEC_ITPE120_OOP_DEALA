package com.bec.oop;

import com.bec.oop.utils.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Main {

    static Connection conn;
    static Database db = new Database();

    public static void main(String[] args) {
        Students s1 = new Students();
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter lastname: ");
//        String lastname = scan.nextLine();

//        viewAll();
//        viewStudent(lastname);
        deleteStudent("1");
    }
    public static void insertStudent(String firstname, String lastname) {
        try {
            String sql = "INSERT INTO students (firstname, lastname) VALUES (?, ?)";
            conn = db.connect();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, firstname);
            ps.setString(2, lastname);

            int result = ps.executeUpdate();
            if (result > 0) {
                System.out.println("Student inserted.");
            } else {
                System.out.println("There were errors while inserting the student.");
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void updateStudent(String id, String firstname, String lastname) {
        try {
            String sql = "UPDATE students SET firstname = ?, lastname = ? WHERE id = ?";
            conn = db.connect();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, firstname);
            ps.setString(2, lastname);
            ps.setString(3, id);

            int result = ps.executeUpdate();
            if (result > 0) {
                System.out.println("Student updated.");
            } else {
                System.out.println("There were errors while updating the student.");
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    public static void viewAll() {
        try {
            String sql = "SELECT * FROM students";
            conn = db.connect();
//            Statement st = conn.createStatement();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("firstname") + " " + rs.getString("lastname"));
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }

    public static void viewStudent(String lastname) {
        try {
            String sql = "SELECT * FROM students WHERE lastname = '" + lastname + "'";
            conn = db.connect();
//            Statement st = conn.createStatement();
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("firstname") + " " + rs.getString("lastname"));
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }

    public static void deleteStudent(String id) {
        try {
            String sql = "DELETE FROM students WHERE id = '" + id + "'";
            conn = db.connect();
//            Statement st = conn.createStatement();
            PreparedStatement ps = conn.prepareStatement(sql);

            int result = ps.executeUpdate();
            if (result > 0  ) {
                System.out.println("Student deleted.");
            } else {
                System.out.println("There were errors while deleting the student.");
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }
    //update student set firstname = ?, lastname = ?, address = ? where id = ?
    //insert into student (firstname,lastname, address) values("",)

}
