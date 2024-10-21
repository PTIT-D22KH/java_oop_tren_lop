/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logthoigian;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author P51
 */
/*
Một trong những thành phần quan trọng của các dữ liệu log hệ thống là các mốc thời gian. 
Trong bài toán này ta xét các mốc thời gian giờ:phút:giây, theo đúng định dạng 8 ký tự hh:mm:ss

Giả sử một mốc thời gian hợp lệ nếu viết đúng theo định dạng 24h, phân tách với các dữ liệu khác trong luồng dữ liệu vào 
bởi khoảng trống, dấu tab, dấu xuống dòng hoặc dấu chấm (.) hay dấu phẩy (,)

Hãy tìm các giá trị mốc thời gian hh:mm:ss hợp lệ khác nhau xuất hiện trong luồng dữ liệu vào 
và liệt kê theo thứ tự từ nhỏ đến lớn (tức là từ 00:00:00 đến 23:59:59).
Input
Gồm không quá 100.000 dòng log dạng dữ liệu văn bản. Tuy nhiên bạn không biết trước là có bao nhiêu dòng mà sẽ phải đọc đến hết luồng dữ liệu vào.
Output
Liệt kê lần lượt các mốc thời gian khác nhau theo thứ tự từ nhỏ đến lớn.
Ví dụ
Input
[BeginLog]
[Boot Session: 2023/01/31 10:22:00.500]
09:50:44.356  WINWORD (0x43A4)
Section 2023/01/31 10:22:16, 538new
{FILE_QUEUE_COMMIT} 10:22:16.569
Start: 14:17:50.111over
End: 14:17:50.899over
Output
09:50:44
10:22:00
10:22:16
14:17:50
*/
import java.util.regex.*;
import java.io.*;
import java.util.*;
public class Main {
    public static void main2(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        while (input.hasNextLine()) {
            String s = input.nextLine();
            String b[] = s.trim().split(" ");
            for (String x : b) {
                String regex = "\\d{2}:\\d{2}:\\d{2}";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(x);
                while (matcher.find()) {
                    a.add(matcher.group());
                }
            }
        }
        Collections.sort(a);
        for (String x : a) {
            System.out.println(x);
        }
        input.close();
    }
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(new File("src/file_handling/logthoigian/DATA.in"));
        TreeSet<String> a = new TreeSet<>();
        while (input.hasNextLine()) {
            String s = input.nextLine();
            String b[] = s.trim().split(" ");
            for (String x : b) {
                String regex = "\\d{2}:\\d{2}:\\d{2}";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(x);
                while (matcher.find()) {
                    a.add(matcher.group());
                }
            }
        }
        for (String x : a) {
            System.out.println(x);
        }
        input.close();
    }
}
