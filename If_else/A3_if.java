package If_else;
class A3_if {
    public static void main(String[] args) {

        boolean isLeapYear = false;  // ประกาศตัวแปร isLeapYear และกำหนดค่าเริ่มต้นเป็น false (ไม่เป็นปีอธิกสุรทิน)
        int numDaysInYear;   // ประกาศตัวแปร numDaysInYear ที่ยังไม่มีค่าเริ่มต้น
        if (!isLeapYear) {  // เริ่มต้นตรวจสอบเงื่อนไขว่า isLeapYear เป็นเท็จหรือไม่ ด้วยเงื่อนไข !isLeapYear (ค่าตรงข้ามของ isLeapYear)
            numDaysInYear = 365; // ถ้าเงื่อนไขเป็นจริง (ค่าของ isLeapYear เป็นเท็จ) กำหนดค่า numDaysInYear เป็น 365 (จำนวนวันในปีไม่เป็นปีอธิกสุรทิน)
        } else { 
            numDaysInYear = 366; // ถ้าเงื่อนไขเป็นเท็จ (ค่าของ isLeapYear เป็นจริง) กำหนดค่า numDaysInYear เป็น 366 (จำนวนวันในปีเป็นปีอธิกสุรทิน)
        }
        System.out.print("ปีนี้มี " + numDaysInYear);   // แสดงผลลัพธ์โดยพิมพ์ข้อความ "ปีนี้มี " ตามด้วยค่าของตัวแปร numDaysInYear 
    }
}

/*
โค้ดนี้ใช้เงื่อนไขเพื่อกำหนดค่าของตัวแปร numDaysInYear ตามค่าของ isLeapYear ถ้า isLeapYear เป็นเท็จจะกำหนดค่า numDaysInYear เป็น 365 และถ้า isLeapYear เป็นจริงจะกำหนดค่า numDaysInYear เป็น 366 และในที่นี้โปรแกรมได้แสดงผลลัพธ์ว่า "ปีนี้มี " ตามด้วยค่าของ numDaysInYear
 */