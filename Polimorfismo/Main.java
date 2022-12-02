package Polimorfismo;

public class Main {
    public static void main(String []args){

        Vehiculo misVehiculos[] = new Vehiculo[4];

        misVehiculos[0]= new Vehiculo("GH$", "Ferrari", "A89");
        misVehiculos[1] = new VehiculoTurismo(4, "67HJ", "Audi", "P14");
        misVehiculos[2] = new VehiculoDeportivo(500, "45GH","Toyota","KJ8" );
        misVehiculos[3] = new VehiculoFurgoneta(200, "J18", "Toyota","J8");




//        Metodo for para imprimir vehuculos de la clase Cehiculo
        for (Vehiculo cochecitos: misVehiculos){
            System.out.println(cochecitos.mostrarDatos());
            System.out.println("--");

        }
    }
}
