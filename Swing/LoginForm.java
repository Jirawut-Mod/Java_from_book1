package Swing;

import javax.swing.*;

class LoginForm {
    public static void main(String[] args) {

        // สร้างเฟรมเวิร์ก (JFrame)
        JFrame frame = new JFrame("Login Form");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        
        // สร้างป้ายชื่อผู้ใช้ (JLabel) และตั้งค่าตำแหน่งและขนาด
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(20, 30, 80, 25);
        frame.add(userLabel);

        // สร้างช่องข้อมูลชื่อผู้ใช้ (JTextField)
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 30, 165, 25);
        frame.add(userText);

        // สร้างป้ายรหัสผ่าน (JLabel) และตั้งค่าตำแหน่งและขนาด
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(20, 60, 80, 25);
        frame.add(passwordLabel);

        // สร้างช่องข้อมูลรหัสผ่าน (JPasswordField)
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 60, 165, 25);
        frame.add(passwordText);

        // สร้างปุ่มเข้าสู่ระบบ (JButton) และตั้งค่าตำแหน่งและขนาด
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100, 100, 80, 25);
        frame.add(loginButton);

        // แสดงเฟรมเวิร์ก
        frame.setVisible(true);
        }
}

/*
ในโค้ดนี้ เราสร้างหน้าต่าง JFrame ที่มีขนาด 300x200 พร้อมกำหนดชื่อเฟรมเป็น "Login Form" และเซตการปิดแอปพลิเคชันเมื่อปิดหน้าต่าง

เราสร้างองค์ประกอบต่าง ๆ บนหน้าต่าง JFrame โดยใช้ตัวอักษรในการแสดงป้ายชื่อผู้ใช้ (JLabel) และรหัสผ่าน (JPasswordField) และสร้างช่องข้อมูลเพื่อให้ผู้ใช้ป้อนชื่อผู้ใช้และรหัสผ่าน โดยใช้ JTextField และ JPasswordField ตามลำดับ

เรายังสร้างปุ่ม JButton เพื่อเข้าสู่ระบบและตั้งค่าตำแหน่งและขนาดของปุ่มดังกล่าว

สุดท้าย เราแสดงหน้าต่าง JFrame ที่สร้างขึ้นให้แสดงผลบนหน้าจอ

อย่าลืมว่าตัวอย่างนี้เป็นตัวอย่างเบื้องต้นในการสร้างหน้าต่างเข้าสู่ระบบ คุณสามารถปรับปรุงและเพิ่มคุณสมบัติเพื่อให้เหมาะสมกับความต้องการของคุณได้
 */