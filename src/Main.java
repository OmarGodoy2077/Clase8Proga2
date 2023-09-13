import Pizza.Base.Especialidades.PizzaFourCheese;
import Pizza.Base.Especialidades.PizzaEstiloChicago;
import Pizza.Base.Especialidades.PizzaItaliana;
import Pizza.Base.Topping;

import java.util.ArrayList;
import java.util.List;

public class Main {

        public static void main(String[] args) {
            List<String> ingredientes = new ArrayList<>();
            ingredientes.add("Mozzarella");
            ingredientes.add("Pepperoni");
            ingredientes.add("Jitomate");
            ingredientes.add("Queso Parmesano");

            PizzaEstiloChicago pizzaChicago = new PizzaEstiloChicago("Pizza de Chicago","Mptzalella", ingredientes);
            pizzaChicago.addTopping(new Topping("cebolla", 8));
            pizzaChicago.prepare();

            PizzaFourCheese pizza =  new PizzaFourCheese("Cuatroquesos", "Queso Azul");
            pizza.addTopping(new Topping("Tomate", 8));
            pizza.addTopping(new Topping("Mozarella", 7));
            pizza.addTopping(new Topping("Orilla de queso ", 15));
            pizza.prepare();

            System.out.print("\n");


            PizzaItaliana pizzaItaliana = new PizzaItaliana("Italiana","salsa" );
            pizzaItaliana.addTopping(new Topping("Tomato", 8));
            pizzaItaliana.prepare();



    }



}