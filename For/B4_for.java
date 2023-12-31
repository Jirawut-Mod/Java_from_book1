package For;
public class B4_for {
    public static void main(String[] args) {
        int sum = 0;  // โปรแกรมจะสร้างตัวแปร sum และกำหนดค่าเริ่มต้นเป็น 0
        for (int b = 100; b >= 1; b -= 10) {
            /*
            โปรแกรมจะทำงานในลูป for โดยตัวแปร b มีค่าเริ่มต้นเป็น 100
            ในแต่ละรอบของลูป for โปรแกรมจะกำหนดค่าของตัวแปร sum เป็นค่าของตัวแปร b ในแต่ละรอบของลูป
            โปรแกรมจะลดค่าของตัวแปร b ทีละ 10 ในแต่ละรอบของลูป
             */
            sum = b;  // เมื่อค่าของตัวแปร b น้อยกว่าหรือเท่ากับ 1 ลูป for จะสิ้นสุดการทำงาน
        }
        System.out.print(sum);   // โปรแกรมจะแสดงผลลัพธ์ของตัวแปร sum ด้วยคำสั่ง System.out.print(sum
    }
}

/*
แสดงผลลัพธ์ของตัวเลขในลูป for ที่ลดลงทีละ 10 ตั้งแต่ 100 ถึง 1
ดังนั้น ผลลัพธ์ที่แสดงบนหน้าจอคือค่าสุดท้ายของตัวแปร b ในลูป ซึ่งเป็นตัวเลขที่นับถอยหลังจาก 100 ลงมา 1 ก่อนที่ค่าของ b 
จะน้อยกว่าหรือเท่ากับ 1 ในที่นี้คือ 1
 */