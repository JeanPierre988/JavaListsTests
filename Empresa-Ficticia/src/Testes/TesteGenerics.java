package Testes;

public class TesteGenerics {
    public static void main(String[] args) {
        Integer num1 = 10;
        Integer retornaTipo;
    }

    public static  <T> T retornaTipo(T ref) {
        T umaString = ref;
        System.out.println("Foi");
        return umaString;
    }
}
