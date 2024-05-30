package Pratice;

public class semana {
    public static void main(String[] args) {
        String dia = "Thursday";
        switch (dia) {
            case "Saturday":
            case "Sunday":
                System.out.println("Fim de semana");
                break;
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Dias da semana");
                break;
            default:
                System.out.println("Comando invalido");
                break;
        }
    }
}
