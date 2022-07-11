class SinoTibetan extends Language {
  
  public SinoTibetan(String langName, int speakers){
    super(langName, speakers, "Asia", "subject-object-verb");
    if (langName.contains("Chinese")) {
      this.wordOrder = "subject-verb-object";
    }
  }

  
}
