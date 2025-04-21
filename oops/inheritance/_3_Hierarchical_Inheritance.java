package oops.inheritance;

public class _3_Hierarchical_Inheritance {
/*
    [      Comp       ]
    ^     ^       ^
    |     |       |
Hrdep  DevDep  SaleDep
 */
}
class Comp {
    void compData(){
        System.out.println("comp data");
    }

}

class HrDep extends Comp {
    public static void main(String[] args) {
        HrDep hrObj = new HrDep();
        hrObj.compData();
    }
}
class DevDep extends Comp {
    public static void main(String[] args) {
        DevDep devObj = new DevDep();
        devObj.compData();
    }
}
class SaleDep extends Comp {
    public static void main(String[] args) {
        SaleDep saleObj = new SaleDep();
        saleObj.compData();
    }
}
