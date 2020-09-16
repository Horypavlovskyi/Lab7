package ua.zp.brainacad;

import java.util.Arrays;

public class Pizzeria {
    public static void main(String[] args) {
        /**
         * Пицыы из конструкртора, подставляем значения
          */
        Pizza Chiken = new Pizza(4, "курица, огурцы", "Куриная", 80);
        Pizza Gavayskaya = new Pizza(6, "ананасы, помидоры", "Гавайская", 60);
        Pizza KingsPizza = new Pizza(8, "сосики, картошка", "Королевская", 55);
        Pizza[] pizza = {Chiken,Gavayskaya,KingsPizza};

        /**
         * массивы пицц с методом toString
         */
        for (Pizza pizzerias : pizza) {
        }
        System.out.println(Arrays.toString(pizza).replace("[", "").replace("]", "").replace(",", "-"));

    }

}
