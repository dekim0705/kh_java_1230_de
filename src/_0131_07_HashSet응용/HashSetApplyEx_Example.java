package _0131_07_HashSet응용;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
// 문제 : 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램 작성
// 1. 길이가 짧은 것 부터
// 2. 길이가 같으면 사전 순위로
// 3. 중복제거
// 입력 : 13(개의 단어) but i wont hesitate no more no more it cannot wait im yours
// 출력 : i am it no but more wait wont yours cannot hesitate
public class HashSetApplyEx_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 단어의 개수 입력
        String[] word = new String[n];
        for(int i = 0; i < n; i ++) {
            word[i] = sc.next();
        }
        // 순서가 흐트러지기 때문에 중복 먼저 날려야 함 (HashSet 을 이용해 중복 제거)
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(word)); // word 라는 배열을 넣어서 HashSet 만들면 배열 내의 중복된 값은 넣는 순간에 다 날아감
        // Hashset 에 넣었다가 꺼내면 중복만 날아간 상태로 나오기 때문에 다시 배열로 되돌려 줘야 함
        word  = hashSet.toArray(new String[0]); // 배열의 크기를 0으로 지정하면 자동으로 배열 크기가 (hashSet 크기만큼) 지정됨
        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2); // 결과가 양수이면 정렬조건임 -> o2가 사전순으로 더 앞인 경우 (o2가 짧으면 1. o2가 짧으면 뒤집으라는 의미.)
                } else {
                    return o1.length() - o2.length(); // 결과가 양수이면 정렬조건 (결과가 양수이면 정렬조건. 정렬조건 = 뒤집는것)
                }
            }
        });
        System.out.println(Arrays.toString(word));
    }
}
