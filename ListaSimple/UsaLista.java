public class UsaLista{

	public static void main(String[] args){
		ListaSimple lista = new ListaSimple();

		lista.insertaPrimerNodo("H");
		lista.insertaAntesPrimerNodo("O");
		lista.insertaAlFinal("Y");
		lista.insertaEntreNodos("R", "H");
		lista.insertaEntreNodos("M", "R");
		//lista.borrarCualquierNodo("H");
		//lista.intercarmbiarNodos("R", "Y");
		//lista.borrarPrimerNodo();
		//lista.imprimir();
		lista.insertarAntesUltimo("L");
		System.out.println("Lista antes del intercambio\n" + lista);
		lista.intercambiarNodos("O", "M");
		System.out.println("Lista despues del intercambio\n" + lista);
		lista.enumerarNodos();
	}


}