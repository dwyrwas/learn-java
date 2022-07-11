class Language {
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  public Language( String langName, int langNumSpeakers, String langRegionsSpoken, String langWordOrder){
    this.name = langName;
    this.numSpeakers = langNumSpeakers;
    this.regionsSpoken = langRegionsSpoken;
    this.wordOrder = langWordOrder;
  }

  public void getInfo(){
    System.out.println(this.name + " is spoken by ");
    System.out.println(this.numSpeakers + " people mainly in ");
    System.out.println(this.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + this.wordOrder+ ".");
  }

  public static void main(String[] args){
    Language myLanguage = new Language("Spanish", 55500000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
    myLanguage.getInfo();
    Language Kiche = new Mayan("Ki'che'", 2330000);
    Kiche.getInfo();
    Language Chinese = new SinoTibetan("Chinese", 1000000000);
    Language Burmese = new SinoTibetan("Burmese", 10000000);
    Chinese.getInfo();
    Burmese.getInfo();
  }
}
