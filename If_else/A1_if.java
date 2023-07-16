package If_else;
import java.util.Scanner;    // นำเข้า รับค่าจากคีบอร์ด

public class  A1_if {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // นำเข้าคลาส Scanner และสร้างอ็อบเจ็กต์ scanner เพื่อใช้ในการอ่านค่าจากคีย์บอร์ด
            
            int min;  // ประกาศตัวแปร min เพื่อเก็บค่าตัวเลขที่น้อยที่สุด โดยกำหนดให้เท่ากับค่าของตัวเลขที่ผู้ใช้ป้อนเข้ามาในขั้นตอนที่ 3

            System.out.print("จำนวนที่ 1 >>> ");
            int n1 = scanner.nextInt();    /*  ให้ผู้ใช้ป้อนจำนวนที่ 1 โดยใช้เมธอด nextInt() ของอ็อบเจ็กต์ scanner และเก็บค่าในตัวแปร n1    โดยที่ min จะมีค่าเป็นค่าของ n1 */
            min = n1;

            System.out.print("จำนวนที่ 2 >>> ");
            int n2 = scanner.nextInt();     /* ให้ผู้ใช้ป้อนจำนวนที่ 2 โดยใช้เมธอด nextInt() ของอ็อบเจ็กต์ scanner และเก็บค่าในตัวแปร n2 ถ้า n2 น้อยกว่า min ให้ min เป็นค่าของ n2 */
            if (n2 < min) {
                min = n2;
            }

            System.out.print("จำนวนที่ 3 >>> ");
            int n3 = scanner.nextInt();    /* ให้ผู้ใช้ป้อนจำนวนที่ 3 โดยใช้เมธอด nextInt() ของอ็อบเจ็กต์ scanner และเก็บค่าในตัวแปร n3 ถ้า n3 น้อยกว่า min ให้ min เป็นค่าของ n3 */
            if (n3 < min) {
                min = n3;
            }

        System.out.println("\nจำนวนที่น้อยที่สุดคือ :" + min);   // แสดงผลลัพธ์ "จำนวนที่น้อยที่สุดคือ :" ตามด้วยค่าของตัวแปร min
        scanner.close();  // ปิดการใช้งานอ็อบเจ็กต์ scanner ด้วยเมธอด close()
    }
}

/* โค้ดนี้จะใช้วิธีการเปรียบเทียบตัวเลขที่ผู้ใช้ป้อนเข้ามาเพื่อหาตัวเลขที่น้อยที่สุด และแสดงค่านั้นออกทางหน้าจอ

----------------------------------
จำนวนที่ 1 >>> 86
จำนวนที่ 2 >>> 45
จำนวนที่ 3 >>> 23

จำนวนที่น้อยที่สุดคือ :23
----------------------------------

 */