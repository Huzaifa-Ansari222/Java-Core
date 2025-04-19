package oops.inheritance;

public class _1_Multi_Level {
//    Multi level inheritance
//    HR -> Department -> Company
}
class Company{
    String comp = "companyInfoData";

    public static void main(String[] args) {
        System.out.println("---Company class---");

        Company obj = new Company();  // create object to access non-static variable
        System.out.println(obj.comp); // ✅ now it works

        System.out.println("---x---x---");
    }
    void companyInfo() {
        System.out.println("company info method");
    }
}
class Department extends Company {
    String dep = "departmentInfoData";
    public static void main(String[] args) {
        System.out.println("---Department class---");
        Department obj = new Department();
        System.out.println(obj.dep);

        Department depart = new Department();
        depart.companyInfo();
        System.out.println(depart.comp);

        System.out.println("---x---x---");
    }

    void departmentData() {
        System.out.println("department data method");
    }
}

class HR extends Department{
    public static void main(String[] args) {
        System.out.println("---HR class---");

        HR hrObj = new HR();
        System.out.println(hrObj.comp);
        hrObj.companyInfo();

        System.out.println(hrObj.dep);
        hrObj.departmentData();

        System.out.println("---x---x---");
    }

    void hr() {
        System.out.println("HR method");
    }
}