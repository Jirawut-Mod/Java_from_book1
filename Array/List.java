package Array;

import java.util.*;
import java.text.Collator;

public class List {
    public static void main(String[] args) {
        
        int[] a = {21, 10, 1, 3, 56, 12};
        Arrays.sort(a);
        String[] word = {"ใน", "โอ่ง", "ไข่", "ไก่"};
        Arrays.sort(word);
        System.out.print(Arrays.asList(word));
        Locale locale = new Locale("th");
        Collator collator = Collator.getInstance(locale);
        Arrays.sort(word, collator);
        System.out.print(Arrays.asList(word));
    }
}

/*
ในคลาส List ในเมธอด main มีการประกาศและกำหนดค่าตัวแปร a เป็นอาร์เรย์ของตัวเลขแบบจำนวนเต็ม และ word เป็นอาร์เรย์ของคำศัพท์

เมื่อประกาศและกำหนดค่าตัวแปร a และ word แล้ว ใช้ Arrays.sort() เพื่อเรียงลำดับตัวเลขในอาร์เรย์ a และคำในอาร์เรย์ word ตามลำดับ

ต่อมาใช้ System.out.print(Arrays.asList(word)) เพื่อแปลงอาร์เรย์ word เป็นลิสต์และแสดงผลลัพธ์ทางหน้าจอ ซึ่งจะแสดงคำในอาร์เรย์ word ในลักษณะ [ใน, ไก่, ไข่, โอ่ง] ตามลำดับที่ถูกเรียงลำดับ

ในส่วนของโค้ด Locale locale = new Locale("th") สร้างอ็อบเจ็กต์ Locale โดยระบุ "th" เพื่อระบุภาษาเป็นภาษาไทย

หลังจากนั้น ใช้ Collator.getInstance(locale) เพื่อสร้างอ็อบเจ็กต์ Collator โดยระบุ locale เป็นพารามิเตอร์ เพื่อใช้ในการเรียงลำดับตามหลักการเรียงลำดับที่ถูกต้องในภาษาไทย

สุดท้าย ใช้ Arrays.sort(word, collator) เพื่อเรียงลำดับคำในอาร์เรย์ word โดยใช้ collator เป็นอาร์กิวเมนต์ เมื่อเรียงลำดับแล้ว ใช้ System.out.print(Arrays.asList(word)) เพื่อแปลงอาร์เรย์ word เป็นลิสต์และแสดงผลลัพธ์ทางหน้าจอ ซึ่งจะแสดงคำในอาร์เรย์ word ในลักษณะ [ไก่, ไข่, โอ่ง, ใน] ตามลำดับที่ถูกเรียงลำดับตามหลักการเรียงลำดับที่ถูกต้องในภาษาไทย

-------------------------------
[โอ่ง, ใน, ไก่, ไข่][ไก่, ไข่, ใน, โอ่ง]
-------------------------------
 */