public class QDemo {

  public static void main(String[] args) {
    Queue bigQ = new Queue(100);
    Queue smallQ = new Queue(25);
    char ch;
    int i;

    System.out.println("Using bigQ to store the alphabet.");
    //put some numbers into bigQ
    for(i=0; i<26;i++) {
      bigQ.put((char) ( 'A' + i));
    }
    //retrieve and display elements from bigQ
    System.out.println("Contents of bigQ: ");
    for (i=0; i < 26; i++) {
      ch = bigQ.get();
      if(ch != (char) 0) {
        System.out.print(ch);
      }
    } System.out.println("\n");

    System.out.println("Using smallQ to generate errors.");
    //Now, use smallQ to generate some errors
    for(i=0; i<26; i++) {
      System.out.print("Attempting to store " + (char) ('Z'-i));

      smallQ.put((char) ('Z' - i));

      System.out.println();
    }
    System.out.println();

    //more errors on smallQ
    System.out.println("Contents of smallQ: ");
    for (i=0; i<26; i++) {
      ch = smallQ.get();

      if ( ch != (char) 0) {
        System.out.print(ch);
      }
    }
  }
}