* Descripció - Enunciat de l'exercici

Nivell 1

Exercici 1

En un grup de música, hi ha instruments de vent, de corda i de percussió, cadascun amb atributs com el nom i el preu. Tots comparteixen un mètode anomenat tocar(), que és abstracte a la classe base i s’ha d’implementar a les subclasses. Aquest mètode mostra per consola un missatge diferent segons el tipus d’instrument que s’estigui tocant. El procés de càrrega d’una classe es produeix una sola vegada, fet que es pot demostrar mitjançant la creació de la primera instància de la classe o accedint a un membre estàtic d’aquesta.

Exercici 2

El model estàtic representa atributs o mètodes que pertanyen a la classe i no a les instàncies, compartint-se entre totes elles, mentre que la potència final indica una constant que no es pot modificar després de ser inicialitzada. Els atributs no estàtics són específics de cada instància i poden tenir valors diferents per objecte, a diferència dels estàtics que mantenen un valor comú. Els atributs estàtics no poden ser inicialitzats al constructor perquè aquest treballa amb instàncies individuals, però els no estàtics i els finals no estàtics sí que poden ser-ho.
Per implementar un exemple, s’afegeixen dos mètodes a la classe "Cotxe". El mètode estàtic frenar() mostra "El vehicle està frenant" i el mètode no estàtic accelerar() mostra "El vehicle està accelerant". Per invocar-los, des del main() es pot cridar al mètode estàtic directament amb el nom de la classe i, per al mètode no estàtic, cal crear una instància de la classe.

Nivell 2

Exercici 1

Es planteja crear una classe anomenada Telèfon amb els atributs marca i model, i un mètode trucar() que rep un número de telèfon com a paràmetre i mostra per consola que s’està trucant al número indicat. També es defineixen dues interfícies: Camera, amb el mètode fotografiar(), que indica que s’està fent una foto, i Rellotge, amb el mètode alarma(), que mostra que està sonant l’alarma.
La classe Smartphone es defineix com una subclasse de Telèfon que implementa les interfícies Camera i Rellotge, integrant tots aquests comportaments. Finalment, al main() de l’aplicació es crea un objecte de tipus Smartphone i es fan servir els mètodes de trucar, fotografiar i activar l’alarma.

Nivell 3

Exercici 1

En una redacció esportiva, les notícies es classifiquen per esports com futbol, bàsquet, tenis, F1 i motociclisme. Cada redactor té atributs com el nom, DNI i sou, essent el DNI immutable i el sou fixat inicialment a 1500 € per a tots, amb possibilitat d'increments generals en el futur. Els redactors poden gestionar diverses notícies, que inclouen un titular, text inicialment buit, puntuació i preu, amb mètodes específics per calcular aquests dos últims valors.
Les notícies tenen detalls particulars segons l’esport. Per exemple, les de futbol inclouen informació sobre competicions, clubs i jugadors, mentre que les de bàsquet, tenis, F1 i motociclisme registren dades específiques com competicions, escuderies o equips. El preu i la puntuació de cada notícia es calculen segons criteris predeterminats que valoren elements com competicions importants, equips destacats o esportistes famosos, augmentant la rellevància i el valor de la notícia en funció d’aquests factors.

A continuació s’explica com calcular el preu de cada notícia:

Notícies de futbol: 

Preu inicial: 300 €
Lliga de Campions: 100 €
Barça o Madrid: 100 €
Ferran Torres o Benzema: 50 €

Preu inicial: 250 €
Eurolliga: 75 €
Barça o Madrid: 75 €

Notícies de tenis:

Preu inicial: 150 € 
Federer, Nadal o Djokovic: 100 €

Notícies d'F1:

Preu inicial: 100 €
Ferrari o Mercedes: 50 €

Notícies de motociclisme:

Preu inicial: 100 €
Honda o Yamaha: 50 €

Per calcular les puntuacions de les notícies se segueixen els següents criteris:

Notícies de futbol:

5 Punts.
Lliga de Campions: 3 punts
Lliga: 2 punts
Barça o Madrid: 1 punt
Ferran Torres o Benzema: 1 punt

Notícies de bàsquet:

4 punts
Eurolliga: 3 punts
ACB: 2 punts
Barça o Madrid: 1 punt

Notícies de Tenis:

4 punts
Federer, Nadal o Djokovic: 3 punts

Notícies F1:

4 punts
Ferrari o Mercedes: 2 punts

Notícies de Motociclisme:

3 punts
Honda o Yamaha: 3 punts

A la classe principal s’ha de fer un menú amb les següents opcions:

1.- Introduir redactor.

2.- Eliminar redactor.

3.- Introduir notícia a un redactor.

4.- Eliminar notícia (ha de demanar redactor i titular de la notícia).

5.- Mostrar totes les notícies per redactor.

6.- Calcular puntuació de la notícia.

7.- Calcular preu-notícia.


* Tecnologies Utilitzades

IntelliJ, Git and GitHub


* Requisits

Nothing


* Instal·lació

Nothing


* Execució

Nothing


* Desplegament

Nothing


-Contribucions

Nothing
