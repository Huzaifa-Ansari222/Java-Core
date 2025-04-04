package core_java;

public class Test {
    //non static can be acessable in obj
    int x=10;

    //static cant be acessable in obj
    static int y = 20;
    public static void main(String[] args) {

        Test obj1 = new Test ();
        System.out.println(obj1.x);// way to acess class if non static
        System.out.println(Test.y); //way to acess class thing if static

    }
}
/*

Core_Java_Notes/
│
├── 1_Class_and_Object/
│   ├── Class_Basics.md
│   ├── Objects.md
│   └── Static_vs_NonStatic.md
│
├── 2_Variables/
│   ├── Local_Variables.md
│   ├── Instance_Variables.md
│   ├── Static_Variables.md
│   └── Reference_Variables.md
│
├── 3_Memory_Management/
│   ├── Stack_Memory.md
│   ├── Heap_Memory.md
│   └── Garbage_Collection.md
│
├── 4_Methods/
│   ├── Method_Basics.md
│   ├── Void_Methods.md
│   ├── Return_Methods.md
│   └── Method_Arguments.md
│
├── 5_Constructors/
│   ├── Constructor_Basics.md
│   ├── Default_Constructors.md
│   ├── Parameterized_Constructors.md
│   └── Constructor_Overloading.md
│
└── 6_Key_Concepts/
    ├── Object_Creation_Flow.md
    ├── Static_Context.md
    └── Variable_Scope.md


 */