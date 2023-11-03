package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄(_), 문자(abc), 숫자(123) 사용가능 (공백사용 불가)
        // 3. 밑줄 또는 문자로 시작가능
        // 4. 한 단어 또는 2개 이상 단어의 연속가능
        // 5. 소문자로 시작(한단어), 각 단어의 시작 글자는 대문자<첫단어는 제외>(여러 단어)
        // 6. 예약어 상용불 (public, static, void, int, double, float, ...)

        //입국 신고서 (여행)
        String nationality = "대한민국"; // 국적
        String firstname = "지하"; // 이름
        String lastname = "박"; // 성
        String dateOfBirth = "1990-06-22"; // 생년월일
        String residentialAddress = "무슨 호텔"; // 체류지
        String purposeOfVisit = "관광"; // 입국목적
        String flightNo = "KE657"; // 항공편명
        String _flightno = "KE657"; // 밑줄 시작
        String flight_no_2 = "KE657"; // 밑줄과 숫자 포함

        int accompany = 2; // 동반 가족 수
        int lengthOfStay = 5; // 체류기간

        // 프로그램의 흐름을 위해 사용되는 경우 등 (크게 이름이 중요하지 않을때)
        int i =2;
        String s = "";
        String str = "";

        // 절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";


    }
}
