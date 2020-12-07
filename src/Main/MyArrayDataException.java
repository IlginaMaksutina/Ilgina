package Main;

public class MyArrayDataException extends Throwable {
    public int i;
    public int j;

    public MyArrayDataException(int i, int j) {
       this.i=i;
        this.j=j;
    }
}
