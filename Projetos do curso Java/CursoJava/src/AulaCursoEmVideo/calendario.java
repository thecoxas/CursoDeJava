package AulaCursoEmVideo;

import java.util.Calendar;

public class calendario {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Data e hora atual: "+c.getTime());
        System.out.println("Ano: "+c.get(Calendar.YEAR));
        System.out.println("Mês: "+ c.get(Calendar.MONTH));
        System.out.println("Dia: "+c.get(Calendar.DAY_OF_MONTH));
    }

}
