package Learn;

interface professionGetSetData{
    void readData(String professionName,String personName, String education);
    void printData();
}

abstract class profession implements professionGetSetData{
    String professionName,
           personName,
           education;

    public void readData(String professionName, String personName, String education){
        this.professionName = professionName;
        this.personName = personName;
        this.education = education;
    }

    public void printData(){
        System.out.println("Profession : " + this.professionName +
                            "\n" + "Person : " + this.personName +
                            "\n" + "Education : " + this.education);
    }
}

class doctor extends profession{
    doctor(String professionName, String personName, String education){
        readData(professionName,personName,education);
    }
}

public class runtimePolyArray {
    public static void main(String[] args) {
        profession p[] = new profession[3];
        p[0] = new doctor("Programmer","Trushil","Information Technology");
        p[0].printData();

    }
}
