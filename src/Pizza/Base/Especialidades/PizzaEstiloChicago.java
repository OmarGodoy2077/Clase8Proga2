package Pizza.Base.Especialidades;

import Pizza.Base.Pizza;
import Pizza.Base.Topping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PizzaEstiloChicago  extends Pizza {


    private List<String> ingredientes;
    private String tipoQueso;

    // Variables para los ingredientes
    private double cantidadQuesoMozzarella;
    private double cantidadPepperoni;
    private double cantidadJitomate;
    private double cantidadQuesoParmesano;

    public PizzaEstiloChicago(String name,  String tipoQueso,List<String> ingredientes, Topping... toppings) {
        super(name, toppings);
        this.ingredientes = ingredientes;
        this.tipoQueso = tipoQueso;


        cantidadQuesoMozzarella = 350.0;
        cantidadPepperoni = 300.0;
        cantidadJitomate = 500.0;
        cantidadQuesoParmesano = 0.125;
    }




    public String getTipoQueso() {
        return tipoQueso;
    }

    public void setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

    @Override
    public double getzzaPizzaPrice() {
        double Precio=super.getzzaPizzaPrice();

        return  Precio;
    }
    public void personalizarDobleIngredientes() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("¿Deseas duplicar la cantidad de cada ingrediente por 50 quetzales adicionales?");
            System.out.println("1. Sí");
            System.out.println("2. No");

            String respuesta = scanner.nextLine();

            if (respuesta.equals("1")) {
                // Duplicar la cantidad de ingredientes
                cantidadQuesoMozzarella *= 2;
                cantidadPepperoni *= 2;
                cantidadJitomate *= 2;
                cantidadQuesoParmesano *= 2;

                double precioActual = getzzaPizzaPrice();
                precioActual += 50.0;


                System.out.println("Se han duplicado los ingredientes y se ha agregado un costo adicional de 50 quetzales."+precioActual);
                break;  // Salir del bucle
            } else if (respuesta.equals("2")) {
                System.out.println("No se han realizado cambios en la cantidad de ingredientes.");
                getzzaPizzaPrice();
                break;
            } else {
                System.out.println("Respuesta no válida. Por favor, ingresa 1 para Sí o 2 para No.");
            }
        }
    }


    @Override
    public void prepare() {
        System.out.println("Especialidad: " +getName());
        super.prepare();
        personalizarDobleIngredientes();





    }
}
