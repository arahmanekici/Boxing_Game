public class Main {
    public static void main(String[] args) {
      Fighter mcgregor = new Fighter("Mcgregor" , 15 , 100, 90, 0);
      Fighter khabib = new Fighter("Khabib" , 10 , 95, 100, 0);
      Ring r = new Ring(mcgregor,khabib , 90 , 100);
      r.run();
    }
}
