package Hospital;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Manage manage = new Manage();
        Scanner sc = new Scanner(System.in);
        while(true) {
            try{
            System.out.println("1.환자 관리, 2.환자 검색, 3.종료");
            int num = sc.nextInt();
            switch(num) {
                case 1 : manage.ChangePatient(); break;
                case 2 : manage.searchData(); break;
                case 3 : System.exit(0);
                default : System.out.println("입력오류");
            }
        }
            catch (InputMismatchException e){
                sc = new Scanner(System.in);
                System.out.println("숫자를 입력하세요.");
            }   
        }
    }
}
