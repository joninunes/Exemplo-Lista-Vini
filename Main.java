class Main {
  public static void main(String[] args) {

    int option;

    Menu();
    Salesman();
  }

  public static void Salesman() {
    String[] salesman = new String[5];
    salesman[0] = "Shaq Santos";
    salesman[1] = "Doreen Morris";
    salesman[2] = "Dina Landi";
    salesman[3] = "Rableen Smith";
    salesman[4] = "Deborah Sims";

    for (int i = 0; i <= 4; i++) {
      System.out.println(salesman[i]);
    }

  }

  public static void Menu() {
    System.out.println("Welcome to PSA Poseidon System Sales");
    System.out.println("----------");
    System.out.println("Enter your options, 1 for Sales, 2 to View Sales Table, 3 to exit!");
  }
}