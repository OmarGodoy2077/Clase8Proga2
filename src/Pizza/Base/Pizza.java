package Pizza.Base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public abstract class Pizza {
    private String name;
    private List<Topping> toppings = new ArrayList<>();

    //    los tres puntos (...) en el parámetro Topping... toppings del constructor de la clase Pizza tienen
//    un significado especial en Java.
//    Estos three dots se llaman "spread operator" (operador de dispersión) y permiten pasar un
//    conjunto de argumentos variádicos a un método. En este caso, el constructor de la clase Pizza
//    espera una lista de objetos Topping, pero en lugar de especificar explícitamente la lista de
//    objetos, se utiliza el operador de dispersión para pasar todos los argumentos restantes como una
//    lista de objetos Topping.
    public Pizza(String name, Topping... toppings) {
        this.name = name;
        for (Topping topping : toppings) {
            this.toppings.add(topping);
        }
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public void removeTopping(int index) {
        this.toppings.remove(index);
    }

    public List<Topping> getToppings() {

        return Collections.unmodifiableList(new ArrayList<>(toppings));
    }

    public String getName() {
        return name;
    }

    public double getzzaPizzaPrice() {
        double totalPrice = 0.0;

        for (Topping topping : toppings) {
            totalPrice += topping.getPrice();
        }

        return totalPrice;


    }




    public void prepare() {
        System.out.println("Preparando su pizza  " + name);
        System.out.println("Agregar topings:");
        for (Topping topping : toppings) {
            System.out.println("- " + topping.getNombre());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        tamanios();

    }

    private void tamanios(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Selecciona el tamanio de tu pizza\n");

        System.out.print("1.Pizza Small \n 2.Pizza Medium\n 3.Pizza Large \n");
        int numero= scanner.nextInt();
        if (numero == 1) {
            System.out.println("Su piza es normal small, Total price:" + getzzaPizzaPrice());

        } else if (numero == 2) {

            double data=(0.20* getzzaPizzaPrice())+ getzzaPizzaPrice();
            System.out.println("Su piza es normal medium, Total price:" + data);

        } else if (numero == 3) {
            double data=(0.35* getzzaPizzaPrice())+ getzzaPizzaPrice();
            System.out.println("Su piza es normal large , Total price:" + data);
        } else {
            System.out.println("Número ingresado no válido. Por favor, ingrese 1, 2 o 3.");
        }
    }


}

