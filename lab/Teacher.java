package lab;

public class Teacher {
    String name, gender;
    int phone;

    // void setInformation(String name,String gender,int phone){
    // this.name=name;
    // this.gender=gender;
    // this.phone=phone;
    // }

    //default constractor
    Teacher(){
        System.out.println("No Value");
    }



    //perametarized constractor
    Teacher(String name, String gender, int phone) {
        this.name = name;
        this.gender = gender;
        this.phone = phone;
    }

    public void display() {
        System.out.println(name);
        System.out.println(gender);
        System.out.println(phone);
        System.out.println("\n");
    }
}
