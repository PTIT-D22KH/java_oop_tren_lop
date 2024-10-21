/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so_nguyen_thuy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author P51
 */
/*
Cho số nguyên N. Nhiệm vụ của bạn hãy đưa ra N số nguyên thủy đầu tiên theo thứ tự từ nhỏ đến lớn.

Số K được gọi là số nguyên thủy nếu số đó thỏa mãn tất cả các điều kiện:

Số các chữ số của K là một số chẵn.
Tất cả các chữ số của K chỉ bao gồm số 4 hoặc 5.
K là một số đối xứng.
Input:

Dòng đầu tiên đưa vào số lượng test T.
Dòng tiếp theo đưa vào các bộ test. Mỗi bộ test được là một số N được viết trên một dòng.
T, N thỏa mãn ràng buộc: 1≤T≤100; 1≤N≤104.
Output:

Đưa ra kết quả mỗi test theo từng dòng.
Ví dụ:

   

Input



2

4

10
Output
44 55 4444 4554

44 55 4444 4554 5445 5555 444444 445544 454454 455554
*/
public class SoNguyenThuy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            LinkedList<String> a = new LinkedList<>();
            
            a.addLast("4");
            a.addLast("5");
//            for (String x : a) {
//                System.out.println(x);
//            }
            ArrayList<String> b = new ArrayList<>();
            while(b.size() <= n) {
                String s = a.getFirst();
//                System.out.println(s);
                b.add(s);
                a.removeFirst();
                String s1 = s.concat("4");
                String s2 = s.concat("5");
//                System.out.println(s1);
//                System.out.println(s2);
                a.addLast(s1);
                a.addLast(s2);
            }
            ArrayList<String> res = new ArrayList<>();
            int count = 0;
            for (String x : b) {
                StringBuilder temp = new StringBuilder();
                for (int i = x.length() - 1; i >= 0; i--) {
                    temp.append(x.charAt(i));
                }
                count++;
                if(count <= n) {
                    System.out.print(x.concat(temp.toString()) + " ");
                }
                
                        
            }
            System.out.println();
        }
        
                
    }
}
