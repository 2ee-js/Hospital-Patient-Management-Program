package Hospital;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Manage {
    ArrayList<Data> datalist;

    public int patientcnt;

    protected Manage() {
        patientcnt = 0;
        datalist = new ArrayList<Data>(); 
    }
    //환자 입력
    public void ChangePatient() {
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
            System.out.println("1.새로 입원 환자, 2.퇴원 환자");
            int num = sc.nextInt();
            Data da = new Data();
        if(num==1) {
            while(true){
            try {
            System.out.print("나이를 입력: ");
            float age = sc.nextInt();
            sc.nextLine();
            da.setAge(age);
            break;
            }
            catch (InputMismatchException e){
                sc = new Scanner(System.in);
                System.out.println("숫자를 입력하세요.");
            }
        }
            while(true){
            try{
            System.out.print("이름을 입력: ");
            String name = sc.nextLine();
            da.setName(name);
            break;
            }
            catch(InputMismatchException e){
                sc = new Scanner(System.in);
                System.out.println("문자를 입력하세요.");
            }
        }
            while(true){
            try{
            System.out.print("병명을 입력: ");
            String diagnosis = sc.nextLine();
            da.setDiagnosis(diagnosis);
            break;
            }
            catch(InputMismatchException e){
                sc = new Scanner(System.in);
                System.out.println("문자를 입력하세요.");
            }
        }
            while(true){
            try{
            System.out.print("병명에 관해 성인이 섭취하는 약의 복용량: ");
            float adult = sc.nextFloat();
            da.setAdult(adult);
            break;
            }
            catch (InputMismatchException e){
                sc = new Scanner(System.in);
                System.out.println("숫자를 입력하세요.");
            }
        } 
            float uptake = ((da.age/(12+da.age))*da.adult);
            da.setUptake(uptake);
            System.out.print(da.name + "아동이 섭취해야 하는 약의 복용량: " + uptake + "ml"); 
            System.out.println();

            datalist.add(da);
            patientcnt = patientcnt + 1;
        }
        else{
            System.out.print("퇴원 아동 이름 입력: ");
            String name = sc.next();
            for(int i=0; i<datalist.size(); i++){
                if(name.equals(datalist.get(i).getName())) {
                    datalist.remove(i);
                    System.out.println(name + "퇴원처리가 되었습니다.");
                }else 
                    System.out.println("아동이 존재하지 않습니다.");
        }
    }
            patientcnt = patientcnt - 1;
            break;
            }catch (InputMismatchException e){
            sc = new Scanner(System.in);
            System.out.println("숫자를 입력하세요.");
            }
    }
}
    //환자 정보 검색
    public void searchData() {
        System.out.print("검색 할 아동의 이름: ");
        Scanner sc = new Scanner(System.in);
        String searchName;
        searchName = sc.next();
        Data da = search(searchName);
        if(da==null){
            System.out.println("찾는 아동이 없음");
            return;
        }
        System.out.println("이름: " + da.getName());
        System.out.println("나이: " + da.getAge());
        System.out.println("병명: " + da.getDiagnoisi());
        System.out.println(da.getName() + "아동이 섭취해야 하는 약의 복용량: " + da.getUptake() +"ml");
    }
    public Data search(String searchName) {
        for(int i=0; i<datalist.size(); i++){
            if(searchName.equals(datalist.get(i).getName())) {
                return datalist.get(i);
            }
        }
        return null;
    }

}

