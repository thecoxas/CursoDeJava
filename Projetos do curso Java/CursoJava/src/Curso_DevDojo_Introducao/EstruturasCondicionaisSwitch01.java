package Curso_DevDojo_Introducao;

public class EstruturasCondicionaisSwitch01 {
    public static void main(String[] args) {
        byte dia = 10;
        switch (dia) {
            case 1 :
            case 7 :
                System.out.println("fim de semana ");
                break;
            case 2 :
            case 3 :
            case 4 :
            case 5 :
            case 6 :
            System.out.println("dia util");
            break;
            default :
            System.out.println("opçao invalida");



        }
    }
}
