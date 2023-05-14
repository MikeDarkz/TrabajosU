import java.util.Scanner;

public class PromedioMascotasAdopcionMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numDias, totalMascotas = 0;

        System.out.print("Ingrese el número de días del mes: ");
        numDias = sc.nextInt();

        for (int i = 1; i <= numDias; i++) {
            System.out.print("Ingrese el número de mascotas dadas en adopción en el día " + i + ": ");
            int mascotasDia = sc.nextInt();
            totalMascotas += mascotasDia;
        }

        float promedioMascotas = (float) totalMascotas / numDias;
        System.out.println("El promedio de mascotas dadas en adopción durante el mes es: " + promedioMascotas);

        sc.close();
    }
}
