package ch18;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {
        Company company = Company.getInstance();
        Company company2= Company.getInstance();

        //같은 결과 => 같은 객체이기 때문.
        System.out.println(company);
        System.out.println(company2);

        //캘린더도 유일한 객체만 제공한다. 싱글톤 패턴
        //new 할 수 없다.
        Calendar calendar = Calendar.getInstance();
    }
}
