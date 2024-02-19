package timbuchalka.scope.accessModifiers;

public interface Accessible {

    int Some_constant = 100; // implicitly public, static, final
    public void methodA();
    void methodB(); // implicitly public, abstract
    boolean methodC();
}