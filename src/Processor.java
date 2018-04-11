import java.util.TreeSet;

public class Processor{
  public static void main(String[] args){
      IntervalGenerator gen = new IntervalGenerator();
      TreeSet<Interval> ts =  gen.generateInterval();
      for(Interval i : ts){
          System.out.println("Tempo Inicial: "+i.getStartValue()+", Tempo Final: "+i.getFinalValue());
      }
  }
}
