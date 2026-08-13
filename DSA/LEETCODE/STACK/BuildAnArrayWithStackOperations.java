package DSA.LEETCODE.STACK;

import java.util.ArrayList;
import java.util.List;

public class BuildAnArrayWithStackOperations {
      public List<String> buildArray(int[] target, int n) {

          List<String>  operation = new ArrayList<>();

          int i = 1;
          for(int num : target){
              while (i < num){
                  operation.add("Push");
                  operation.add("Pop");
                  i++;
              }
              operation.add("Push");
              i++;
          }
          return operation;
    }
}
