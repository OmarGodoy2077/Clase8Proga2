package Pizza.Base.Especialidades;

import Pizza.Base.Pizza;
import Pizza.Base.Topping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PizzaFourCheese extends Pizza {

    private String QusoAzul;

    public PizzaFourCheese(String name, String qusoAzul, Topping... toppings) {
        super(name, toppings);
        QusoAzul = qusoAzul;
    }

    public String getQusoAzul() {
        return QusoAzul;
    }

    public void setQusoAzul(String qusoAzul) {
        QusoAzul = qusoAzul;
    }

    @Override
    public void prepare() {

        super.prepare();
        System.out.println("la especialidad es " + getName());
       elegirFormaPreparacionPizza();

    }
    public void elegirFormaPreparacionPizza() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("¿Cómo deseas preparar la pizza?");
        System.out.println("1. Con base de coliflor");
        System.out.println("2. En sartén");
        System.out.println("2. Forma estandar");

        try {
            String input = reader.readLine();
            int eleccion = Integer.parseInt(input);

            if (eleccion == 1) {
                prepararPizzaCuattroQuesosConColiflor();
            } else if (eleccion == 2) {
                prepararPizzaCuattroQuesosEnSarten();
            } else {
                System.out.println(" Preparando pizza de forma estándar.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Introduce un número válido.");
        }
    }



    public void prepararPizzaCuattroQuesosConColiflor() {
        System.out.println("Preparando pizza de Cuattro Quesos con base de coliflor...");

    }

    public void prepararPizzaCuattroQuesosEnSarten() {
        System.out.println("Preparando pizza de Cuattro Quesos en sartén...");

    }





}
