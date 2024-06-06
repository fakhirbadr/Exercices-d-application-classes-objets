public class Compte {
    private String numero;
    private double solde;
    private static int nbComptes = 0;

    public Compte() {
        this.numero = "";
        this.solde = 0.0;
        nbComptes++;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void deposer(double montant) {
        this.solde += montant;
        System.out.println("Dépôt de " + montant + " effectué. Nouveau solde : " + this.solde);
    }

    public void retirer(double montant) {
        if (montant <= this.solde) {
            this.solde -= montant;
            System.out.println("Retrait de " + montant + " effectué. Nouveau solde : " + this.solde);
        } else {
            System.out.println("Solde insuffisant pour effectuer le retrait de " + montant);
        }
    }

    public void afficherCompteInfo() {
        System.out.println("Numéro de compte : " + this.numero);
        System.out.println("Solde actuel : " + this.solde);
    }

    public static void afficherNbComptes() {
        System.out.println("Nombre de comptes créés : " + nbComptes);
    }

    public static void main(String[] args) {
        Compte compte1 = new Compte();
        compte1.setNumero("12345");
        compte1.deposer(1000);
        compte1.retirer(500);
        compte1.afficherCompteInfo();

        Compte compte2 = new Compte();
        compte2.setNumero("54321");
        compte2.deposer(2000);
        compte2.retirer(2500); // Ce retrait ne sera pas autorisé
        compte2.afficherCompteInfo();

        Compte.afficherNbComptes();
    }
}
