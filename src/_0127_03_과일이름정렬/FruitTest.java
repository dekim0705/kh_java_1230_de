package _0127_03_과일이름정렬;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
// 임의의 과일 이름 10개의 배열 생성
// 길이 순으로 정렬하고 길이가 같은 경우 사전(알파벳 순서) 정렬 하기
// String length() :
// String compareTo() : 같은 경우 0, 양수가 나오면 정렬 조건, 음수가 나오면 현상태 유지
// Arrays.sort(배열이름, new Comparator<String>() {compare() 메서드 구현}

public class FruitTest {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "kiwi", "orange", "watermelon", "mango", "fig", "strawberry", "peach", "plum"};
        Arrays.sort(arr, new Comparator<String>() { // 정렬 자체는 sort 가 하는거고 정렬 조건을 만들어 주는 것
            @Override // 원래 compare 이라는게 있는데 새로운 formula 창조한(?)것
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1; // 첫번째가 두번째 보다 길이가 길면 정렬 조건. (양수값을 만들면 정렬 조건에 걸림. 앞의 값이 뒤의 갚보다 크다는건 뒤집어야 하니까 return 1)
                else {
                    if (o1.length() == o2.length()) {
                        return o1.compareTo(o2); // 두번째가 사전순서상 앞에 있으면 양수 (compareTo 는 내부적으로 ASCII 코드값 비교)
                            // "apple" precedes "banana" -> return negative int.
                    }
                    return -1; // o1이 o2보다 작으면 "현 상태 유지"
                }
            }
        });
        System.out.println(Arrays.toString(arr));

        String test = "abcd";

        System.out.println(test.compareTo("ab")); // 양수 : 2
        System.out.println(test.compareTo("abcd")); // 0
        System.out.println(test.compareTo("abcde")); // 음수 : -1
        System.out.println(test.compareTo("abcdef")); // 음수 : -2
        // 양수만 정렬조건에 걸린다는걸 기억하기


// Compares two strings lexicographically. The comparison is based on the Unicode value of each character in the strings.
// The character sequence represented by this String object is compared lexicographically to the character sequence
// represented by the argument string.
// The result is a negative integer if this String object lexicographically precedes the argument string. (-int)
// The result is a positive integer if this String object lexicographically follows the argument string.  (+int)
// The result is zero if the strings are equal; compareTo returns 0 exactly when the equals(Object) method would return true.
//This is the definition of lexicographic ordering.

// If two strings are different, then either they have different characters at some index that is a valid index for both strings,
// or their lengths are different, or both.
// If they have different characters at one or more index positions,
// let k be the smallest such index; then the string whose character at position k has the smaller value,
// as determined by using the < operator, lexicographically precedes the other string.
// In this case, compareTo returns the difference of the two character values at position k in the two string --
// that is, the value:

//  this.charAt(k)-anotherString.charAt(k)
//
//If there is no index position at which they differ,
// then the shorter string lexicographically precedes the longer string.
// In this case, compareTo returns the difference of the lengths of the strings -- that is, the value:
//  this.length()-anotherString.length()



    }
}
