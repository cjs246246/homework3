import java.util.*;
class B04 {
        public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
                System.out.print("연봉을 원 단위로 입력하세요 ");
                Long money = s.nextLong();
                if(money < 10000000){
                    System.out.print("연봉 금액에 대한 소득세는 " +money*0.95 +"입니다");
                }
                else if(10000000<=money && money<40000000){
                    System.out.print("연봉 금액에 대한 소득세는 " +money*1.9+ "입니다");
                }
                else if (40000000<=money && money<80000000){
                    System.out.print("연봉 금액에 대한 소득세는 " +money*2.8+ "입니다");
                }else 
                  System.out.print("연봉 금액에 대한 소득세는" +money*3.7+ "입니다");
        }
}
