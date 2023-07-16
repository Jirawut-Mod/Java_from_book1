package Array;

public class Random_loop {
    public static void main(String[] args) {
        int[] nums = new int[5];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(100 * Math.random());
            sum += nums[i];
        }
        String str = "เลขที่สุ่มได้: \n";
        for (int x: nums) {
            str += x + "\n";
        }
        str += "ผลรวม: " + sum;
        System.out.print(str);
    }
}

/*
สร้างและดำเนินการกับอาร์เรย์ของตัวเลขแบบสุ่ม

ในคลาส Random_loop ในเมธอด main มีการประกาศตัวแปร nums ซึ่งเป็นอาร์เรย์ชนิด int ที่มีขนาด 5 ตำแหน่ง เป็นการสร้างอาร์เรย์ที่สามารถเก็บตัวเลขจำนวนเต็มได้ โดยตั้งค่าเริ่มต้นของทุกตำแหน่งในอาร์เรย์เป็น 0

ต่อมามีการประกาศตัวแปร sum ชนิด int เพื่อเก็บผลรวมของตัวเลขที่สุ่มได้

ในลูป for ที่ตำแหน่งแรก ตัวแปร i จะเริ่มจาก 0 และวนไปเรื่อยๆ จนถึงค่าน้อยกว่าความยาวของอาร์เรย์ nums.length ซึ่งในทุกรอบของลูป จะทำการสุ่มตัวเลขแล้วกำหนดค่าให้กับตำแหน่ง i ในอาร์เรย์ nums โดยใช้ฟังก์ชัน Math.random() เพื่อสร้างตัวเลขที่สุ่มในช่วง 0-1 และนำมาคูณด้วย 100 เพื่อให้ได้ตัวเลขในช่วง 0-100 และนำค่าที่ได้มาบวกกับ sum

ต่อมามีการสร้างตัวแปร str ชนิด String เพื่อเก็บข้อความที่จะแสดงผลลัพธ์ทางหน้าจอ และกำหนดค่าเริ่มต้นของ str เป็น "เลขที่สุ่มได้: \n"

ในลูป for-each จะวนรอบในอาร์เรย์ nums และสำหรับแต่ละตัวเลข x ในอาร์เรย์ จะทำการเพิ่ม x ในตัวแปร str พร้อมกับขึ้นบรรทัดใหม่

หลังจากลูป for-each จะทำการเพิ่มข้อความ "ผลรวม: " และค่าของตัวแปร sum เข้าไปในตัวแปร str

สุดท้ายใช้เมธอด System.out.print เพื่อแสดงผลลัพธ์ทางหน้าจอ โดยแสดงค่าของตัวแปร str ซึ่งเป็นข้อความที่สร้างขึ้นจากตัวเลขที่สุ่มได้และผลรวมของตัวเลข

--------------------------------
เลขที่สุ่มได้: 
16
81
90
82
59
ผลรวม: 328
--------------------------------
 */