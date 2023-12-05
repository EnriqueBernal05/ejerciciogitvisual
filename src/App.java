import java.util.Scanner;

public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String usuario;
        int contador = 0;
        String [] preguntas = {
            "¿Cuál es la capital de España?",
            "¿Cuál es la capital de Francia?",
            "¿Cuál es la capital de Italia?",
            "¿Cuál es la capital de Alemania?",
            "¿Cuál es la capital de Japón?",
            "¿Cuál es la capital de Brasil?",
            "¿Cuál es la capital de Portugal?",
            "¿Cuál es la capital de China?",
            "¿Cuál es la capital de Argentina?",
            "¿Cuál es la capital de Holanda?"
        };
        String [] respuestas = {
            "Madrid",
            "París",
            "Roma",
            "Berlín",
            "Tokio",
            "Brasilia",
            "Lisboa",
            "Pekin",
            "Buenos Aires",
            "Amsterdam"
        };
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

