package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자 , 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)
        // \n \t \\ \" \'
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        // \n : 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        // \t : 탭
        // 해물파전 9000원
        // 김치전 8000원
        // 부추전 8000원
        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t8000원");

        // \\ : 역슬래시
        System.out.println("C:\\Program Files\\Java"); // "\"를 한번 쓰면 명령어로 인식되기에 2번 사용해야 기본 "\"로 인식

        // \" : 큰따옴표
        // 단비가 "냐옹" 이라고 했어요
        System.out.println("단비가 \"냐옹\" 이라고 했어요");

        // \' : 작은따옴표
        // 단비가 '뭘 봐?' 라는 표정을 지었어요
        System.out.println("단비가 \'뭘 봐?\' 라는 표정을 지었어요");
        System.out.println("단비가 '뭘 봐?' 라는 표정을 지었어요");

        char c = 'a';
        c = '\'';
        System.out.println(c);
    }
}


