public class SentenciaIF {
    public void examenAprobado(int nota){
        System.out.println("PRocedemos a evaluar si un examen esta OK");
        System.out.println("La nota que vamos a evaluar es: "+nota );

        if(nota>=5){
            System.out.println("El examen esta aprobado");
        }    else{
            System.out.println("El examen esta suspenso");       }
        System.out.println("Programa finalizado");
    }
    public void notaExamen (int nota) {
        System.out.println("vamos a evaluart tu nota ");
        if(nota>=5 && nota<=10) {
            if (nota < 5) {
                System.out.println("El examen esta suspenso");
            } else if (nota > 5 && nota < 8) {
                System.out.println("El examen esta aprobado");
            } else if (nota>8) {
                System.out.println("La nota del examen es un notable");
            } else if (nota > 8) {
                System.out.print("La nota del examen es un sobresaliente");
            }
        }else{
            System.out.println("No es la escala correcta");
        }
    }
    }

