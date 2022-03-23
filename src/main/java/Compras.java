import java.util.Random;

public class Compras {
    public static void main(String[] args) {
        int a = randomRango20();
        carritoGeneral(arregloProductos(a));
        System.out.println("total de la compra es= " + totalCompra(valores(arregloProductos(a))));
        verCarritoDetallado(arregloProductos(a), compra(arregloProductos(a)), valores(arregloProductos(a)));
    }

    public static int totalCompra(int[] ints) {
        int a =0;
        for (int i = 0; i < ints.length; i++) {
            a= a+ints[i];
        }
        return a;
    }


    public static void verCarritoDetallado(int[] productos, int[] compras, int[] valores) {
        System.out.println("El carro tiene: ");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(compras[i] + " productos tipo " + "["+(i+1) +"]"+ ", costo = " + "["+valores[i]+"]");
        }
        System.out.println("TOTAL= " + totalCompra(valores));
    }

    public static void carritoGeneral(int[] arr) {
        System.out.println("El carrito tiene " + arr.length + " Productos");
    }

    public static int[] compra(int[] arregloProductos) {
        int[] a = new int[arregloProductos.length];
        for (int i = 0; i < arregloProductos.length; i++) {
            a[i] = randomRango15();
        }
        return a;
    }

    public static int randomRango15() {
        Random rnum = new Random();
        return rnum.nextInt(14) + 1;
    }

    public static int randomRango20() {
        Random rnum = new Random();
        return rnum.nextInt(19) + 1;
    }

    public static int[] arregloProductos(int a) {
        int[] arr = new int[a];
        return arr;
    }

    public static int[] valores(int[] arr) {
        int[] valores = new int[arr.length];
        for (int i = 0; i < valores.length; i++) {
            valores[i] = 500 * i;
        }
        return valores;
    }
}
/*
arregloProductos()
Precios(int[] arr)
compra(int[] arregloProductos)
verCarrito(carrito(compra))
carrito(compra)
totalCompra(carrito(compra))
verCarritodetallado(carrito(compra))

Analisis:
- Hacer un arreglo random de rango 20 para la cantidad de productos
- los precios de los productos van desde los 500, incrementando en 150
- entre 0 y 15 productos por celda de manera random
- metodo para ver contenido de carrito (arreglo como parametro de entrada) == "El carrito tiene "+ nrodeproductos + " productos"
-crear un metodo de total de la compra en el cual se use el arreglo de el punto anterior
- metodo para mostrar cada celda del carrito (arreglo de productos como parametro de entrada) ==
Cantidad producto [0]: 2, Subtotal: $1000

Cantidad producto [1]: 5, Subtotal: $3250 //etc...hasta los N productos que tenga el carrito

- al final tengo que mostrar el total de la compra con el metodo de TotalCompra

* */