class Main {
  public static void main(String[] args) {
    String[] names = {"Jason", "Name2", "Name3", "Array", "Transversal", "Name4", "Name5", "Miller"}; //elements 1-8 (index is 0-7)

    names[6] = "Jason2";

    for(int index = 0; index < names.length; index++)
    {
      System.out.println(names[index]);
    }
  }
}