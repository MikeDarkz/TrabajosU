import java.util.Scanner;

public class PromedioMascotasAdopcionMesPOO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numDias;

        System.out.print("Ingrese el número de días del mes: ");
        numDias = sc.nextInt();

        Mes mes = new Mes(numDias);

        for (int i = 1; i <= numDias; i++) {
            System.out.print("Ingrese el número de mascotas dadas en adopción en el día " + i + ": ");
            int mascotasDia = sc.nextInt();
            Dia dia = new Dia(mascotasDia);
            mes.agregarDia(dia);
        }

        float promedioMascotas = mes.calcularPromedioMascotas();
        System.out.println("El promedio de mascotas dadas en adopción durante el mes es: " + promedioMascotas);

        sc.close();
    }
}

class Mes {
    private int numDias;
    private Dia[] dias;

    public Mes(int numDias) {
        this.numDias = numDias;
        this.dias = new Dia[numDias];
    }

    public void agregarDia(Dia dia) {
        int index = dia.getNumeroDia() - 1;
        this.dias[index] = dia;
    }

    public float calcularPromedioMascotas() {
        int totalMascotas = 0;

        for (Dia dia : dias) {
            totalMascotas += dia.getMascotasDadasAdopcion();
        }

        return (float) totalMascotas / numDias;
    }
}

class Dia {
    private int mascotasDadasAdopcion;

    public Dia(int mascotasDadasAdopcion) {
        this.mascotasDadasAdopcion = mascotasDadasAdopcion;
    }

    public int getMascotasDadasAdopcion() {
        return mascotasDadasAdopcion;
    }

    public int getNumeroDia() {
        // Se podría agregar un campo para almacenar el número de día si se quisiera
        // hacer más robusto
        return -1;
    }
}
