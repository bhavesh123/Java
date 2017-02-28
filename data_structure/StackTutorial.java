/**
 *
 * @author Bhavesh Gadoya
 * @Description : Usage of stacks to solve manager problem with serving packages to customer from chef 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class stackPracts{
    Stack<Integer> data = new Stack();
    public String pop(){
        if(data.isEmpty()){
        return "NO FOOD";
        }
        int k = data.pop();
        return k+"";
    }
    
    public void push(int i){
    data.push(i);
    }
    

}
public class StackTutorial {
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
    String line = br.readLine();
    int input = Integer.parseInt(line);
    String[] inputs = new String[input];
    for(int i=0;i<input;i++){
    inputs[i] = br.readLine();
        }
    stackPracts obj = new stackPracts();
    for(int k=0;k<inputs.length;k++){
    String[] splitdata = inputs[k].split(" ");
    if(Integer.parseInt(splitdata[0])==1){
        System.out.println(obj.pop());
      }
    else if(Integer.parseInt(splitdata[0])==2){
        int value = Integer.parseInt(splitdata[1]);
        obj.push(value);
     }
    }
    }
    
}
