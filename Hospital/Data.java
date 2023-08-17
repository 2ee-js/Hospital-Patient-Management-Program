package Hospital;

public class Data{
    //protected 멤버변수 선언
    protected String name;          //환자이름
    protected String diagnosis;     //병명
    protected float age;            //나이
    protected float adult;          //성인복용량
    protected float uptake;         //아동복용량

    //생성자
    public Data() {
        name = "";
        diagnosis = "";
        age = 0;
        adult = 0;
        uptake = 0;
    }
    public void setName(String name){this.name = name;}
    public String getName(){return name;}
    public void setDiagnosis(String diagnosis){this.diagnosis = diagnosis;}
    public String getDiagnoisi(){return diagnosis;}
    public void setAge(float age){this.age = age;}
    public float getAge(){return age;}
    public void setAdult(float adult){this.adult = adult;}
    public float getAdult(){return adult;}
    public void setUptake(float uptake){this.uptake = uptake;}
    public float getUptake(){return uptake;}
}

