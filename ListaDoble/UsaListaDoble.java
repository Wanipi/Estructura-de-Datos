public class UsaListaDoble{
	
	public static void main(String[] args){
		ListaDoble lista = new ListaDoble();
		lista.insertaPrimerNodo("R");
		lista.imprimir();
		lista.insertaPrimerNodo("F");
		lista.imprimir();
		System.out.println(lista);
		lista.insertaAntesPrimerNodo("H");
		System.out.println(lista);
		lista.insertaAlFinal("Z");
		System.out.println(lista);
		lista.insertaEntreNodos("T", "R");
		System.out.println(lista);
		lista.insertaAntesPrimerNodo("K");
		System.out.println(lista);
		lista.insertaAlFinal("Ñ");
		System.out.println(lista);
		lista.borrarPrimerNodo();
		System.out.println(lista);
		lista.borrarUltimoNodo();
		System.out.println(lista);
		lista.borrarCualquierNodo("R");
		System.out.println(lista);
		lista.insertaEntreNodos("P", "H");
		System.out.println(lista);
		lista.enumerarNodos();
		lista.insertarAntesUltimo("B");
		System.out.println(lista);
		System.out.println("Lista antes del intercambio\n" + lista);
		lista.intercambiarNodos("H", "B");
		System.out.println("Lista despues del intercambio\n" + lista);
		
	}
}
























