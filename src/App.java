import java.util.Scanner;

public class App{
public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String usuario;
        String preguntas[] = new String [10]; //Aqui creamos el array preguntas. Lo instanciamos como el escaner y le decimos entre los corchetes el tamaño del array
        String respuesta[] = new String [10];
        int contador = 0;
        preguntas [0]= "¿Cuál es la capital de España?";//Aqui vamos a darle valor a los 10 arrys vacios que tenemos, en encuenta que se empieza en 0
        preguntas [1]="¿Cuál es la capital de Francia?";
        preguntas [2]="¿Cuál es la capital de Italia?";
        preguntas [3]="¿Cuál es la capital de Alemania?";
        preguntas [4]="¿Cuál es la capital de Japón?";
        preguntas [5]="¿Cuál es la capital de Brasil?";
        preguntas [6]="¿Cuál es la capital de Portugal?";
        preguntas [7]="¿Cuál es la capital de China?";
        preguntas [8]="¿Cuál es la capital de Argentina?";
        preguntas [9]= "¿Cuál es la capital de Holanda?";

        respuesta[0]="Madrid";
        respuesta[1]="París";
        respuesta[2]="Roma";
        respuesta[3]="Berlín";
        respuesta[4]="Tokio";
        respuesta[5]="Brasilia";
        respuesta[6]="Lisboa";
        respuesta[7]="Pekin";
        respuesta[8]="Buenos Aires";
        respuesta[9]="Amsterdam";
        
        for (int i = 0; i < preguntas.length; i++) {
            System.out.println(preguntas[i]);
            System.out.print("Introduce la respuesta correcta");
            usuario = sc.nextLine();

            if (usuario.equalsIgnoreCase(respuestas[i])) {
                System.out.println("¡Has acertado!");
                contador++;
            } else {
                System.out.println("¡Has fallado!");
            }
        }
        System.out.println("Has acertado: " + contador + " de 10");
        sc.close();
}
}

