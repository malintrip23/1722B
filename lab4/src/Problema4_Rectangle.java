
 public class Problema4_Rectangle {
    private int width;
    private int length;

    public int aria(){
        return width*length;
    }

    public int perimetru(){
        return ((2*width)+(2*length));
    }

    public Problema4_Rectangle(int width, int length){
        this.width=width;
        this.length=length;
    }

    public int getWidth(){
        return width;
    }

    public void setWidth(){
        this.width=width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(){
        this.length=length;
    }

 }
