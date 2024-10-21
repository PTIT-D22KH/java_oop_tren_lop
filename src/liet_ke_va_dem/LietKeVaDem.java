/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package liet_ke_va_dem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author P51
 */
/*
Cho một dãy các số nguyên dương không quá 9 chữ số, mỗi số cách nhau vài khoảng trống, có thể xuống dòng. Hãy tìm các số không giảm (các chữ số theo thứ tự từ trái qua phải tạo thành dãy không giảm) và đếm số lần xuất hiện của các số đó.

Input: Gồm các số nguyên dương không quá 9 chữ số. Không quá 10000 số.

Output: Ghi ra các số không giảm kèm theo số lần xuất hiện. Các số được liệt kê theo thứ tự sắp xếp số lần xuất hiện giảm dần. Các số có số lần xuất hiện bằng nhau thì số nào xuất hiện trước in ra trước.

Ví dụ:

Input

Output

123 321 23456 123 123 23456 3523 123 321 4567 8988 78 7654 9899 3456 123 678 999 78 3456 987654321 4546 63543 4656 13432 4563 123471 659837 454945 34355 9087 9977 98534 3456 23134

123 5

3456 3
23456 2
78 2
4567 1

678 1

999 1
*/
public class LietKeVaDem {
    public static void main(String[] args) {
        Map<Integer, Integer> mp = new LinkedHashMap<>();
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String s = input.nextLine().trim();
            String a[] = s.split("\\s+");
            for (String x : a) {
                int temp = Integer.parseInt(x);
                if (isNonDecreasingNum(temp)) {
                    if (mp.containsKey(temp)) {
                        mp.put(temp, mp.get(temp) + 1);
                    } else {
                        mp.put(temp, 1);
                    }
                }
            }
        }
        ArrayList<Number> numbers = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())  {
            numbers.add(new Number(entry.getKey(), entry.getValue()));
        }
        Collections.sort(numbers);
        for (Number x : numbers) {
            System.out.println(x);
        }
    }
    private static boolean isNonDecreasingNum(int x) {
        int n = x;
        int digit = n % 10;
        while (n > 0) {
            n /= 10;
            int temp = n % 10;
            if (temp > digit) {
                return false;
            }
            digit = temp;
        }
        return true;
    }
}