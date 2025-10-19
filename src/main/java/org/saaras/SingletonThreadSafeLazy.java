package org.saaras;

public class SingletonThreadSafeLazy {

    //Private constructor to prevent from instantiation.
    private SingletonThreadSafeLazy(){

        //
        if(Holder.INSTANCE != null){
            throw new IllegalStateException("Instance already created");
        }
        else{
            System.out.println("instance created");
        }
    }

    private static class Holder {
        private static final SingletonThreadSafeLazy INSTANCE = new SingletonThreadSafeLazy();
    }
    public static SingletonThreadSafeLazy getInstance(){
        return Holder.INSTANCE;
    }


}
