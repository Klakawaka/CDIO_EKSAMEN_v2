public class Dice {
    private final int MAX = 6;
    private int faceValue;


    public Dice(){
        faceValue = 1;
    }

    public int roll(){
        faceValue = (int) (Math.random() * MAX)+1;
        return faceValue;
    }

    public void setFaceValue(int Value) {
        faceValue = Value;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public String toString(){
        String result = Integer.toString(faceValue);
        return result;
    }
}
