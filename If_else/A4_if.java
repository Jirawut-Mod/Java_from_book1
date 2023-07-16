package If_else;
public class A4_if {
    public static void main(String[] args) {

        byte manUnitedGoals = 3;  // ประกาศตัวแปร manUnitedGoals และกำหนดค่าเริ่มต้นเป็น 3 (จำนวนประตูที่ทีม ManUnited ทำได้)
        byte liverpoolGoals = 2;  // ประกาศตัวแปร liverpoolGoals และกำหนดค่าเริ่มต้นเป็น 2 (จำนวนประตูที่ทีม Liverpool ทำได้)

        if (manUnitedGoals > liverpoolGoals) {  // เริ่มต้นตรวจสอบเงื่อนไขว่า manUnitedGoals มากกว่า liverpoolGoals ด้วยเงื่อนไข manUnitedGoals > liverpoolGoals
            System.out.println("ManUnited ชนะ");  // ถ้าเงื่อนไขเป็นจริง (จำนวนประตูที่ทีม ManUnited มากกว่าทีม Liverpool) แสดงผลลัพธ์ว่า "ManUnited ชนะ"
        } else if (manUnitedGoals < liverpoolGoals) { 
            System.out.println("Liverpool ชนะ"); // ถ้าเงื่อนไขเป็นเท็จ (จำนวนประตูที่ทีม ManUnited น้อยกว่าทีม Liverpool) แสดงผลลัพธ์ว่า "Liverpool ชนะ"
        } else {
            System.out.println("เสมอกัน"); // ถ้าไม่เข้าเงื่อนไขที่ 4 และ 5 (จำนวนประตูที่ทีม ManUnited เท่ากับทีม Liverpool) แสดงผลลัพธ์ว่า "เสมอกัน"
        }
    }
}

/* โค้ดนี้ใช้เงื่อนไขเพื่อเปรียบเทียบจำนวนประตูที่ทีม ManUnited และทีม Liverpool ทำได้ และแสดงผลลัพธ์ตามผลลัพธ์ของการเปรียบเทียบนี้ ถ้า manUnitedGoals มากกว่า liverpoolGoals จะแสดงผลว่า "ManUnited ชนะ" ถ้า manUnitedGoals น้อยกว่า liverpoolGoals จะแสดงผลว่า "Liverpool ชนะ" และถ้าทั้งสองค่าเท่ากันจะแสดงผลว่า "เสมอกัน" */
