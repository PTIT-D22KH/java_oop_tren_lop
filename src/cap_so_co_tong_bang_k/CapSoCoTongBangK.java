/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap_so_co_tong_bang_k;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author P51
 */
/*
Cho dãy số A[] gồm có N phần tử.

Nhiệm vụ của bạn là đếm xem có bao nhiêu cặp (i, j) mà A[i] + A[j] = K cho trước.

Input:

Dòng đầu tiên là số lượng bộ test T (T ≤ 10).
Mỗi test gồm số nguyên N và K (1≤ N ≤ 100 000, 0 ≤ K ≤ 109).
Dòng tiếp theo gồm N số nguyên A[i] (0 ≤ A[i] ≤ 1018).
Output: 

Với mỗi test, in ra trên một dòng là đáp án thu được.

Ví dụ:

Input:


4

4 6

1 5 7 -1

5 6

1 5 7 -1 5

4 2

1 1 1 1

13 11

10 12 10 15 -1 7 6 5 4 2 1 1 1
Output

2

3

6

9
*/
public class CapSoCoTongBangK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int  k = input.nextInt();
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = input.nextLong();
            }
            HashMap<Long, Long> map = new HashMap<>();
            long res = 0;
            for (int i = 0; i < n; i++) {
                long temp = k - a[i];
                if (map.containsKey(temp)) {
                    res += map.get(temp);
                }
                if (map.containsKey(a[i])) {
                    map.put(a[i], map.get(a[i]) + 1);
                } else {
                    map.put(a[i], 1L);
                }

            }
            System.out.println(res);
        }
        
    }
}
