
public class Main {
    public static void main(String[] args) {
    Auto auto1 = new Auto(2000,"NB676CJ","Fiat","Punto");

        int cylinderCap = auto1.getCylinderCap();
        String licensePlate = auto1.getLicensePlate();
        String brand = auto1.getBrand();
        String model = auto1.getModel();
        // Invocazione di tutti i getter dell'oggetto
        // precedentemente inizializzato tramite costruttore.


        System.out.println("Cilindrata: " + cylinderCap);
        System.out.println("Targa: " + licensePlate);
        System.out.println("Produttore: " + brand);
        System.out.println("Modello: " + model);
        // Stampa dimostrativa dei valori assegnati alle singole
        // variabili tramite invocazione dei getter.

        auto1.setCylinderCap(3000);
        auto1.setLicensePlate("CJ575CJ");
        auto1.setBrand("Toyota");
        auto1.setModel("Corolla");
        // Invocazione dimostrativa dei setter per la modifica dei
        // singoli valori assegnati alle proprietà dell'oggetto.

        cylinderCap = auto1.getCylinderCap();
        licensePlate = auto1.getLicensePlate();
        brand = auto1.getBrand();
        model = auto1.getModel();
        // Nuova invocazione di tutti i getter dell'oggetto
        // a scopo dimostrativo a seguito della riassegnazione dei valori
        // dell'oggetto tramite setter.

        System.out.println(" ");

        System.out.println("Cilindrata: " + cylinderCap);
        System.out.println("Targa: " + licensePlate);
        System.out.println("Produttore: " + brand);
        System.out.println("Modello: " + model);
        // Stampa dimostrativa dei valori assegnati tramite getter
        // per dimostrare l'avvenuta modifica dei valori assegnati
        // all'oggetto.

    }

    // Si noti come il settaggio delle proprietà originarie della
    // classe come private impedisca l'accesso alle medesime se non
    // tramite gli appositi metodi costruttori, getter e setter.

}