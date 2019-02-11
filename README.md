Contestar les següents preguntes amb les explicacions adients i ficant exemples. No es tindran en compte respostes monosíl.làbiques o sense un raonament o explicació.

## 1 Bases de dades d’objectes relacionals

L’objectiu d’aquesta activitat és conèixer els conceptes i les idees bàsiques de les bases de Dades d’objectes relacionals.


1. Quins són els conceptes principals de les BDOR?

   - **Tipus de dades abstractes**

   - **Encapsulació**:és l’ocultació de les dades d’un objecte de manera que només es poden modificar mitjançant les operacions definides per aquest objecte

   - **Herència**:és la relació entre un tipus objecte general i un altre de més especific

   - **Polimorfisme**:fa referència a la sobreescriptura de mètodes a l’hora d’im-plementar un tipus objecte utilitzant l’herència.

2. Quina és la idea bàsica de les BDOR?

- Base de dades que ha evolucionat des del model relacional cap a una altra (híbrida) més amplia que incorpora conceptes del paradigma orientat a objectes.


## 2 Model orientat a objectes

L’objectiu d’aquesta activitat és conèixer les característiques bàsiques dels models orientats a objectes.

Indiqueu quines diferències hi ha entre:


1. Encapsulació i herència
   - La diferencia es que l'encapsulacio, es fa per a l'ocultacio de les dades, o que no se puguin modificar, en canvi l'herencia es un tipus d'objecte genreral, del qual es poden fer objectes associats mes especifics, pero que contenen les dades d'aquest general tambe.
2. Polimorfisme i sobrecàrrega
   - La sobrecàrrega és la característica que permet tenir, en un mateix tipus objecte, diferents mètodes amb el mateix nom, mentre que la sobreescriptura (polimorfis- me) és la característica que permet canviar la implementació d’un mètode, heretat del tipus objecte base, en el tipus objecte derivat.

## 3 Model orientat a objectes II

Identifiqueu els objectes, els tipus d’objecte, els atributs i els mètodes de la descripció següent:

L’Arnau es dirigeix al banc per obrir un nou compte corrent. L’encarregat li explica que la informació que podrà consultar per Internet és el número de compte, el nom del titular, el saldo i l’interès. També li comenta que podrà gestionar ingressos i fer transferències. Finalment, obre dos comptes, un d’estalvi i un d’habitatge.

```java
package ex3_EAF3;

public class Estalvi {
	
	private String numeroCompte = "";
	private String nomTitular = "";
	private float saldo = 0;
	private float interes = 0;
	
	public Estalvi(String numeroCompte, String nomTitular, float saldo, float interes) {
		super();
		this.numeroCompte = numeroCompte;
		this.nomTitular = nomTitular;
		this.saldo = saldo;
		this.interes = interes;
	}

	public void ingres(float importe) {
		this.saldo = saldo+importe;
	}
	
	public void transferencia(float importe) {
		this.saldo = saldo-importe;
		
	}

	// GETTERS && SETTERS
	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public String getNomTitular() {
		return nomTitular;
	}

	public void setNomTitular(String nomTitular) {
		this.nomTitular = nomTitular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getInteres() {
		return interes;
	}

	public void setInteres(float interes) {
		this.interes = interes;
	}

}

```

```java
package ex3_EAF3;

public class Habitatge{

	private String numeroCompte = "";
	private String nomTitular = "";
	private float saldo = 0;
	private float interes = 0;
	
	public Habitatge(String numeroCompte, String nomTitular, float saldo, float interes) {
		super();
		this.numeroCompte = numeroCompte;
		this.nomTitular = nomTitular;
		this.saldo = saldo;
		this.interes = interes;
	}

	public void ingres(float importe) {
		this.saldo = saldo+importe;
	}
	
	public void transferencia(float importe) {
		this.saldo = saldo-importe;
		
	}

	// GETTERS && SETTERS
	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public String getNomTitular() {
		return nomTitular;
	}

	public void setNomTitular(String nomTitular) {
		this.nomTitular = nomTitular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getInteres() {
		return interes;
	}

	public void setInteres(float interes) {
		this.interes = interes;
	}
}

```

Podeu implementar-lo en llenguatge Java.

## 4 Tipus d’objecte

L’objectiu d’aquesta activitat és conèixer la sintaxi i les clàusules per a la creació de tipus de dades.

La informació que s’ha d’emmagatzemar és la següent:

```
BASKET_PLAYER ( nom, alçada, pes, posicio, equip);
```


1. Creeu un tipus de dades compost per emmagatzemar les dades d’un jugador.

   ```plsql
   CREATE TYPE T_BASKET_PLAYER AS (
   
       nom VARCHAR(20),
       alcada NUMERIC(4,2),
       pes NUMERIC(4,2),
       posicio SMALLINT,
       equip VARCHAR(20)
   
   );
   ```

2. Creeu una taula TEAM que emmagatzemi objectes de tipus jugador.

   ```plsql
   CREATE TABLE TEAM (
   
       id INTEGER PRIMARY KEY,
       jugador T_BASKET_PLAYER
   
   );
   ```

3. Mostreu diferents insercions a la taula i mostrar com utilitzeu el tipus i la taula.

   *Insercions*

   ```plsql
   INSERT INTO TEAM VALUES(1,ROW('dani',1.75,75.00,3,'Gerb.c.b'));
   INSERT INTO TEAM VALUES(2,ROW('pep',1.95,95.00,4,'Gerb.c.b'));
   INSERT INTO TEAM VALUES(3,ROW('joan',1.55,55.00,1,'Gerb.c.b'));
   INSERT INTO TEAM VALUES(4,ROW('aurelio',2.05,85.00,5,'Gerb.c.b'));
   ```

*Select*

```plsql
select * from team;


SELECT (jugador).nom
	FROM public.team;
	
SELECT (jugador).nom
	FROM public.team
	WHERE (jugador).posicio = 5 ;
```



## 5 Taula d’objectes

L’objectiu d’aquesta activitat és conèixer la sintaxi i les clàusules per crear tipus de dades, i incorporar aquests tipus a la creació de taules.




La informació que s’ha d’emmagatzemar és la següent:

```
CLIENT(cli_num, cli_nom, carrer, ciutat, cod_pos, tel);
```

```plsql
COMANDA (ord_num, cli_num, carr_ent, ciu_ent, codp_ent);
```


Feu les tasques següents:


1. Creeu un tipus de dades compost per emmagatzemar les dades de l’adreça d’una comanda.

   ```plsql
   CREATE TYPE T_COMANDA AS(
   	
   	ord_num integer,
   	cli_num integer,
   	carr_ent integer,
   	ciu_ent character varying(20),
   	codp_ent integer
   	
   );
   ```

2. Creeu un tipus de dades compost per emmagatzemar les dades d’un client.

   ```plsql
   CREATE TYPE T_CLIENT AS(
   
   	cli_num integer,
   	cli_nom character varying(20),
   	carrer character varying(20),
   	ciutat character varying(20),
   	cod_pos integer,
   	tel integer
   	
   );
   ```

3. Creeu una taula clients que emmagatzemi objectes de tipus client i indiqueu que el camp número de client serà l’identificador (clau primària).

   ```plsql
   CREATE TABLE CLIENT(
   	numero_client INTEGER PRIMARY KEY,
   	client t_client
    );
   
   insert into client values(1,row(1,'dani','almata n5','balaguer',25617,699780294));
   ```

4. Creeu una taula comandes. Utilitzeu el tipus adreça creat anteriorment i indiqueu que el camp número d’ordre serà l’identificador. Com es modificarà el codi si utilitzem OID?

   ```plsql
   CREATE TABLE COMANDES(
   	cli_num SERIAL PRIMARY KEY,
   	comanda t_comanda
    );
    
    insert into comandes values(DEFAULT,row(1,1,5,'balaguer',25617));
   ```

5. Mostreu diferents insercions a les diferents taules i mostrar com utilitzeu el diferents tipus i taules.

   > Ja he anat mostrant com feia les insecrions en cada exercici.
