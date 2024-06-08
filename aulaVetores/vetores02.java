package aulaVetores;

public class vetores02 {
    public static void main(String[] args) {
        String mes[] = {"January","february","march","april","may","june","july",
        "august","september","october","november","december"};
        int totalDias[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        for (int i = 0; i < totalDias.length; i++) {
            System.out.println("O total de dias do mês de: "+ mes[i]+ " é: "+ totalDias[i]);
            
        }

    }

}


