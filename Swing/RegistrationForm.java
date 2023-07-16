package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);

        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ทำสิ่งที่คุณต้องการเมื่อปุ่มถูกกด
                String name = nameField.getText();
                String email = emailField.getText();
                // ส่วนของการลงทะเบียนผู้ใช้งาน...
                System.out.println("Name: " + name);
                System.out.println("Email: " + email);
            }
        });

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(registerButton);

        frame.setVisible(true);
    }
}

/*
ในโค้ดนี้ เราสร้าง JFrame และเซ็ตขนาดของเฟรมเป็น 300x200 พร้อมกำหนดชื่อเฟรมเป็น "Registration Form" และเซ็ตการปิดแอปพลิเคชันเมื่อปิดหน้าต่าง

เราสร้างองค์ประกอบ JLabel และ JTextField เพื่อรับข้อมูลชื่อและอีเมล์ของผู้ใช้งาน

เราสร้าง JButton ในการลงทะเบียนและกำหนด ActionListener เพื่อทำงานเมื่อปุ่มถูกกด ในที่นี้ เราดึงข้อมูลจาก nameField และ emailField และทำการประมวลผลตามที่คุณต้องการ เช่น ลงทะเบียนผู้ใช้หรือแสดงข้อมูลผู้ใช้ที่ได้รับ

สุดท้าย เราแสดงหน้าต่าง JFrame ที่สร้างขึ้นให้แสดงผลบนหน้าจอ

อย่าลืมว่าตัวอย่างนี้ใช้ Java Swing เพื่อสร้างอินเตอร์เฟซกราฟิกส์เดสก์ท็อป และไม่ใช่เฟรมเวิร์กที่รองรับการสร้างแอปพลิเคชัน API หากคุณต้องการสร้าง API สำหรับการลงทะเบียนผู้ใช้งานควรใช้เฟรมเวิร์กที่เหมาะสมเช่น Spring Framework ตามขั้นตอนที่อธิบายไว้ในคำตอบก่อนหน้านี้
 */