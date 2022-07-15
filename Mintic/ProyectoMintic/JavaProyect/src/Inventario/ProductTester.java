package Inventario;

public class ProductTester {
	
	public static void main(String args[]) {
		
		Product prd = new Product();
		Product prd2 = new Product();
		prd.setNumeroElemento(1);
		prd.setNombreProducto("Computador portatil");
		prd.setNumeroUnidades(50);
		prd.setPrecioUnidad(1200000);
		
		prd2.setNumeroElemento(2);
		prd2.setNombreProducto("Mesa computo");
		prd2.setNumeroUnidades(20);
		prd2.setPrecioUnidad(750000);
		
		Product prd3 = new Product(3, "mouse",60,70000);
		Product prd4 = new Product(3, "teclado",20,170000);
		Product prd5 = new Product(3, "portapapeles",15,70000);
		Product prd6 = new Product(3, "usb",160,85000);
		
		
	}

}
