
package reino.animal;

public abstract class Mamifero extends Animal 
{
    Mamifero cachorro = new Mamifero("Cachorro");
    Cachorro.QuatroPatas();
    Cachorro.Carnivoro();
    
    Mamifero tartaruga = new Mamifero("Tartaruga");
    Tartaruga.Nadar();
    Tartaruga.QuatroPatas();
    Tartaruga.Herbivoros();
            
    Mamifero lagarto = new Mamifero("Lagarto");
    Lagarto.QuatroPatas();
    Lagarto.Carnivoro();
            
    Mamifero elefante = new Mamifero("Elefante");
    Elefante.Herbivoros();
    Elefante.QuatroPatas();
             
    Mamifero morcego = new Mamifero("Morcego");
    Morcego.Voar();      
    Morcego.Onivoro();
             
    Mamifero  = new Mamifero("Sapo");
    Sapo.Nadar();
    
    Mamifero orca = new Mamifero("Orca");
    Orca.Carnivoro();
    Orca.Nadar();
}
