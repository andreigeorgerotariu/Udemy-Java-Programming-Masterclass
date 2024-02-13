package timbuchalka.scope;

public class ScopeCheck {

    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": privateVar = " + privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo() {
        int privateVar = 2;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + i * privateVar);
            System.out.println(i + " times two is " + i * this.privateVar);
        }
    }

    public class InnerClass {

        public int privateVar = 3;

        public InnerClass() {
            System.out.println("InnerClass created, privateVar is " + privateVar);
        }

        public void timesTwo() {
            for (int i = 0; i < 6; i++) {
                int privateVar = 4;
                System.out.println(i + " times two is " + i * privateVar);
                System.out.println(i + " times two is " + i * this.privateVar);
                System.out.println(i + " times two is " + i * ScopeCheck.this.privateVar);

                ScopeCheck.this.timesTwo();
            }
        }
    }
}