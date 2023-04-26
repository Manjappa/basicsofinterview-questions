class TokenGeneration {
  private String TOKEN = "Generate-Random-Token";
  
  public String getTOKEN() {
    return this.TOKEN;
  }
  public void setTOKEN(String token){
    this.TOKEN = token;
  }
  
  public static void main(String[] args) {
    System.out.println("***************inside token ***********************");
    TokenGeneration token = new TokenGeneration();
    System.out.println(token);
  }
}
