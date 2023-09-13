package Pizza.Base.Especialidades;

import Pizza.Base.Pizza;
import Pizza.Base.Topping;

import java.util.Scanner;

   public class PizzaMargarita extends Pizza {

    private boolean albahacaFresca;
    private boolean aceiteOlivaExtraVirgen;

    public PizzaMargarita(String name, Topping... toppings) {
        super(name, toppings);
        this.albahacaFresca = false;
        this.aceiteOlivaExtraVirgen = false;
    }



    public void agregarAlbahacaFresca() {
        albahacaFresca = true;
        System.out.println("Albahaca Fresca agregada");
    }

    public void agregarAceiteOlivaExtraVirgen() {
        aceiteOlivaExtraVirgen = true;
        System.out.println("Aceite agregado");
    }

    public void personalizarPizza() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Personaliza tu Pizza Margarita:");

        System.out.println("¿Deseas agregar albahaca fresca a la pizza? (1: Sí / cualquier otro numero para NO)");
        int respuestaAlbahaca = scanner.nextInt();
        if (respuestaAlbahaca == 1) {
            agregarAlbahacaFresca();
        }
        else {
            System.out.println("sin albahaca");
        }

        System.out.println("¿Deseas agregar aceite de oliva virgen extra a la pizza? (1: Sí / 2: No)");
        int respuestaAceite = scanner.nextInt();
        if (respuestaAceite == 1) {
            agregarAceiteOlivaExtraVirgen();
        }
        else {
            System.out.println("sin aceite de oliva");
        }
    }

    @Override
    public void prepare() {

        super.prepare();
        System.out.println("Especialidad:" +getName());
        personalizarPizza();


    }
   }
