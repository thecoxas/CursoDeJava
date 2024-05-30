package cursoLoianeGroner;

public class LoopWhile {

    public static void main(String[] args) {
        int i = 1;//cont ou count
        int max = 10;
        System.out.println("Contando até "+max);
        while(i <= max){
            System.out.println("valor de i: "+i);
            i++; // i = i+1; ou i += 1;
        }
        System.out.println(i);

        do {
            i++;
            System.out.println("valor de i: "+ i);
        } while (i < 10);

        System.out.println(i);



    }
}
