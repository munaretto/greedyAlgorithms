public class View{
  private static Processor processor = new Processor();

  public static void main (String[] args){
      String optimal = processor.callOptimalSolution();
      String suboptimal = processor.callSubOptimalSolution();
      String[] auxOptimal = optimal.split(";");
      String[] auxSubOptimal = optimal.split(";");
      System.out.println("Average: "+auxOptimal[0]+" | Standard Deviation: "+auxOptimal[1]+"\n" +
              "------------------------------------------- ----------------------------------------------"+"\n"+
              "Average: "+auxSubOptimal[0]+" | Standard Deviation: "+ auxSubOptimal[1]);
  }

  private void displayMenu(){

  }
}
