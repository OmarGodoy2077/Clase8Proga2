package Pizza.Base.Especialidades;
import Pizza.Base.Pizza;
import Pizza.Base.Topping;

import java.util.Scanner;

public class PizzaItaliana extends Pizza {
    private String salsa;

    public PizzaItaliana(String name, String salsa, Topping... toppings) {
        super(name, toppings);
        this.salsa = salsa;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }


    public void cambiarSalsa(String nuevaSalsa) {
        this.salsa = nuevaSalsa;
        System.out.println("Se ha cambiado la salsa de la pizza a: " + nuevaSalsa);
    }




        public void elegirSalsa() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Elige el tipo de salsa para la pizza italiana:");
            System.out.println("1. Salsa Pomodoro Tradicional");
            System.out.println("2. Salsa Pesto");
            System.out.println("3. Salsa Alfredo");
            System.out.println("4. Salsa de Champiñones y Trufa");
            System.out.print("Ingresa el número correspondiente a tu elección: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cambiarSalsa("Salsa Pomodoro Tradicional");
                    break;
                case 2:
                    cambiarSalsa("Salsa Pesto");
                    break;
                case 3:
                    cambiarSalsa("Salsa Alfredo");
                    break;
                case 4:
                    cambiarSalsa("Salsa de Champiñones y Trufa");
                    break;
                default:
                    System.out.println("Opción no válida. No se ha cambiado la salsa.");
            }
        }

    @Override
    public void prepare() {
        System.out.println("Especialidad: Pizza Estilo "+getName());
        super.prepare();
        elegirSalsa();
    }



}
