package OOP;
public class Main_readOnly {
    public static void main(String[] args) {
        Program program = new Program();
        double v = program.VERSION;
        String p = program.PROGRAM_NAME;
        

        System.out.print(p + " " + v);
    }
}

/*
ในคลาส D1_oop_readOnly ในเมธอด main มีการสร้างอ็อบเจ็กต์ของคลาส D1_oop_program ด้วยการใช้คำสั่ง new D1_oop_program() เพื่อสร้างอ็อบเจ็กต์ชื่อ program จากนั้นก็มีการเข้าถึงและนำค่าของตัวแปร VERSION และ PROGRAM_NAME จากอ็อบเจ็กต์ program มาเก็บไว้ในตัวแปร v และ p ตามลำดับ

สุดท้ายใช้เมธอด System.out.print เพื่อแสดงผลลัพธ์ทางหน้าจอ โดยใส่ข้อความ "GreenRobot" และค่าของตัวแปร v โดยคั่นด้วยช่องว่าง โดยไม่มีเครื่องหมายเว้นบรรทัด
 */