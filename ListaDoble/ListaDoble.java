public class ListaDoble{

	Node topForward;
	Node topBackward;

	//Métodos para los casos de inserción de nodos
	public boolean insertaPrimerNodo(String dato){
		if (topForward == null) { //La lista está vacía
			topForward = new Node();
			topForward.name = dato;
			topForward.previous = null;
			topForward.next = null;
			
			topBackward = topForward;

			return true;
		}
		else {
			return false;
		}
	}
	
	public void imprimir(){
		System.out.print("[X]"); 

		for (Node temp = this.topForward; temp != null; temp = temp.next){
			System.out.print(" <- [ " + temp.name + " ] -> ");
		}

		System.out.print("[X]\n"); 
	}
	
	public String toString(){
		String cadAux = "[X]";
		for (Node temp = this.topForward; temp != null; temp = temp.next){
			cadAux += " <- [ " + temp.name + " ] -> ";
		}

		cadAux += "[X]\n"; 

		return cadAux;
	}

	public void insertaAntesPrimerNodo(String nombre){
		Node temp; 
		temp = new Node ();
		temp.name = nombre;
		temp.next = this.topForward;
		this.topForward.previous = temp;
		this.topForward = temp;
		temp = null;
	}

	public void insertaAlFinal(String nombre){
		Node temp = new Node ();
		temp.name = nombre;
		temp.next = null;
		
		temp.previous = this.topBackward;
		this.topBackward.next = temp;
		this.topBackward = temp;
		temp = null;
	}

	public boolean insertaEntreNodos(String nombre, String buscado){
		Node temp = new Node();
		temp.name = nombre;
		Node temp2 = this.topForward;

		//boolean NodoNoEncontrado = true;

		while ( (temp2 != null) 
				&& temp2.name.equals(buscado) == false ) {	
		         temp2 = temp2.next;
		}

		if (temp2 != null){  //Nodo buscado se encontró
			temp.next = temp2.next;
			temp2.next = temp;

			temp.previous = temp2;
			temp.next.previous = temp;

			temp = null;
			temp2 = null;
			
			return true;
		}
		else return false;
	} 
	
	//Métodos de borrado
	public void borrarPrimerNodo(){
		this.topForward = this.topForward.next;
		this.topForward.previous.next = null;
		this.topForward.previous = null;
	}

	public void borrarUltimoNodo(){
		this.topBackward = this.topBackward.previous;
		this.topBackward.next.previous = null;
		this.topBackward.next = null;
	}

	
	//Borrar cualquier nodo que no sea el primero
	public boolean borrarCualquierNodo(String buscado){
		Node temp = this.topForward;

		while ( (temp != null) 
				&& temp.name.equals(buscado) == false ) {	
		         temp = temp.next;
		}

		if (temp != null){  //Nodo buscado se encontró
			temp.next = temp.next.next;
			temp.next.previous.previous = null;
			temp.next.previous.next = null;
			temp.next.previous = temp;
			temp = null;
			
			return true;
		}
		else return false;
	}

	//TODO: Crear el método para borrar el nodo buscado
	//Adecuación del método de borrado: borrarCualquierNodo()

	//Enumerar nodos
	public void enumerarNodos(){
		Node temp = this.topForward;

		int enu = 0;

		while (temp != null) {
			System.out.println(enu + " = " + temp.name + " ");
			enu = enu + 1;
			temp = temp.next;
		}
		System.out.println();

		temp = null;
	}

	//Insertar nodo antes del último
	public void insertarAntesUltimo(String nombre) {
        Node temp = new Node();
		temp.name = nombre;

        if (this.topForward == null) {
            this.topForward = temp;
        }
		else {
            Node temp2 = this.topForward;
            while (temp2.next != null && temp2.next.next != null) {
                temp2 = temp2.next;
            }

            temp.previous = temp2;
            temp.next = temp2.next;
            temp2.next = temp;

            if (temp.next != null) {
                temp.next.previous = temp;
            }
			temp2 = null;
        }
		temp = null;
    }

	//Intercambiar Nodos
	public void intercambiarNodos(String x, String y) {
		if (x == y){
			return;
        }
        if (x == null || y == null) {
            return;
        }

        // Buscar los nodos con los datos proporcionados
		Node temp = this.topForward;
		Node tempx = null;
		Node tempy = null;

		//Buscando nodos proporcionados
        while (temp != null) {
			//Buscando Nodo x
            if (temp.name == x) {
                tempx = temp;
            }
			//Buscando Nodo y
			else if (temp.name == y) {
                tempy = temp;
            }
            temp = temp.next;
        }

		//Intercambiar Nodos
        if (tempx.previous != null) {
            tempx.previous.next = tempy;
        }
		else {
            this.topForward = tempy;
        }

        if (tempy.previous != null) {
            tempy.previous.next = tempx;
        }
		else{
            this.topForward = tempx;
        }

        Node tempPrevious = tempx.previous;
        tempx.previous = tempy.previous;
        tempy.previous = tempPrevious;

        Node tempNext = tempx.next;
        tempx.next = tempy.next;
        tempy.next = tempNext;

		temp = null;
		tempx = null;
		tempy = null;
		tempPrevious = null;
		tempNext = null;
	}

}













