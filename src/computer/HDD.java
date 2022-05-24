package src.computer;

public class HDD {
String hddName;
int hddSize;
boolean type;   // false - внутренний, true - внешний;

    HDD(){}
    public HDD(String hddName, int hddSize, boolean type){
        this.hddName = hddName;
        this.hddSize = hddSize;
        this.type = type;
    }
    public void hddCurrentValue(){
        System.out.println(", HDD name: " + hddName+ ", HDD size= " + hddSize + ", HDD type: " + type);
    }
}
