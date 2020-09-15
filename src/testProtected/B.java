package testProtected;

import testProtected.pack.A;

class B extends A {
    public static void main(String[] args) {
        B obj = new B();
        obj.msg();
    }
}
