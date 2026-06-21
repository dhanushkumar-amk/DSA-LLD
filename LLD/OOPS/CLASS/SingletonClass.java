package LLD.OOPS.CLASS;

public class SingletonClass {



    private SingletonClass() {

    }

    private static SingletonClass instance;

    public static SingletonClass getInstance(){
//       check whether one object is created only
        if (instance == null){
            instance = new SingletonClass();
        }
        return instance;
    }



}
