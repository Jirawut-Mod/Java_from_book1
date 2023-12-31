package While;
public class C1_while {
    public static void main(String[] args) {
        double x = 0.0;  // โปรแกรมจะสร้างตัวแปร x และกำหนดค่าเริ่มต้นเป็น 0.0
        int times = 0;  // โปรแกรมจะสร้างตัวแปร times และกำหนดค่าเริ่มต้นเป็น 0 เพื่อนับจำนวนครั้งที่สุ่มตัวเลข
        while (x < 0.9) {  // โปรแกรมจะทำงานในลูป while ตราบใดที่ค่าของตัวแปร x น้อยกว่า 0.9
            x = Math.random();  // ภายในลูป while โปรแกรมจะสุ่มค่าตัวเลขใหม่ให้กับตัวแปร x โดยใช้เมธอด Math.random() เพื่อสร้างค่าที่อยู่ในช่วง 0.0 ถึง 1.0
            times += 1;  // โปรแกรมจะเพิ่มค่าของตัวแปร times ทีละ 1 เพื่อนับจำนวนครั้งที่สุ่มตัวเลข, เมื่อค่าของตัวแปร x เกินหรือเท่ากับ 0.9 ลูป while จะสิ้นสุดการทำงาน
        }
        System.out.printf("ต้องสุ่มทั้งหมด %d ครั้ง เพื่อให้ได้ค่าตั้งแต่ 0.9 ขึ้นไป", times);
        // โปรแกรมจะแสดงผลลัพธ์ด้วยคำสั่ง System.out.printf() โดยแสดงจำนวนครั้งที่สุ่มทั้งหมดในรูปแบบข้อความที่ระบุ โดยใช้ค่าของตัวแปร times
    }    
}

/*
ใช้สำหรับสุ่มตัวเลขแบบไม่จำกัดครั้งที่ต้องทำ จนกว่าค่าที่สุ่มได้จะมีค่ามากกว่าหรือเท่ากับ 0.9
ดังนั้น ผลลัพธ์ที่แสดงบนหน้าจอคือจำนวนครั้งที่ต้องสุ่มเพื่อให้ได้ค่าตั้งแต่ 0.9 ขึ้นไป ตามที่แสดงในข้อความที่ระบุ
 */