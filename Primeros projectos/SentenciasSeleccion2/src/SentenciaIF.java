public class SentenciaIF {
    public void examenAprobado(int nota){
        System.out.println("PRocedemos a evaluar si un examen esta OK");
        System.out.println("La nota que vamos a evaluar es:"+nota );
        if(nota>=5){
            System.out.println("El examen esta aprobado");
        }
        System.out.println("Programa finalizado");
    }
}
