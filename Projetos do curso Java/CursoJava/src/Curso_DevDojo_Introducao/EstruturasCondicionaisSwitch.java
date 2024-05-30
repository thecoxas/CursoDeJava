package Curso_DevDojo_Introducao;

public class EstruturasCondicionaisSwitch {
    public static void main(String[] args) {
        // Switch case
        byte dia = 7;
        switch (dia){
            case 1 :
                System.out.println("Domingo");
                break;
            case 2 :
                System.out.println("Segunda");
                break;
            case 3 :
                System.out.println("terça");
                break;
            case 4 :
                System.out.println("Quarta");
                break;
            case 5 :
                System.out.println("Quinta");
                break;
            case 6 :
                System.out.println("Sexta");
                break;
            case 7 :
                System.out.println("Sabado");
                break;
            default:
                System.out.println("opçao invalida");

        }
    }
}
