import java.io.IOException;
import java.util.Scanner;

/**@
 *
 */
public class View{
  private static Processor processor = new Processor();
  private static Scanner in = new Scanner(System.in);

    /**@
     *
     * @param args
     */
  public static void main (String[] args){
      while(true){
          int input = displayMenu();
          if(input == 1){
              Answer opt = processor.callOptimalSolution();
              for (int i = 0; i < opt.getResults().length; i++) {
                  System.out.println("\nSet "+(i+1)+": "+opt.getResults()[i]+"\n");
              }
              System.out.println("\n\nArithmetic Mean: "+opt.getAverage()+"\n" +
                      "Standard Deviation: "+opt.getStdDeviation());
              continue;

          }
          else if(input == (2)){
              Answer subOpt = processor.callSubOptimalSolution();
              for (int i = 0; i < subOpt.getResults().length; i++) {
                  System.out.println("\nSet "+(i+1)+": "+subOpt.getResults()[i]+"\n");
              }
              System.out.println("\n\nArithmetic Mean: "+subOpt.getAverage()+"\n" +
                      "Standard Deviation: "+subOpt.getStdDeviation()+"\n");
              continue;
          }
          else if(input == (3)){
              try{
                processor.callExportIntervals();
                  System.out.println("The files were exported successfully!");
              }catch (IOException e){
                  System.out.println("An error occurred. Please, try again.\n\n" +
                          "System error: "+e.getMessage());
              }
              continue;
          }
          else if(input == (4)){
              System.out.println("\nThis software was developed to explore the greedy algorithms concepts, during the studies of this\n" +
                      "technique in the Software Engineering bachelor degree course at Pontifícia Universidade Católica do Rio Grande do Sul (PUCRS).\n" +
                      "It is, as well, part of the Advanced Algorithms discipline assignments.\n\n" +
                      "Find more about this software at its Github repo: \n\n" +
                      "Find more about the university at its official website: \n\n\n" +
                      "Contacts\n\n" +
                      "Student: Guilherme de Oliveira Munaretto <guilherme.munaretto@acad.pucrs.br>\n" +
                      "Professor: Diego Vrague Noble <diego.noble@pucrs.br>");
              continue;
          }
          else if(input == (0)){
              System.exit(0);
          }
          else{
              System.out.println("Invalid input. Please, type numbers between 0 and 4.");
              continue;
          }
      }

  }

    /**@
     *
     * @return
     */
  private static int displayMenu(){

      System.out.print("----------------------- Welcome to the Greedy Algorithms explorer -----------------------\n\n" +
              "Please, select one of the following options:\n\n" +
              "[1] - Execute optimal algorithm solution\n" +
              "[2] - Execute sub-optimal algorithm solution\n" +
              "[3] - Export generated interval set to a file\n" +
              "[4] - About the software\n" +
              "[0] - Exit\n\n" +
              "Your input: ");
      return in.nextInt();
  }

}
