package Learn;

class continent{
    String continentName;
    continent(){
        System.out.println("continent is here without argument");
    }

    continent(String continentName){
        System.out.println("continent is here");
        this.continentName = continentName;
    }
}

class country extends continent{
    String countryName;

    country(){
        System.out.println("country is here without argument");
    }

    country(String continentName, String countryName){
        super(continentName);
        System.out.println("country is here");
        this.countryName = countryName;
    }
}

public class multilevelInheritance {

    public static void main(String[] args) {
        System.out.println("with argument");
        country c = new country("Asia", "India");
        System.out.println();

        System.out.println("without argument");

        country cc = new country();

        // Runtime polymorphism

        continent cont = new country();
        

    }
}
