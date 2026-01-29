import java.util.Scanner;
public class ConteoPersonas{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int ninoMujer = 0, ninoHombre = 0;
        int adolecenteHombre = 0, adolecenteMujer = 0;
        int adultoJovenHombre = 0, adultoJovenMujer = 0;
        int adultoHombre = 0, adultoMujer = 0;
        int terceraEdadHombre = 0, terceraEdadMujer = 0;

        char salir = 'n';

        while (salir != 's') {
            
            System.out.println("Ingresa tu genero (H/M): ");
            char genero = scanner.next().charAt(0);

            System.out.println("Ingresa tu edad: ");
            int edad = scanner.nextInt();
           
            if (edad >= 0 && edad <= 15) {
                if (genero == 'H' || genero == 'h') {
                    ninoHombre++;
                } else if (genero == 'M' || genero == 'm') {
                    ninoMujer++;
                }

            } else if (edad >= 16 && edad <= 20) {
                if (genero == 'H' || genero == 'h') {
                    adolecenteHombre++;
                } else if (genero == 'M' || genero == 'm') {
                    adolecenteMujer++;
                }

            } else if (edad >= 21 && edad <= 30) {
                if (genero == 'H' || genero == 'h') {
                    adultoJovenHombre++;
                } else if (genero == 'M' || genero == 'm') {
                    adultoJovenMujer++;
                }

            } else if (edad >= 31 && edad <= 60) {
                if (genero == 'H' || genero == 'h') {
                    adultoHombre++;
                } else if (genero == 'M' || genero == 'm') {
                    adultoMujer++;
                }

            } else if (edad >= 61) {
                if (genero == 'H' || genero == 'h') {
                    terceraEdadHombre++;
                } else if (genero == 'M' || genero == 'm') {
                    terceraEdadMujer++;
                }
            }
            System.out.println("Niño H: " + ninoHombre + "Niña M: " + ninoMujer);
            System.out.println("Adolecente H: " + adolecenteHombre + "Adolecente M: " + adolecenteMujer);
            System.out.println("Adulto joven H: " + adultoJovenHombre + "Adulto joven M: " + adultoJovenMujer);
            System.out.println("Adulto H: " + adultoHombre + "Adulto M: " + adultoMujer);
            System.out.println("tercera edad H: " + terceraEdadHombre + "tercera edad M: " + terceraEdadMujer);

            System.out.println("¿Deseas salir? (s/n): ");
            salir = scanner.next().charAt(0);
        }

     

         


            



        
    }
}