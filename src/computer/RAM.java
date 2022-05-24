package src.computer;

public class RAM {
String ramName;
int ramSize;

    public RAM(){}
    public RAM(String ramName, int ramSize){
        this.ramName = ramName;
        this.ramSize = ramSize;
    }
    public void ramCurrentValue(){
        System.out.print(", RAM name: " + ramName+ ", RAM size= " + ramSize);
    }
}
