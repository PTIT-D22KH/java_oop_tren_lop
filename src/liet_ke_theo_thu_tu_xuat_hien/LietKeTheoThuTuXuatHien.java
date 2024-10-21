/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package liet_ke_theo_thu_tu_xuat_hien;

import java.io.ObjectInputStream;

/**
 *
 * @author P51
 */
/*
Cho file nhị phân NHIPHAN.in chứa một ArrayList<String>. Mỗi String trong danh sách có thể có nhiều từ. 

Cho file văn bản VANBAN.in có tối đa 200 dòng văn bản.

Hãy liệt kê các từ khác nhau xuất hiện trong cả hai file theo thứ tự xuất hiện trong file VANBAN.in.

Input

Hai file NHIPHAN.in và VANBAN.in theo mô tả.

Output

Danh sách các từ khác nhau xuất hiện trong cả hai file theo thứ tự xuất hiện trong file VANBAN.in. Mỗi từ trên một dòng.

Chú ý: Tất cả các từ đều phải chuyển về dạng chữ viết thường.
*/
import java.util.*;
import java.io.*;
public class LietKeTheoThuTuXuatHien {
    public static void main(String[] args) throws  IOException, ClassNotFoundException{
        ObjectInputStream input1 = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        Scanner input2 = new Scanner(new File("VANBAN.in"));
        
        ArrayList<String> a = (ArrayList<String>)input1.readObject();
        Set<String> se = new HashSet<>();
        for (String x : a) {
            String b[] = x.trim().split("\\s+");
            for (String c : b) {
                se.add(c.toLowerCase());
            }
            
        }
        
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        while (input2.hasNextLine()) {
            String s = input2.nextLine();
            String temp[] = s.trim().toLowerCase().split("\\s+");
            for (String x : temp) {
                if(se.contains(x) && !lhs.contains(x)) {
                    lhs.add(x);
                }
            }
            
            
        }
        for (String x : lhs) {
            System.out.println(x);
        }
        
    }
}
