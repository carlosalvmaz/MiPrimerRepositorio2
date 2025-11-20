import javax.swing.*;

public class SentenciaIF {
    public void examenAprobado(int nota){
        System.out.println("Procedwemos a examinar ssi un examen esta ok");
        System.out.println("LA nota que vamos a evaluar es :"+nota);
        if(nota>=5){
            System.out.println("El examen esta aprobado");

        }else {
            System.out.println("El examen esta suspenso ");

        }
        System.out.println("Terminando evaluacion del examen ");
        System.out.println("Examen fianlizado");

    }
    public void notaExamne(int nota){
        //suspenso -> 0-4.99
        // aprobado -> 5-7.99
        //notabble -> 8-9.99
        //MH -> 10
        if(nota>0 && nota<10) {
            if (nota > 0 && nota < 5) {
                System.out.println("El examen esta suspenso");

            } else if (nota < 8) {
                System.out.println("El examen esta aprobado");
            } else if (nota < 9) {
                System.out.println("La nota es un notabale");
            } else if (nota < 10) {
                System.out.println("El examen es sobresaliente");
            } else {
                System.out.println("El examen es MH");
            }
        }else{
            System.out.println("El numero no entra en el rango");
        }
    }
}
