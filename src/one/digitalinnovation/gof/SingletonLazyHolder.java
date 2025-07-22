package one.digitalinnovation.gof;


import static one.digitalinnovation.gof.SingletonLazyHolder.InstanceHolder.instancia;

public class SingletonLazyHolder {
    static  class InstanceHolder{
    public   static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return instancia;
    }
}
