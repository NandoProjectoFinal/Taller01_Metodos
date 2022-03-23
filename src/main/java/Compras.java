import java.util.Random;

public class Compras {
    public static void main(String[] args) {
    }



    public static void carritoGeneral(int[] arr){
        System.out.println("El carrito tiene " + arr.length + " Productos");
    }

    public static int[] compra(int[] arregloProductos) {
        int [] a = new int[arregloProductos.length];
        for (int i = 0; i < arregloProductos.length; i++) {
            a[i]=randomRango15();
        }
        return a;
    }

    public static int randomRango15(){
        Random rnum = new Random();
        return rnum.nextInt(14)+1;
    }

    public static int randomRango20(){
        Random rnum = new Random();
        return rnum.nextInt(19)+1;
    }

    public static int[] arregloProductos() {
        int[] arr = new int[randomRango20()];
        return arr;
    }
}
/*
arregloProductos()
Precios(int celdadeprecio)
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