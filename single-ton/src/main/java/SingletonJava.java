public class SingletonJava {

    private static volatile SingletonJava sg = new SingletonJava();

    private SingletonJava(){
        if(sg != null) throw new RuntimeException("Use getSingleTonVariable() for instance");
    }

    public static SingletonJava getSingletonVariable(){
        if(sg == null){
            synchronized(SingletonJava.class){
                if(sg == null){
                    sg = new SingletonJava();
                }
            }

        }
        return sg;
    }

}



