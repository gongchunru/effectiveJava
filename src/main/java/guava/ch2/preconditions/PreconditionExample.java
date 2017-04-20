package guava.ch2.preconditions;

import static com.google.common.base.Preconditions.*;
/**
 * Created by gongchunru
 * Date：2017/4/20.
 * Time：18:29
 */
public class PreconditionExample {
    private String state;
    private int[] values = new int[5];
    private int currentIndex;

    public PreconditionExample(String state){
        this.state = checkNotNull(state,"Label can't be null");
    }


    public void updateCurrentIndexValue(int index, int valueToSet){
        this.currentIndex = checkElementIndex(index,values.length,"Index out of bounds for values");
        checkArgument(valueToSet <= 100,"Value can't be more than 100");
        values[this.currentIndex] = valueToSet;
    }


    public void doOperation(){
        checkState(validateObjectState());
    }

    private boolean validateObjectState(){
        return this.state.equalsIgnoreCase("open") && values[this.currentIndex] == 10;
    }



}
