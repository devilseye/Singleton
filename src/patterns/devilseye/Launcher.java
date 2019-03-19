package patterns.devilseye;

public class Launcher {

    public static void main(String[] args){
        System.out.println("Hello, "+PropertiesSingleton.getInstance().getProperty("username")+"!\n"
                +"Your e-mail is "+PropertiesSingleton.getInstance().getProperty("email")+";\n"
                +"You study in group "+PropertiesSingleton.getInstance().getProperty("group")
                +" of "+PropertiesSingleton.getInstance().getProperty("university")+".");
    }

}
