//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//Creo un objeto de tipo persona1
Person person1 = new Person("Vani","Vega", 15);

//Muestro flexibilidad del método para recibir cualquier tipo de parámetro en cualquier orden
GenericMethods.showData(person1,35,76.9);
GenericMethods.showData(new Person("Siro", "Mantaras", 2),34,'E');
GenericMethods.showData(23.5, new Person("juana","Mia",3), "WTF???");

        }
    }
