package practicarepasoejercicio5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class PracticaRepasoEjercicio5 {

    public static void main(String[] args) {

        ArrayList<Producto> listaProductos = new ArrayList();
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> controlStock = new HashMap();
        boolean condicionBucle = false;
        System.out.println("Bienvenido al controlador de stock");

        do {

            System.out.println("Ingrese el nombre del producto: ");
            String nombreProducto = sc.nextLine();
            System.out.println("Ingrese codigo del producto: ");
            String codigoProducto = sc.nextLine();
            System.out.println("Ingrese precio del producto: ");
            double precioProducto = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ingrese fecha de ingreso(dia/mes/año): ");
            String fechaCadenaInicio = sc.nextLine();
            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fecha = LocalDate.parse(fechaCadenaInicio, format);
            System.out.println("Ingrese stock del producto: ");
            int stockProducto = sc.nextInt();
            sc.nextLine();

            Producto productoCreado = new Producto(nombreProducto, codigoProducto, precioProducto, fecha, stockProducto);
            System.out.println("Producto agregado exitosamente...");

            listaProductos.add(productoCreado);
            controlStock.put(codigoProducto, stockProducto);

            System.out.println("Desea agregar otro producto? (si/no)");
            String respuestaUsuario = sc.nextLine();
            if (respuestaUsuario.equalsIgnoreCase("si")) {
                condicionBucle = true;

            } else {
                condicionBucle = false;

            }

        } while (condicionBucle == true);

        
        for (Map.Entry<String, Integer> entry : controlStock.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("Codigo del producto/Stock del producto" + "" + key + " " + value);

        }

            
        System.out.println("Actualizando stock de productos...");
        System.out.println("Ingrese codigo de producto para modificar su stock: ");
        String respuestaProducto = sc.nextLine();
        if (controlStock.containsKey(respuestaProducto)) {
            System.out.println("Modifique el stock del producto: ");
            int stockModificado = sc.nextInt();
            sc.nextLine();
            controlStock.put(respuestaProducto, stockModificado);
        } else {
            System.out.println("...");
        }

        for (Map.Entry<String, Integer> entry : controlStock.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("producto: " + "" + key + " " + value);

        }

        System.out.println("Seccion de eliminacion de productos");
        System.out.println("Ingrese codigo del producto a eliminar: ");

        Iterator<Producto> it = listaProductos.iterator();
        
        
        String respuestaEliminacion = sc.nextLine();
        if (controlStock.containsKey(respuestaEliminacion)) {
            controlStock.remove(respuestaEliminacion);

        } else {
            System.out.println("No se encontro el producto con ese codigo...");
        }

        
                while (it.hasNext()) {

                    if (it.next().getCodigo().equalsIgnoreCase(respuestaEliminacion)) {
                        it.remove();
                    }

                }
        
                
                
        for (Map.Entry<String, Integer> entry : controlStock.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("producto: " + "" + key + " " + value);

        }
        
        
        System.out.println("Lista ordenada por precio de mayor a menor: ");
        Producto.ordenarPorPrecio(listaProductos);
        
        for(Producto producto: listaProductos){
            System.out.println(producto);
        }
        
        System.out.println("Lista ordenada por fecha mas reciente a mas antigua: ");
        Producto.ordenarPorFecha(listaProductos);
        
        for(Producto producto: listaProductos){
            System.out.println(producto);
        }
        
        
        
        
    }

}
