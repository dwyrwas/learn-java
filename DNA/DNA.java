public class DNA {
  //Program that determines if protein in DNA strand
  public static void main(String[] args) {
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    String dna = dna1;
    // Find length of the DNA and print it
    int length = dna.length();
    System.out.println(length);
    int dnaStart = dna.indexOf("ATG");
    int dnaEnd = dna.indexOf("TGA");
    if (dnaStart >=  0 && dnaEnd >= 0 && dnaEnd - dnaStart % 3 == 0){
      String protein = dna.substring(dnaStart, dnaEnd + 3);
      System.out.println(protein);
    } else {
      System.out.println("No protein found.");
    }
  }
}
