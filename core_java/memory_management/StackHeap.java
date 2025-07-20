package core_java.memory_management;

public class StackHeap {
    public static void main(String[] args) {
        // Object created in HEAP
        String str1 = new String("Hello");

        // Reference vars in STACK
        String str2 = str1;  // Both point to same object
        System.out.println(str1);//hello
        System.out.println(str2);//hello

        //print address both have same address
        System.out.println("str1 hash: " + System.identityHashCode(str1));
        System.out.println("str2 hash: " + System.identityHashCode(str2));

        str1 = null;  // Object now eligible for GC
        System.out.println("str1 to null: " + System.identityHashCode(str1));// pointing null will means no use will remove by GC later
        System.out.println("str2 hash: " + System.identityHashCode(str2));
        //System.gc(); // Just a request, JVM may ignore it.

    }
}

/*
🗑️ What Garbage Collector (GC) does:
-It marks that heap object as "eligible for garbage collection".
-But it doesn’t delete it instantly!
-The GC runs automatically at some later point (when JVM decides it's needed — like low memory or idle time).
-Then it cleans up such unreferenced objects to free memory.

❗ Important Points:
-str = null does not immediately delete the object.
-GC only cleans up unreachable objects, not ones still referenced.
-You cannot manually force GC, but you can suggest it:
 */
