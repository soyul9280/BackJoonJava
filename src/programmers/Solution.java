package programmers;

/**
 * 입력: 문자열 s(대+소)
 * 요구: solution= s의 p y 수 -> 같으면 true
 * 제한 사항: 하나도 없는 경우 true, 대소문자 비교x,s길이 50이하 알파벳으로만 이루어져있음
 */
public class Solution {
  boolean solution(String s) {
    char[] chars=s.toCharArray();
    int p=0;
    int y=0;
    for (char c : chars) {
      if (c == 'p' || c == 'P') {
        p++;
      } else if (c == 'y' || c == 'Y') {
        y++;
      }
    }
    return p == y;
  }
}
