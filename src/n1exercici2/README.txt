- Exercici 2
Crea una classe "Cotxe" amb els atributs: marca, model i potència. La marca ha de ser estàtic final,
el model estàtic i la potència final. Demostra la diferència entre els tres.
N’hi ha algun que es pugui inicialitzar al constructor de la classe?

Afegeix dos mètodes a la classe "Cotxe". Un mètode estàtic anomenat frenar() i un altre no estàtic anomenat accelerar().
El mètode accelerar ha de mostrar per consola: “El vehicle està accelerant” i el mètode frenar() ha de mostrar:
“El vehicle està frenant”.

Demostra com invocar el mètode estàtic i el no estàtic des del main() de la classe principal.




 * Atributo Estatico:
 * La variable es unica para todas las instancias (objetos) de la clase (ocupa un unico lugar en memoria).
 * Si no se usa static, el sistema crea un lugar nuevo para esa variable con cada instancia
 * (la variable es diferente para cada objeto).
 * La declaracion de la constante ha de realizarse obligatoriamente en cabecera de la clase
 * Si tratamos de incorporarlo en un metodo obtendremos un error.

* Metodo Estatico:
 * Estan asociados a una clase, pero no a instancias especificas de esa clase.
 * Estos metodos no requieren un objeto de la clase como argumento de entrada.
 * Por lo tanto, puede llamarlos sin crear un objeto de la clase.

 * Atributo Final:
  * Indica que una variable es de tipo constante: no admitira cambios despues de su declaracion y asignacion de valor.
  * Ha de ser inicializada en el mismo momento de declararla.
  * Una clase final (final) es aquella que no puede tener clases que la hereden.