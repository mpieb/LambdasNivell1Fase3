package lambdasNivell1Fase3;

 public class ReversingFactory {
    
    public void factory() {
    
    /* Injecta a la interficie creada mitjançant una lambda el cos de mètode,
       de manera que retorna la mateixa cadena que rep com a paràmetre però
       a l´inreves
    */
    Reversing String = (str) -> {
			return new StringBuilder(str).reverse().toString();
		};
		System.out.println("String a l´inreves: " + String.reverse("Barcelona"));
    }

}

