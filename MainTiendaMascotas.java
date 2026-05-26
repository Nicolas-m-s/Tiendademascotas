import java.util.ArrayList;
import java.util.Scanner;

abstract class Mascota {
    protected String nombre;
    protected int edad;
    protected String tipo;
    protected String raza;
    
    public Mascota(String nombre, int edad, String tipo, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
        this.raza = raza;
    }
    
    public abstract void mostrarInformacion();

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getTipo() { return tipo; }
    public String getRaza() { return raza; }
}

class Gato extends Mascota {
    private boolean esterilizado;
    
    public Gato(String nombre, int edad, String raza, boolean esterilizado) {
        super(nombre, edad, "Gato", raza);
        this.esterilizado = esterilizado;
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("Tipo: Gato | Nombre: " + nombre + " | Edad: " + edad + " años | Raza: " + raza + " | Esterilizado: " + (esterilizado ? "Si" : "No"));
    }
}

class Perro extends Mascota {
    private String tamanio;
    
    public Perro(String nombre, int edad, String raza, String tamanio) {
        super(nombre, edad, "Perro", raza);
        this.tamanio = tamanio;
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("Tipo: Perro | Nombre: " + nombre + " | Edad: " + edad + " años | Raza: " + raza + " | Tamaño: " + tamanio);
    }
}

class Otro extends Mascota {
    private String especie;
    private String cuidadosEspeciales;
    
    public Otro(String nombre, int edad, String raza, String especie, String cuidadosEspeciales) {
        super(nombre, edad, "Otro", raza);
        this.especie = especie;
        this.cuidadosEspeciales = cuidadosEspeciales;
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("Tipo: Otro | Nombre: " + nombre + " | Edad: " + edad + " años | Raza: " + raza + " | Especie: " + especie + " | Cuidados especiales: " + cuidadosEspeciales);
    }
}

class TiendaMascotas {
    private ArrayList<Mascota> inventario = new ArrayList<>();
    
    public void agregarMascota(Mascota mascota) {
        inventario.add(mascota);
        System.out.println("Mascota registrada exitosamente");
    }
    
    public void mostrarInventario() {
        if (inventario.isEmpty()) {
            System.out.println("No hay mascotas en el inventario.");
        } else {
            System.out.println("\n--- INVENTARIO DE MASCOTAS ---");
            for (Mascota mascota : inventario) {
                mascota.mostrarInformacion();
            }
        }
    }
    
    public void buscarPorTipo(String tipo) {
        boolean encontrado = false;
        System.out.println("\n--- RESULTADOS PARA " + tipo.toUpperCase() + "S ---");
        for (Mascota mascota : inventario) {
            if (mascota.getTipo().equalsIgnoreCase(tipo)) {
                mascota.mostrarInformacion();
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("No se encontraron mascotas de tipo " + tipo);
        }
    }
}

public class MainTiendaMascotas {
    public static void main(String[] args) {
        TiendaMascotas tienda = new TiendaMascotas();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("SISTEMA DE GESTIÓN DE TIENDA DE MASCOTAS");
        
        int opcion;
        do {
            System.out.println("\nMENÚ PRINCIPAL");
            System.out.println("1. Registrar nueva mascota");
            System.out.println("2. Mostrar inventario completo");
            System.out.println("3. Buscar mascotas por tipo");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.println("\nREGISTRAR NUEVA MASCOTA");
                    System.out.println("Seleccione el tipo: ");
                    System.out.println("1. Gato");
                    System.out.println("2. Perro");
                    System.out.println("3. Otro");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Edad (en años): ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Raza: ");
                    String raza = scanner.nextLine();
                    
                    switch (tipo) {
                        case 1:
                            System.out.print("¿Está esterilizado? (s/n): ");
                            boolean esterilizado = scanner.nextLine().equalsIgnoreCase("s");
                            tienda.agregarMascota(new Gato(nombre, edad, raza, esterilizado));
                            break;
                        case 2:
                            System.out.print("Tamaño (pequeño/mediano/grande): ");
                            String tamanio = scanner.nextLine();
                            tienda.agregarMascota(new Perro(nombre, edad, raza, tamanio));
                            break;
                        case 3:
                            System.out.print("Especie: ");
                            String especie = scanner.nextLine();
                            System.out.print("Cuidados especiales: ");
                            String cuidados = scanner.nextLine();
                            tienda.agregarMascota(new Otro(nombre, edad, raza, especie, cuidados));
                            break;
                        default:
                            System.out.println("Opción no válida.");
                    }
                    break;
                case 2:
                    tienda.mostrarInventario();
                    break;
                case 3:
                    System.out.println("\nBUSCAR POR TIPO");
                    System.out.println("1. Gatos");
                    System.out.println("2. Perros");
                    System.out.println("3. Otros");
                    System.out.print("Seleccione el tipo a buscar: ");
                    int tipoBusqueda = scanner.nextInt();
                    scanner.nextLine();
                    
                    switch (tipoBusqueda) {
                        case 1:
                            tienda.buscarPorTipo("Gato");
                            break;
                        case 2:
                            tienda.buscarPorTipo("Perro");
                            break;
                        case 3:
                            tienda.buscarPorTipo("Otro");
                            break;
                        default:
                            System.out.println("Opción no válida.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4);
        
        scanner.close();
    }
}