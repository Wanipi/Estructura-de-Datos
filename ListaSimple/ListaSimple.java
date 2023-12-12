public class ListaSimple{
	Node top;

	//Métodos para los casos de inserción de nodos
	public boolean insertaPrimerNodo(String dato){
		if (top == null) { //La lista no está vacía
			top = new Node();
			top.name = dato;
			top.next = null;

			return true;
		}
		else {
			return false;
		}
	}

	public void insertaAntesPrimerNodo(String nombre){
		Node temp; 
		temp = new Node ();
		temp.name = nombre;
		temp.next = this.top;
		this.top = temp;
		temp = null;
	}

	public void insertaAlFinal(String nombre){
		Node temp = new Node ();
		temp.name = nombre;
		temp.next = null;
		//Node temp2;
		Node temp2 = this.top;

		while (temp2.next != null)
			temp2 = temp2.next;

		temp2.next = temp;
		temp = null;
		temp2 = null;
	}

	public boolean insertaEntreNodos(String nombre, String buscado){
		Node temp = new Node();
		temp.name = nombre;
		Node temp2 = this.top;

		//boolean NodoNoEncontrado = true;

		while ( (temp2 != null) 
				&& temp2.name.equals(buscado) == false ) {	
		         temp2 = temp2.next;
		}

		if (temp2 != null){  //Nodo buscado se encontró
			temp.next = temp2.next;
			temp2.next = temp;
			temp = null;
			temp2 = null;
			return true;
		}
		else return false;
	} 

	public void imprimir(){
		for (Node temp = this.top; temp != null; temp = temp.next){
			System.out.print("[ " + temp.name + " ] -> ");
		}

		System.out.print("[X]\n"); 
	}

	public String toString(){
		String cadAux = "";
		for (Node temp = this.top; temp != null; temp = temp.next){
			cadAux += "[ " + temp.name + " ] -> ";
		}

		cadAux += "[X]\n"; 

		return cadAux;
	}

	
	//Métodos de borrado
	public void borrarPrimerNodo(){
		this.top = this.top.next;
	}

	//Borrar cualquier nodo que no sea el primero
	public boolean borrarCualquierNodo(String buscado){
		Node temp = this.top;

		while ( (temp != null) 
				&& temp.name.equals(buscado) == false ) {	
		         temp = temp.next;
		}

		if (temp != null){  //Nodo buscado se encontró
			temp.next = temp.next.next;
			temp = null;
			
			return true;
		}
		else return false;
	}

	//Enumerar nodos
	public void enumerarNodos(){
		Node temp = this.top;

		int enu = 0;

		while (temp != null) {
			System.out.println(enu + " = " + temp.name + " ");
			enu = enu + 1;
			temp = temp.next;
		}
		System.out.println();
	}

	//Insertar nodo antes del último
	public void insertarAntesUltimo(String nombre){
		Node temp = new Node();
		temp.name = nombre;

			Node temp2 = this.top;
			while (temp2.next != null && temp2.next.next != null) {
				temp2 = temp2.next;
			}
			temp.next = temp2.next;
			temp2.next = temp;

			temp=null;
			temp2=null;
	}

	//Intercambiar nodos
	public void intercambiarNodos(String x, String y){
		if(x == y){
			return;
		}
		if (x == null || y == null) {
			return;
		}
		//Buscando variable: x
		Node tempx = null;
		Node tempx2 = this.top;
		while (tempx2 != null && tempx2.name != x) {
			tempx = tempx2;
			tempx2 = tempx2.next;
		}

		//Buscando variable: y
		Node tempy = null;
		Node tempy2 = this.top;
		while (tempy2 != null && tempy2.name != y) {
			tempy = tempy2;
			tempy2 = tempy2.next;
		}

		//Si x no es la raíz de la lista
		if (tempx != null) {
			tempx.next = tempy2;
		}
		else{ //Hacer x la raíz
			this.top = tempy2;
		}

		//Si y no es la raíz de la lista
		if (tempy != null) {
			tempy.next = tempx2;
		}
		else{ //Hacer y la raíz
			this.top = tempx2;
		}

		//Intercambiar apuntadoress
		Node temp = tempx2.next;
		tempx2.next = tempy2.next;
		tempy2.next = temp;

		//Eliminar nodo temporales
		tempx = null;
		tempx2 = null;
		tempy = null;
		tempy2 = null;
		temp = null;
		
	}

}













