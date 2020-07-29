package listaCircularDoble;

import java.util.Scanner;

public class mainListas {

    static Scanner sc = new Scanner(System.in);
    static listasDoblesCirc list = new listasDoblesCirc();
    static boolean strongLine;

    public static void main(String[] args) {
        onDisplay();

    }

    static void onDisplay() {

        int option = -1;
        while (option != 0) {

            strongLine = true;
            System.out.print("\n" + line() + "\n\t Listas dobles y circulares      |\n"
                    + line() + "\n"
                    + "1)> Insertar dato                        |\n"
                    + "2)> Eliminar dato                        |\n"
                    + "3)> Buscar dato                          |\n"
                    + "4)> Modificar dato                       |\n"
                    + "5)> Mostrar datos                        |\n"
                    + "6)> Obtener tamaño de la lista           |\n"
                    + "7)> Ordenar lista                        |\n"
                    + "0)> Salir                                |\n" + line());

            System.out.print("\nIngrese una opcion: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    addPerson();
                    break;
                case 2:
                    list.removexFirst();
                    break;
                case 3:
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    String n = sc.nextLine();
                    list.search(n);
                    break;
                case 4:
                    sc.nextLine();
                    System.out.print("Ultima letra de nombre: ");
                    String n1 = sc.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nn = sc.nextLine();
                    System.out.print("nueva edad: ");
                    int a = sc.nextInt();
                    list.editName(n1, nn, a);
                    break;
                case 5:
                    list.showList();
                    break;
                case 6:
                    System.out.println("Tamaño de la lista: " + list.getSize() + " Personas");
                    break;
                case 7:
                    list.sortList();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("No es una opcion");
                    break;
            }
        }
    }

    public static void addPerson() {
        String i;
        sc.nextLine();
        System.out.print("Nombre: ");
        String n = sc.nextLine();
        do {
            System.out.print("(I)nicio o (F)inal :");
            char option = sc.next().charAt(0);
            i = Character.toString(option);
        } while (!i.equalsIgnoreCase("i") && !i.equalsIgnoreCase("f"));
        if (i.equalsIgnoreCase("i")) {
            list.addxFirst(n);
        }
        if (i.equalsIgnoreCase("f")) {
            list.addxLast(n);
        }
    }

    public static String line() {
        String l1 = "▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀";
        String l2 = "---------------------------";
        if (strongLine) {
            return l1;
        } else {
            return l2;
        }

    }
}
