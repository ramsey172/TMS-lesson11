import Ex1.Exceptions.StringNotContainesAbcException;
import Ex1.Exceptions.StringNotEndsWith1a2bException;
import Ex1.Exceptions.StringNotStartsWith555Exception;
import Ex1.StringMethods;
import Ex2.Authorization;

public class Main {
    public static void main(String[] args) {
        String str = "test";

        //1.1
        try {
            StringMethods.printContainsABC(str);
        }catch (StringNotContainesAbcException e){
            System.err.println(e.getMessage());
        }

        //1.2
        try{
            StringMethods.printStartsWith555(str);
        }catch (StringNotStartsWith555Exception e){
            System.err.println(e.getMessage());
        }

        //1.3
        try{
            StringMethods.printEndsWith1a2b(str);
        }catch (StringNotEndsWith1a2bException e){
            System.err.println(e.getMessage());
        }

        String login = "user";
        String password = "password17";
        String confirmPassword = "password17";
        if(Authorization.login(login, password, confirmPassword)){
            System.out.println("Успешно залогинен");
        }else{
            System.out.println("Что-то пошло не так");
        }

    }

}