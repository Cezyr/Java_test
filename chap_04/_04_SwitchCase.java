package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case

        // 석차에 따른 장학금
        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그 외 : 장학금 대상 아님

        // If Else 문을 이용 (여러 조건 또는 범위에 해당하는 경우)
        int ranking = 1; // 1등
        if (ranking == 1){
            System.out.println("전액 장학금");
        } else if (ranking == 2) {
            System.out.println("반액 장학금");
        } else if (ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료#1");

        // Switch Case 문을 이용 (명확한 케이스가 있는 경우)
        ranking = 1;
        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상아님");

        }
        System.out.println("조회 완료#2");

        // 중복되는 case 2와 3을 통합
        ranking = 2;
        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상아님");

        }
        System.out.println("조회 완료#3");

        // 중고 상품의 등급에 따른 가격을 책정 (1급 : 최상 , 4급 : 최하)
        int grade = 1; // 등급
        int price = 7000; // 기본 가격
        switch (grade){
            case 1:
                price += 1000; // price = price + 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
            case 4:
                price += 1000;
                break; // break가 없으면 위에서 차례로 명령을 수행하며 중첩됨
        }
        System.out.println(grade + "등급의 가격은 " + price + "원 입니다.");
    }
}
